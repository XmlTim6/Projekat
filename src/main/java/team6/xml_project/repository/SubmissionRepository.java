package team6.xml_project.repository;

import team6.xml_project.models.SubmissionStatus;
import team6.xml_project.models.xml.submission.Submission;

import java.util.List;

public interface SubmissionRepository {

    void save(Submission submission);

    Submission getById(String submissionId) throws Exception;

    List<Submission> getAll() throws Exception;

    List<Submission> findDistinctSubmissionsByAuthor_Id(Long authorId) throws Exception;

    List<Submission> findDistinctSubmissionsByReviewersContaining(Long reviewerId) throws Exception;

    List<Submission> findDistinctSubmissionsByStatus(SubmissionStatus status) throws Exception;
}
