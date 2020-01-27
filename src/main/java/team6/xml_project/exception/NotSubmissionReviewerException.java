package team6.xml_project.exception;

public class NotSubmissionReviewerException extends PermissionDeniedException {

    public NotSubmissionReviewerException() {
        super("User is not author of the submission");
    }
}
