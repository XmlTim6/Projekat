package team6.xml_project.web.dto.submission;

import lombok.Getter;
import lombok.Setter;
import team6.xml_project.models.Submission;
import team6.xml_project.models.SubmissionStatus;
import team6.xml_project.models.User;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class SubmissionGetDTO {

    private Long id;
    private Long userId;
    private Long editorId;
    private List<Long> reviewerIds;
    private SubmissionStatus status;
    private Long currentRevision;

    public SubmissionGetDTO(Submission submission) {
        this.id = submission.getId();
        this.userId = submission.getAuthor().getId();
        this.editorId = submission.getEditor() == null ? -1 : submission.getEditor().getId();
        this.reviewerIds = submission.getReviewers().stream().map(User::getId).collect(Collectors.toList());
        this.status = submission.getStatus();
        this.currentRevision = submission.getCurrentRevision();
    }

    public SubmissionGetDTO(Long id, Long userId, Long editorId, List<Long> reviewerIds, SubmissionStatus status, Long currentRevision) {
        this.id = id;
        this.userId = userId;
        this.editorId = editorId;
        this.reviewerIds = reviewerIds;
        this.status = status;
        this.currentRevision = currentRevision;
    }
}
