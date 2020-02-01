package team6.xml_project.repository;

import org.xmldb.api.base.XMLDBException;
import team6.xml_project.models.xml.review_form.ReviewForm;
import team6.xml_project.models.xml.submission.Submission;

import java.util.List;

public interface ReviewFormRepository {

    void save(String reviewForm, Submission submission, Long reviewerId);

    ReviewForm find(String submissionId, Long revision, String documentName) throws Exception;

    List<String> getAllReviewFormURIsOfSubmission(String submissionId) throws Exception;

    boolean checkIfReviewFormExists(Submission submission, String documentName) throws Exception;
}
