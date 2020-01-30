package team6.xml_project.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import team6.xml_project.exception.*;
import team6.xml_project.helpers.XMLMarshaller;
import team6.xml_project.helpers.XMLUnmarshaller;
import team6.xml_project.models.Role;
import team6.xml_project.models.SubmissionStatus;
import team6.xml_project.models.User;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.models.xml.submission.Submission;
import team6.xml_project.repository.PaperRDFRepository;
import team6.xml_project.repository.PaperRepository;
import team6.xml_project.repository.SubmissionRepository;
import team6.xml_project.service.*;

import javax.mail.MessagingException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubmissionServiceImpl implements SubmissionService {

    @Autowired
    private SubmissionRepository submissionRepository;

    @Autowired
    private PaperService paperService;

    @Autowired
    private UserService userService;

    @Autowired
    private EmailService emailService;

    @Autowired
    private XSLTransformationService xslTransformationService;

    @Autowired
    private PaperRDFService paperRDFService;

    @Override
    public void create(String paper, Long userId) throws JAXBException {
        User author = userService.findById(userId);
        Paper paperObject = XMLUnmarshaller.createPaperFromXML(paper);

        Submission submission = new Submission();
        submission.setTitle(paperObject.getTitle());
        submission.setAuthorId(author.getId());

        submissionRepository.save(submission);
        paperService.save(paper, submission, "paper.xml");
    }

    @Override
    public void addReview(String submissionId, String review, Long userId) throws Exception {
        Submission submission = this.findById(submissionId);
        User reviewer = userService.findById(userId);

        if (checkIfSubmissionClosed(submission))
            throw new SubmissionClosedException();

        if (submission.getReviewerIds().stream().noneMatch(r -> r.getReviewerId() == reviewer.getId()))
            throw new NotSubmissionReviewerException();

        paperService.save(review, submission, String.format("review_%s.xml", reviewer.getId()));

        if (checkIfAllReviewsAdded(submission)) {
            submission.setSubmissionStatus(SubmissionStatus.REVIEWS_DONE.toString());
            submissionRepository.save(submission);
            try {
                User editor = userService.findById(submission.getEditorId());
                emailService.sendChangeStatusNotification(editor.getEmail(), submission);
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void addRevision(String submissionId, String paper, Long userId) throws JAXBException {
        User author = userService.findById(userId);
        Submission submission = this.findById(submissionId);
        Paper paperObject = XMLUnmarshaller.createPaperFromXML(paper);

        if (checkIfSubmissionClosed(submission))
            throw new SubmissionClosedException();

        if (!submission.getSubmissionStatus().equals(SubmissionStatus.NEEDS_REWORK.toString()))
            throw new SubmissionClosedForRevisions();

        if (submission.getAuthorId() != author.getId())
            throw new NotSubmissionAuthorException();

        submission.setTitle(paperObject.getTitle());
        submission.setCurrentRevision(submission.getCurrentRevision() + 1);
        submission.setSubmissionStatus(SubmissionStatus.SUBMITTED_FOR_REVIEW.toString());
        submissionRepository.save(submission);

        paperService.save(paper, submission, "paper.xml");
        try {
            User editor = userService.findById(submission.getEditorId());
            emailService.sendChangeStatusNotification(editor.getEmail(), submission);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Submission findById(String submissionId) {
        try {
            return submissionRepository.getById(submissionId);
        } catch (Exception e) {
            throw new SubmissionNotFoundException();
        }
    }

    @Override
    public List<Submission> findAll() throws Exception {
        return submissionRepository.getAll();
    }

    @Override
    public List<Submission> findAllByAuthorId(Long authorId) throws Exception {
        return submissionRepository.findDistinctSubmissionsByAuthor_Id(authorId);
    }

    @Override
    public List<Submission> findAllNeedingReviewByReviewerId(Long reviewerId) throws Exception {
        return submissionRepository.findDistinctSubmissionsByReviewersContaining(reviewerId);
    }

    @Override
    public List<Submission> findAllByStatus(SubmissionStatus status) throws Exception {
        return submissionRepository.findDistinctSubmissionsByStatus(status);
    }

    @Override
    public void setSubmissionStatus(String submissionId, Long userId, SubmissionStatus status) throws IOException, TransformerException, JAXBException, SAXException {
        User user = userService.findById(userId);
        Submission submission = findById(submissionId);

        if (checkIfSubmissionClosed(submission))
            throw new SubmissionClosedException();

        if (status == SubmissionStatus.AUTHOR_TAKEDOWN && submission.getAuthorId() != user.getId()) {
            throw new NotSubmissionAuthorException();
        } else if (user.getRole() == Role.ROLE_EDITOR && submission.getEditorId() != user.getId()){
            throw new NotSubmissionEditorException();
        }

        submission.setSubmissionStatus(status.toString());
        submissionRepository.save(submission);

        if (status == SubmissionStatus.ACCEPTED) {
            handlePaperAcceptance(submission);
        }

        try {
            if (status == SubmissionStatus.AUTHOR_TAKEDOWN) {
                User editor = userService.findById(submission.getEditorId());
                emailService.sendChangeStatusNotification(editor.getEmail(), submission);
            } else {
                User author = userService.findById(submission.getAuthorId());
                emailService.sendChangeStatusNotification(author.getEmail(), submission);
            }
            // moze da se desi da submission nema setovanog editora pa pukne prilikom takedown-a
            // zato hvatam UserNotFoundException
        } catch (MessagingException | UserNotFoundException e) {
            e.printStackTrace();
        }

    }

    private void handlePaperAcceptance(Submission submission) throws IOException, TransformerException, JAXBException, SAXException {
        Paper paper = paperService.findPaper(
                String.format("/db/xml_project_tim6/papers/%s/revision_%s", submission.getId(), submission.getCurrentRevision()),
                "paper.xml");
        String paperXML = XMLMarshaller.createStringFromPaper(paper);

        String annotatedPaper = xslTransformationService.addMetadataToPaper(paperXML,
                String.format("http://www.tim6.rs/db/xml_project_tim6/papers/%s/revision_%s/paper.xml",
                        submission.getId(), submission.getCurrentRevision()));

        InputStream rdfInputStream = paperService.createPaperRDFStreamFromXML(annotatedPaper);
        paperRDFService.addPaperMetadata(rdfInputStream);

        paperService.save(annotatedPaper, submission, "paper.xml");
    }

    @Override
    public void setSubmissionReviewers(String submissionId, Long editorId, List<Long> reviewerIds) {
        Submission submission = findById(submissionId);
        User editor = userService.findById(editorId);

        if (checkIfSubmissionClosed(submission))
            throw new SubmissionClosedException();

        if (submission.getEditorId() != editor.getId())
            throw new NotSubmissionEditorException();

        List<User> reviewers = userService.findByIds(reviewerIds);
        if (reviewers.isEmpty())
            throw new UserNotFoundException();

        List<Submission.ReviewerIds> previousReviewers = submission.getReviewerIds();

        submission.getReviewerIds().removeAll(submission.getReviewerIds());

        for (Long reviewerId : reviewerIds) {
            if(submission.getAuthorId() == reviewerId){
                continue;
            }

            Submission.ReviewerIds reviewer = new Submission.ReviewerIds();
            reviewer.setReviewerId(reviewerId);

            submission.getReviewerIds().add(reviewer);
        }

        submissionRepository.save(submission);
        sendEmailsToNewlyAddedReviewers(submission, editor, previousReviewers);
    }

    @Override
    public void setSubmissionEditor(String submissionId, Long editorId){
        Submission submission = findById(submissionId);
        User editor = userService.findById(editorId);
        User author = userService.findById(submission.getAuthorId());

        if (checkIfSubmissionClosed(submission))
            throw new SubmissionClosedException();

        if (editor.getRole() != Role.ROLE_EDITOR)
            throw new UserNotEditorException();

        submission.setEditorId(editorId);
        submission.setSubmissionStatus(SubmissionStatus.IN_REVIEW.toString());
        submissionRepository.save(submission);

        try {
            emailService.sendChangeStatusNotification(author.getEmail(), submission);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    private boolean checkIfSubmissionClosed(Submission submission) {
        return submission.getSubmissionStatus().equals(SubmissionStatus.REJECTED.toString()) ||
               submission.getSubmissionStatus().equals(SubmissionStatus.AUTHOR_TAKEDOWN.toString())  ||
               submission.getSubmissionStatus().equals(SubmissionStatus.ACCEPTED.toString()) ;
    }

    private boolean checkIfAllReviewsAdded(Submission submission) throws Exception {
        List<Long> userIds = submission.getReviewerIds().stream().map(Submission.ReviewerIds::getReviewerId).
                collect(Collectors.toList());

        for (Long id : userIds) {
            boolean exists = paperService.checkIfPaperExists(submission, String.format("review_%s", id));
            if (!exists)
                return false;
        }
        return true;
    }

    private void sendEmailsToNewlyAddedReviewers(Submission submission, User editor, List<Submission.ReviewerIds> previousReviewers) {
        for (Submission.ReviewerIds currentReviewer : submission.getReviewerIds()) {
            if (!previousReviewers.isEmpty() && !previousReviewers.contains(currentReviewer)) {
                try {
                    User notPreviouslyAddedReviewer = userService.findById(currentReviewer.getReviewerId());
                    emailService.sendReviewerChosenNotification(notPreviouslyAddedReviewer.getEmail(), submission, editor.getEmail());
                } catch (MessagingException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
