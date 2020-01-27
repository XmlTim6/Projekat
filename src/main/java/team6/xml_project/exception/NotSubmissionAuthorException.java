package team6.xml_project.exception;

public class NotSubmissionAuthorException extends PermissionDeniedException {

    public NotSubmissionAuthorException() {
        super("User is not author of the submission");
    }
}
