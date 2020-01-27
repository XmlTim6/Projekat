package team6.xml_project.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.base.ResourceSet;
import team6.xml_project.exception.*;
import team6.xml_project.helpers.XMLUnmarshaller;
import team6.xml_project.models.Role;
import team6.xml_project.models.Submission;
import team6.xml_project.models.SubmissionStatus;
import team6.xml_project.models.User;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.repository.DocumentRepository;
import team6.xml_project.repository.SubmissionRepository;
import team6.xml_project.service.EmailService;
import team6.xml_project.service.SubmissionService;
import team6.xml_project.service.UserService;

import javax.mail.MessagingException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubmissionServiceImpl implements SubmissionService {

    @Autowired
    private SubmissionRepository submissionRepository;

    @Autowired
    private DocumentRepository documentRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private EmailService emailService;

    @Override
    public void create(String paper, Long userId) {
        User author = userService.findById(userId);
        Submission submission = new Submission(author);
        submission = submissionRepository.save(submission);

        this.saveDocument(paper, submission, "paper.xml");
    }

    @Override
    public void addReview(Long submissionId, String review, Long userId) throws Exception {
        Submission submission = this.findById(submissionId);
        User reviewer = userService.findById(userId);

        if (checkIfSubmissionClosed(submission))
            throw new SubmissionClosedException();

        if (!submission.getReviewers().contains(reviewer))
            throw new NotSubmissionReviewerException();

        saveDocument(review, submission, String.format("review_%s.xml", reviewer.getId()));

        if (checkIfAllReviewsAdded(submission)) {
            submission.setStatus(SubmissionStatus.REVIEWS_DONE);
            submissionRepository.save(submission);
            try {
                emailService.sendChangeStatusNotification(submission.getEditor().getEmail(), submission);
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void addRevision(Long submissionId, String paper, Long userId) {
        User author = userService.findById(userId);
        Submission submission = this.findById(submissionId);

        if (checkIfSubmissionClosed(submission))
            throw new SubmissionClosedException();

        if (submission.getStatus() != SubmissionStatus.NEEDS_REWORK)
            throw new SubmissionClosedForRevisions();

        if (submission.getAuthor() != author)
            throw new NotSubmissionAuthorException();

        submission.setCurrentRevision(submission.getCurrentRevision() + 1);
        submission.setStatus(SubmissionStatus.SUBMITTED_FOR_REVIEW);
        submissionRepository.save(submission);

        saveDocument(paper, submission, "paper.xml");
        try {
            emailService.sendChangeStatusNotification(submission.getEditor().getEmail(), submission);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Submission findById(Long submissionId) {
        return submissionRepository.findById(submissionId).orElseThrow(SubmissionNotFoundException::new);
    }

    @Override
    public Page<Submission> findAll(Specification<Submission> specification, Pageable page) {
        return submissionRepository.findAll(specification, page);
    }

    @Override
    public List<Submission> findAllByAuthorId(Long authorId) {
        return submissionRepository.findDistinctSubmissionsByAuthor_Id(authorId);
    }

    @Override
    public List<Submission> findAllNeedingReviewByReviewerId(Long reviewerId) {
        return submissionRepository.findDistinctSubmissionsByReviewersContaining(reviewerId);
    }

    @Override
    public List<Submission> findAllByStatus(SubmissionStatus status) {
        return submissionRepository.findDistinctSubmissionsByStatus(status);
    }

    @Override
    public void setSubmissionStatus(Long submissionId, Long userId, SubmissionStatus status) {
        User user = userService.findById(userId);
        Submission submission = findById(submissionId);

        if (checkIfSubmissionClosed(submission))
            throw new SubmissionClosedException();

        if (status == SubmissionStatus.AUTHOR_TAKEDOWN && submission.getAuthor() != user) {
            throw new NotSubmissionAuthorException();
        } else if (user.getRole() == Role.ROLE_EDITOR && submission.getEditor() != user ){
            throw new NotSubmissionEditorException();
        }

        submission.setStatus(status);
        submissionRepository.save(submission);

        try {
            if (status == SubmissionStatus.AUTHOR_TAKEDOWN)
                emailService.sendChangeStatusNotification(submission.getEditor().getEmail(), submission);
            emailService.sendChangeStatusNotification(submission.getAuthor().getEmail(), submission);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setSubmissionReviewers(Long submissionId, Long editorId, List<Long> reviewerIds) {
        User editor = userService.findById(editorId);
        Submission submission = findById(submissionId);

        if (checkIfSubmissionClosed(submission))
            throw new SubmissionClosedException();

        if (submission.getEditor() != editor)
            throw new NotSubmissionEditorException();

        List<User> reviewers = userService.findByIds(reviewerIds);
        if (reviewers.isEmpty())
            throw new UserNotFoundException();

        List<User> previousReviewers = submission.getReviewers();
        submission.setReviewers(reviewers);
        submissionRepository.save(submission);

        for (User currentReviewer : submission.getReviewers()) {
            if (!previousReviewers.isEmpty() && !previousReviewers.contains(currentReviewer)) {
                try {
                    emailService.sendReviewerChosenNotification(currentReviewer.getEmail(), submission);
                } catch (MessagingException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public void setSubmissionEditor(Long submissionId, Long editorId){
        User editor = userService.findById(editorId);
        Submission submission = findById(submissionId);

        if (checkIfSubmissionClosed(submission))
            throw new SubmissionClosedException();

        if (editor.getRole() != Role.ROLE_EDITOR)
            throw new UserNotEditorException();

        submission.setEditor(editor);
        submission.setStatus(SubmissionStatus.IN_REVIEW);
        submissionRepository.save(submission);

        try {
            emailService.sendChangeStatusNotification(submission.getAuthor().getEmail(), submission);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    private void saveDocument(String document, Submission submission, String documentName) {
        try {
        Paper paperObject = XMLUnmarshaller.createPaperFromXML(document);
        documentRepository.save(paperObject, String.format("/db/xml_project_tim6/submissions/%s/revision_%s/",
                submission.getId(), submission.getCurrentRevision()), documentName);
        } catch (Exception e) {
            throw new DocumentNotSavedException();
        }
    }

    private boolean checkIfSubmissionClosed(Submission submission) {
        return submission.getStatus() == SubmissionStatus.REJECTED ||
               submission.getStatus() == SubmissionStatus.AUTHOR_TAKEDOWN ||
               submission.getStatus() == SubmissionStatus.ACCEPTED;
    }

    private boolean checkIfAllReviewsAdded(Submission submission) throws Exception {
        List<Long> userIds = submission.getReviewers().stream().map(User::getId).collect(Collectors.toList());
        for (Long id : userIds) {
            ResourceSet resourceSet = documentRepository.checkIfDocumentExist(String.format("/db/xml_project_tim6/submissions/%s/revision_%s/",
                    submission.getId(), submission.getCurrentRevision()), String.format("review_%s", id));
            boolean value = Boolean.parseBoolean(String.valueOf(resourceSet.getResource(0L).getContent()));
            if (!value)
                return false;
        }
        return true;
    }

}
