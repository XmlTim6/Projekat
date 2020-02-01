package team6.xml_project.service;

import team6.xml_project.models.xml.review_form.ReviewForm;
import team6.xml_project.models.xml.submission.Submission;

import java.util.List;

public interface ReviewFormService {

    void save(String reviewForm, String submissionId, Long userId) throws Exception;

    boolean checkIfReviewFormExists(Submission submission, String documentName) throws Exception;

    ReviewForm findReviewForm(String submissionId, Long revision, String document, Long userId);

    List<String> findReviewFormURIsOfSubmission(String submissionId, Long userId);
}
