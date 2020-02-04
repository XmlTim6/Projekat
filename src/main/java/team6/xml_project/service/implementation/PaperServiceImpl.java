package team6.xml_project.service.implementation;

import org.apache.commons.io.input.ReaderInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team6.xml_project.exception.PermissionDeniedException;
import team6.xml_project.exception.SubmissionNotFoundException;
import team6.xml_project.helpers.RDFMetadataExtractor;
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

import javax.xml.transform.TransformerException;
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
        paperRepository.save(paper, submission, documentName);
    }

    @Override
    public boolean checkIfPaperExists(Submission submission, String documentName) throws Exception {
        return paperRepository.checkIfPaperExists(submission, documentName);
    }

    @Override
    public String findPaper(String collectionName, String documentName, long userId, String submissionId) {
        try {
            User user = userService.findById(userId);
            String paper =  paperRepository.get(collectionName, documentName);
            Submission submission = submissionService.findById(submissionId);

            if(getPermittedStatus(user, submission).contains(submission.getSubmissionStatus())){
                return paper;
            }else{
                throw new PermissionDeniedException("Cannot access this resource");
            }

        } catch (Exception e) {
            throw new SubmissionNotFoundException();
        }
    }

    private List<String> getPermittedStatus(User user, Submission submission){
        ArrayList<String> status = new ArrayList<>();
        status.add(SubmissionStatus.ACCEPTED.toString());
        if(user.getRole() == Role.ROLE_EDITOR){
            status.addAll(Arrays.asList( SubmissionStatus.SUBMITTED_FOR_REVIEW.toString(),
                                         SubmissionStatus.REVIEWS_DONE.toString(),
                                         SubmissionStatus.NEEDS_REWORK.toString(),
                                         SubmissionStatus.REJECTED.toString(),
                                         SubmissionStatus.IN_REVIEW.toString()));
        }
        if(user.getRole() == Role.ROLE_AUTHOR){
            List<Long> listOfReviewers = submission.getReviewerIds().stream().map(Submission.ReviewerIds::getReviewerId)
                    .collect(Collectors.toList());
            if(submission.getAuthorId() == user.getId()){
                status.addAll(Arrays.asList( SubmissionStatus.SUBMITTED_FOR_REVIEW.toString(),
                                             SubmissionStatus.REVIEWS_DONE.toString(),
                                             SubmissionStatus.NEEDS_REWORK.toString(),
                                             SubmissionStatus.REJECTED.toString(),
                                             SubmissionStatus.IN_REVIEW.toString(),
                                             SubmissionStatus.AUTHOR_TAKEDOWN.toString()));

            }else if(listOfReviewers.contains(user.getId())){
                status.add(SubmissionStatus.IN_REVIEW.toString());
            }
        }
        return status;
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
