package team6.xml_project.service.implementation;

import org.apache.commons.io.input.ReaderInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team6.xml_project.exception.SubmissionNotFoundException;
import team6.xml_project.helpers.RDFMetadataExtractor;
import team6.xml_project.helpers.XMLUnmarshaller;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.models.xml.submission.Submission;
import team6.xml_project.repository.DocumentRepository;
import team6.xml_project.repository.PaperRDFRepository;
import team6.xml_project.repository.PaperRepository;
import team6.xml_project.service.PaperRDFService;
import team6.xml_project.service.PaperService;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.nio.charset.StandardCharsets;

@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    DocumentRepository documentRepository;

    @Autowired
    PaperRepository paperRepository;

    @Autowired
    PaperRDFService paperRDFService;

    public void save(String paperXML) throws Exception {
        Paper paper = XMLUnmarshaller.createPaperFromXML(paperXML);
        InputStream rdfInputStream = createPaperRDFStreamFromXML(paperXML);

        documentRepository.save(paper, "/db/apps/papers/userId/revision1", "paper1.xml");
        paperRDFService.addPaperMetadata(rdfInputStream);
    }

    public void save(String paper, Submission submission, String documentName) {
        paperRepository.save(paper, submission, documentName);
    }

    @Override
    public boolean checkIfPaperExists(Submission submission, String documentName) throws Exception {
        return paperRepository.checkIfPaperExists(submission, documentName);
    }

    @Override
    public Paper findPaper(String collectionName, String documentName) {
        try {
            return paperRepository.get(collectionName, documentName);
        } catch (Exception e) {
            throw new SubmissionNotFoundException();
        }
    }

    private void extractRDFMetadata(InputStream in, OutputStream out) throws FileNotFoundException, TransformerException {
        RDFMetadataExtractor rdfMetadataExtractor = new RDFMetadataExtractor();
        rdfMetadataExtractor.extractMetadata(in, out);
    }

    @Override
    public String findPapersMetadataByAuthorName(String name) throws IOException {
        return paperRDFService.findPapersMetadataByAuthorName(name);
    }

    @Override
    public String findPapersMetadataByTitle(String title) throws IOException {
        return paperRDFService.findPapersMetadataByTitle(title);
    }

    @Override
    public String findPaperMetadataById(String id) throws IOException {
        return paperRDFService.findPaperMetadataById(id);
    }

    @Override
    public InputStream createPaperRDFStreamFromXML(String paperXML) throws FileNotFoundException, TransformerException {
        StringReader reader = new StringReader(paperXML);

        InputStream paperInputStream = new ReaderInputStream(reader, StandardCharsets.UTF_8);
        ByteArrayOutputStream rdfOut = new ByteArrayOutputStream();
        extractRDFMetadata(paperInputStream, rdfOut);

        return new ByteArrayInputStream(rdfOut.toByteArray());
    }
}
