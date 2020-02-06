package team6.xml_project.service;

import team6.xml_project.models.xml.submission.Submission;

import java.util.List;

public interface ReviewFormService {

    void save(String reviewForm, String submissionId, Long userId) throws Exception;

    boolean checkIfReviewFormExists(Submission submission, String documentName) throws Exception;

    String findReviewForm(String submissionId, Long revision, String document, Long userId);

    List<String> findReviewFormDocumentsOfSubmission(java.lang.String submissionId, Long revision) throws Exception;

    List<String> findReviewFormURIsOfSubmission(String submissionId, Long userId);
}
