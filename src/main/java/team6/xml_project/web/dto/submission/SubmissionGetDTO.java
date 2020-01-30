package team6.xml_project.web.dto.submission;

import lombok.Getter;
import lombok.Setter;
import team6.xml_project.models.SubmissionStatus;
import team6.xml_project.models.User;
import team6.xml_project.models.xml.submission.Submission;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class SubmissionGetDTO {

    private String id;
    private Long userId;
    private Long editorId;
    private List<Long> reviewerIds;
    private SubmissionStatus status;
    private Long currentRevision;
    private String title;

    public SubmissionGetDTO(Submission submission) {
        this.id = submission.getId();
        this.userId = submission.getAuthorId();
        this.editorId = submission.getEditorId();
        this.reviewerIds = submission.getReviewerIds().stream().map(Submission.ReviewerIds::getReviewerId).collect(Collectors.toList());
        this.status = SubmissionStatus.valueOf(submission.getSubmissionStatus());
        this.currentRevision = submission.getCurrentRevision();
        this.title = submission.getTitle();
    }

    public SubmissionGetDTO(String id, Long userId, Long editorId, List<Long> reviewerIds, SubmissionStatus status, Long currentRevision, String title) {
        this.id = id;
        this.userId = userId;
        this.editorId = editorId;
        this.reviewerIds = reviewerIds;
        this.status = status;
        this.currentRevision = currentRevision;
        this.title = title;
    }
}
