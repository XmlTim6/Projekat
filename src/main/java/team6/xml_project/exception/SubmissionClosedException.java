package team6.xml_project.exception;

public class SubmissionClosedException extends PermissionDeniedException {

    public SubmissionClosedException() {
        super("Submission is closed");
    }
}
