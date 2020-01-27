package team6.xml_project.exception;

public class SubmissionClosedForRevisions extends PermissionDeniedException {

    public SubmissionClosedForRevisions() {
        super("Submission is closed for revisions");
    }
}
