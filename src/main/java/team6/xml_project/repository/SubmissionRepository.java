package team6.xml_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import team6.xml_project.models.Submission;
import team6.xml_project.models.SubmissionStatus;

import java.util.List;

public interface SubmissionRepository extends JpaRepository<Submission, Long>,
        JpaSpecificationExecutor<Submission> {

    List<Submission> findDistinctSubmissionsByAuthor_Id(Long authorId);

    List<Submission> findDistinctSubmissionsByReviewersContaining(Long reviewerId);

    List<Submission> findDistinctSubmissionsByStatus(SubmissionStatus status);
}
