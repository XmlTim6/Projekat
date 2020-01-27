package team6.xml_project.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import team6.xml_project.models.Submission;
import team6.xml_project.models.SubmissionStatus;

import java.util.List;

public interface SubmissionService {

    void create(String paper, Long userId) throws Exception;

    void addReview(Long submissionId, String review, Long userId) throws Exception;

    void addRevision(Long submissionId, String paper, Long userId) throws Exception;

    Submission findById(Long submissionId);

    Page<Submission> findAll(Specification<Submission> specification, Pageable page);

    List<Submission> findAllByAuthorId(Long authorId);

    List<Submission> findAllNeedingReviewByReviewerId(Long reviewerId);

    List<Submission> findAllByStatus(SubmissionStatus status);

    void setSubmissionStatus(Long submissionId, Long userId, SubmissionStatus status);

    void setSubmissionReviewers(Long submissionId, Long editorId, List<Long> reviewerIds);

    void setSubmissionEditor(Long submissionId, Long editorId);
}
