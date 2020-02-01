package team6.xml_project.service;

import org.xml.sax.SAXException;
import team6.xml_project.models.SubmissionStatus;
import team6.xml_project.models.xml.submission.Submission;

import javax.mail.MessagingException;
import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface SubmissionService {

    void create(String paper, Long userId) throws Exception;

    void addReview(String submissionId, String review, Long userId) throws Exception;

    void addRevision(String submissionId, String paper, Long userId) throws Exception;

    Submission findById(String submissionId);

    List<Submission> findAll() throws Exception;

    List<Submission> findAllByAuthorId(Long authorId) throws Exception;

    List<Submission> findAllNeedingReviewByReviewerId(Long reviewerId) throws Exception;

    List<Submission> findAllByStatus(SubmissionStatus status) throws Exception;

    void declineReviewing(String submissionId, Long userId) throws MessagingException;

    void setSubmissionStatus(String submissionId, Long userId, SubmissionStatus status) throws IOException, TransformerException, JAXBException, SAXException;

    void setSubmissionReviewers(String submissionId, Long editorId, List<Long> reviewerIds);

    void setSubmissionEditor(String submissionId, Long editorId);

    void handleAllReviewsAdded(Submission submission);
}
