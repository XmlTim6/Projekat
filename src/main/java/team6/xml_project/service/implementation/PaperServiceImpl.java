package team6.xml_project.service.implementation;

import jdk.internal.util.xml.impl.Input;
import org.apache.commons.io.input.ReaderInputStream;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import team6.xml_project.exception.*;
import team6.xml_project.helpers.RDFMetadataExtractor;
import team6.xml_project.helpers.XMLValidator;
import team6.xml_project.models.DocumentType;
import team6.xml_project.models.Role;
import team6.xml_project.models.SubmissionStatus;
import team6.xml_project.models.User;
import team6.xml_project.models.xml.submission.Submission;
import team6.xml_project.repository.DocumentRepository;
import team6.xml_project.repository.PaperRepository;
import team6.xml_project.service.PaperRDFService;
import team6.xml_project.service.PaperService;
import team6.xml_project.service.SubmissionService;
import team6.xml_project.service.UserService;
import team6.xml_project.util.SparqlUtil;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
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
        try {
            if(documentName.equals("paper.xml")){
                XMLValidator  validator= new XMLValidator();
                validator.validate(paper, DocumentType.PAPER);
            }
            paperRepository.save(paper, submission, documentName);
        }catch (Exception e){
            throw new FailedToGenerateDocumentException();
        }
    }



    @Override
    public boolean checkIfPaperExists(Submission submission, String documentName) throws Exception {
        return paperRepository.checkIfPaperExists(submission, documentName);
    }

    @Override
    public String findPaper(String collectionName, String documentName, long userId, String submissionId) {
        User user;
        try {
            user = userService.findById(userId);
        } catch (UserNotFoundException e) {
            user = null;
        }

        String paper;
        try {
            paper =  paperRepository.get(collectionName, documentName);
        } catch (Exception e) {
            throw new DocumentNotFoundException();
        }

        Submission submission = submissionService.findById(submissionId);

        if(isPermitted(user, submission, documentName)){
            return paper;
        } else {
            throw new PermissionDeniedException("Cannot access this resource");
        }
    }

    @Override
    public String findPaperMetadata(String collectionName, String documentName, long userId, String submissionId, String type) throws FileNotFoundException, TransformerException {
        String paper = findPaper(collectionName, documentName, userId, submissionId);

        if (type.equals("rdf"))
            return createPaperRDFStringFromXML(paper.replaceFirst("<paper", "<paper xmlns:pred=\"http://www.tim6.rs/predicate/\""));
        else {
            InputStream rdf = createPaperRDFStreamFromXML(paper.replaceFirst("<paper", "<paper xmlns:pred=\"http://www.tim6.rs/predicate/\""));
            Model model = ModelFactory.createDefaultModel();
            model.read(rdf, null);
            OutputStream out = new ByteArrayOutputStream();
            model.write(out, "RDF/JSON");
            return out.toString();
        }
    }

    private boolean isPermitted(User user, Submission submission, String documentName) {
        if (submission.getSubmissionStatus().equals(SubmissionStatus.AUTHOR_TAKEDOWN.toString()))
            return false;

        if (isPermittedUser(submission, documentName))
            return true;

        if (isPermittedEditor(user))
            return true;

        if (isPermittedReviewer(user, submission, documentName))
            return true;

        return isPermittedAuthor(user, submission, documentName);
    }

    private boolean isPermittedEditor(User user) {
        return user.getRole() == Role.ROLE_EDITOR;
    }

    private boolean isPermittedUser(Submission submission, String documentName) {
        return documentName.equals("paper.xml") &&
                submission.getSubmissionStatus().equals(SubmissionStatus.ACCEPTED.toString());
    }

    private boolean isPermittedAuthor(User user, Submission submission, String documentName) {
        if (user.getRole() == Role.ROLE_AUTHOR) {
            if (submission.getAuthorId() == user.getId()) {
                if (documentName.startsWith("review") && submission.getSubmissionStatus().equals(SubmissionStatus.NEEDS_REWORK.toString()))
                    return true;
                return true;
            }
        }
        return false;
    }

    private boolean isPermittedReviewer(User user, Submission submission, String documentName) {
        List<Long> listOfReviewers = submission.getReviewerIds().stream().map(Submission.ReviewerIds::getReviewerId)
                .collect(Collectors.toList());
        if (listOfReviewers.contains(user.getId())) {
            if (documentName.equals(String.format("review_%s.xml", user.getId())))
                return true;
            if (documentName.equals("paper_anon.xml"))
                return true;
            return documentName.equals("paper.xml") &&
                    submission.getSubmissionStatus().equals(SubmissionStatus.ACCEPTED.toString());
        }
        return false;
    }

    private void extractRDFMetadata(InputStream in, OutputStream out) throws FileNotFoundException, TransformerException {
        RDFMetadataExtractor rdfMetadataExtractor = new RDFMetadataExtractor();
        rdfMetadataExtractor.extractMetadata(in, out);
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
    public String createPaperRDFStringFromXML(String paperXML) throws FileNotFoundException, TransformerException {
        StringReader reader = new StringReader(paperXML);

        InputStream paperInputStream = new ReaderInputStream(reader, StandardCharsets.UTF_8);
        ByteArrayOutputStream rdfOut = new ByteArrayOutputStream();
        extractRDFMetadata(paperInputStream, rdfOut);

        return rdfOut.toString();
    }

    @Override
    public List<String> findPaperURIsOfSubmission(String submissionId, Long userId) throws Exception {
        if (userId == -1) {
            throw new PermissionDeniedException();
        }
        User user = userService.findById(userId);
        Submission submission = submissionService.findById(submissionId);

        List<String> urisOld = paperRepository.getAllPaperURIsOfSubmission(submissionId);

        List<String> uris = new ArrayList<>();

        for (String uri: urisOld) {
            int index = uri.indexOf("revision_") + "revision_".length();
            uris.add("http://localhost:3000/details/" + submissionId +
                    "/" + uri.substring(index, index + 1) +
                    "/" + uri.substring(index + 2));
        }

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

    @Override
    public List<String> findPaperURIsMatchingText(String searchTerm) throws Exception {
        return paperRepository.findPaperURIsMatchingText(searchTerm);
    }

    @Override
    public String findPapersByMetadata(String paperId, String paperTitle, String authorName, List<String> keywords, String type) {
        return paperRDFService.findPapersByMetadata(paperId, paperTitle, authorName, keywords, type);
    }

    @Override
    public String findPapersCitingPaper(String paperLocation, String type) {
        return paperRDFService.findPapersCitingPaper(paperLocation, type);
    }
}
