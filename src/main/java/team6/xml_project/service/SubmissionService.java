package team6.xml_project.service;

import team6.xml_project.models.SubmissionStatus;
import team6.xml_project.models.xml.submission.Submission;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
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

    void setSubmissionStatus(String submissionId, Long userId, SubmissionStatus status) throws FileNotFoundException, TransformerException, JAXBException;

    void setSubmissionReviewers(String submissionId, Long editorId, List<Long> reviewerIds);

    void setSubmissionEditor(String submissionId, Long editorId);
}
