package team6.xml_project.repository;

import team6.xml_project.models.xml.submission.Submission;

import java.util.List;

public interface ReviewFormRepository {

    void save(String reviewForm, Submission submission, Long reviewerId);

    void saveMergedReview(String reviewForm, Submission submission);

    String find(String submissionId, Long revision, String documentName) throws Exception;

    List<String> getAllReviewFormDocumentsOfSubmission(String submissionId, Long revision) throws Exception;

    List<String> getAllReviewFormURIsOfSubmission(String submissionId) throws Exception;

    boolean checkIfReviewFormExists(Submission submission, String documentName) throws Exception;
}
