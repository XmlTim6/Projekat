package team6.xml_project.service.implementation;

import org.apache.commons.io.input.ReaderInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team6.xml_project.exception.PermissionDeniedException;
import team6.xml_project.exception.SubmissionNotFoundException;
import team6.xml_project.helpers.RDFMetadataExtractor;
import team6.xml_project.helpers.XMLUnmarshaller;
import team6.xml_project.models.User;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.models.xml.submission.Submission;
import team6.xml_project.repository.DocumentRepository;
import team6.xml_project.repository.PaperRDFRepository;
import team6.xml_project.repository.PaperRepository;
import team6.xml_project.service.PaperRDFService;
import team6.xml_project.service.PaperService;
import team6.xml_project.service.SubmissionService;
import team6.xml_project.service.UserService;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    DocumentRepository documentRepository;

    @Autowired
    PaperRepository paperRepository;

    @Autowired
    PaperRDFService paperRDFService;

    @Autowired
    SubmissionService submissionService;

    @Autowired
    UserService userService;

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

    @Override
    public List<String> findPaperURIsOfSubmission(String submissionId, Long userId) throws Exception {
        if (userId == -1) {
            throw new PermissionDeniedException("Cannot access this resource");
        }
        User user = userService.findById(userId);
        Submission submission = submissionService.findById(submissionId);

        List<String> uris = paperRepository.getAllPaperURIsOfSubmission(submissionId);

        if (submission.getAuthorId() == userId) {
            return uris.stream().filter(s -> s.contains("paper.xml") || s.contains("review_anon.xml")).
                    collect(Collectors.toList());
        } else if (submission.getEditorId() == userId) {
            return uris;
        } else if (submission.getReviewerIds().stream().anyMatch(r -> r.getReviewerId() == userId)) {
            return uris.stream().filter(s -> s.contains("paper_anon.xml") || s.contains(String.format("review_%s", userId)))
                    .collect(Collectors.toList());
        } else {
            throw new PermissionDeniedException("Cannot access this resource");
        }
    }
}
