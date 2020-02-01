package team6.xml_project.exception;

public class SubmissionClosedForCoverLetters extends PermissionDeniedException {

    public SubmissionClosedForCoverLetters() {
        super("Submission is closed for revisions");
    }
}