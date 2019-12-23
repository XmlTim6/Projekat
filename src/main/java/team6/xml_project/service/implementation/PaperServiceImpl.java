package team6.xml_project.service.implementation;

import org.apache.commons.io.input.ReaderInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team6.xml_project.helpers.RDFMetadataExtractor;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.repository.DocumentRepository;
import team6.xml_project.repository.PaperRDFRepository;
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
    PaperRDFRepository paperRDFRepository;

    public void save(String paperXML) throws Exception {
        Paper paper = createPaperFromXML(paperXML);
        InputStream rdfInputStream = createPaperRDFStreamFromXML(paperXML);

        documentRepository.save(paper, "/db/apps/papers/userId/revision1", "paper1.xml");
        paperRDFRepository.addPaper(rdfInputStream);
    }

    @Override
    public void extractRDFMetadata(InputStream in, OutputStream out) throws FileNotFoundException, TransformerException {
        RDFMetadataExtractor rdfMetadataExtractor = new RDFMetadataExtractor();
        rdfMetadataExtractor.extractMetadata(in, out);
    }

    @Override
    public String findPapersMetadataByAuthorName(String name) throws IOException {
        return paperRDFRepository.findPapersMetadataByAuthorName(name);
    }

    @Override
    public String findPapersMetadataByTitle(String title) throws IOException {
        return paperRDFRepository.findPapersMetadataByTitle(title);
    }

    @Override
    public String findPaperMetadataById(String id) throws IOException {
        return paperRDFRepository.findPaperMetadataById(id);
    }

    private Paper createPaperFromXML(String paperXML) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Paper.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        StringReader reader = new StringReader(paperXML);
        return (Paper) unmarshaller.unmarshal(reader);
    }

    private InputStream createPaperRDFStreamFromXML(String paperXML) throws FileNotFoundException, TransformerException {
        StringReader reader = new StringReader(paperXML);

        InputStream paperInputStream = new ReaderInputStream(reader, StandardCharsets.UTF_8);
        ByteArrayOutputStream rdfOut = new ByteArrayOutputStream();
        extractRDFMetadata(paperInputStream, rdfOut);

        return new ByteArrayInputStream(rdfOut.toByteArray());
    }
}
