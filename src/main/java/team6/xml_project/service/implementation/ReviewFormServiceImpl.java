package team6.xml_project.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team6.xml_project.exception.NotSubmissionAuthorException;
import team6.xml_project.exception.PermissionDeniedException;
import team6.xml_project.exception.SubmissionClosedForCoverLetters;
import team6.xml_project.exception.SubmissionNotFoundException;
import team6.xml_project.models.Role;
import team6.xml_project.models.SubmissionStatus;
import team6.xml_project.models.User;
import team6.xml_project.models.xml.review_form.ReviewForm;
import team6.xml_project.models.xml.submission.Submission;
import team6.xml_project.repository.DocumentRepository;
import team6.xml_project.repository.ReviewFormRepository;
import team6.xml_project.repository.SubmissionRepository;
import team6.xml_project.service.PaperService;
import team6.xml_project.service.ReviewFormService;
import team6.xml_project.service.SubmissionService;
import team6.xml_project.service.UserService;

import javax.mail.MessagingException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewFormServiceImpl implements ReviewFormService {

    @Autowired
    SubmissionService submissionService;

    @Autowired
    SubmissionRepository submissionRepository;

    @Autowired
    ReviewFormRepository reviewFormRepository;

    @Autowired
    PaperService paperService;

    @Autowired
    UserService userService;

    @Override
    public void save(String reviewForm, String submissionId, Long userId) throws Exception {
        Submission submission = submissionService.findById(submissionId);

        if (!submission.getSubmissionStatus().equals(SubmissionStatus.IN_REVIEW.toString()))
            throw new SubmissionClosedForCoverLetters();

        if (submission.getReviewerIds().stream().noneMatch(r -> r.getReviewerId() == userId))
            throw new NotSubmissionAuthorException();

        reviewFormRepository.save(reviewForm, submission, userId);

        if (checkIfAllReviewsAdded(submission))
            submissionService.handleAllReviewsAdded(submission);
    }

    @Override
    public boolean checkIfReviewFormExists(Submission submission, String documentName) throws Exception {
        return reviewFormRepository.checkIfReviewFormExists(submission, documentName);
    }

    @Override
    public ReviewForm findReviewForm(String submissionId, Long revision, String document, Long userId) {
        Submission submission = submissionService.findById(submissionId);
        User reviewer = userService.findById(userId);

        if ((submission.getReviewerIds().stream().noneMatch(r -> r.getReviewerId() == userId))
                && !(submission.getEditorId() == userId))
            throw new PermissionDeniedException();

        if (reviewer.getRole() == Role.ROLE_AUTHOR && !document.equals(String.format("review_form_%s.xml", userId)))
            throw new PermissionDeniedException();

        try {
            return reviewFormRepository.find(submissionId, revision, document);
        } catch (Exception e) {
            throw new SubmissionNotFoundException();
        }
    }

    @Override
    public List<String> findReviewFormURIsOfSubmission(String submissionId, Long userId) {
        Submission submission = submissionService.findById(submissionId);
        User user = userService.findById(userId);

        if ((submission.getReviewerIds().stream().noneMatch(r -> r.getReviewerId() == userId))
                && !(submission.getEditorId() == userId))
            throw new PermissionDeniedException();

        List<String> reviewFormURIsOld;
        List<String> reviewFormURIs = new ArrayList<>();

        try {
            reviewFormURIsOld = reviewFormRepository.getAllReviewFormURIsOfSubmission(submissionId);
            for (String uri: reviewFormURIsOld) {
                reviewFormURIs.add("http://localhost:3000/details/" + submissionId +
                        "/" + submission.getCurrentRevision() +
                        "/" + uri.substring(uri.lastIndexOf('/') + 1));
            }
        } catch (Exception e) {
            throw new SubmissionNotFoundException();
        }

        if (user.getRole().equals(Role.ROLE_AUTHOR))
            return reviewFormURIs.stream().filter(rf -> rf.endsWith(String.format("review_form_%s.xml", userId)))
                    .collect(Collectors.toList());
        return reviewFormURIs;
    }

    private boolean checkIfAllReviewsAdded(Submission submission) throws Exception {
        List<Long> userIds = submission.getReviewerIds().stream().map(Submission.ReviewerIds::getReviewerId).
                collect(Collectors.toList());

        for (Long id : userIds) {
            boolean exists = paperService.checkIfPaperExists(submission, String.format("review_%s.xml", id));
            if (!exists)
                return false;
            exists = checkIfReviewFormExists(submission, String.format("review_form_%s.xml", id));
            if (!exists)
                return false;
        }
        return true;
    }
}
