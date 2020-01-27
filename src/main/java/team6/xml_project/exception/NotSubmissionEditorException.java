package team6.xml_project.exception;

public class NotSubmissionEditorException extends PermissionDeniedException {

    public NotSubmissionEditorException() {
        super("User is not editor of the submission");
    }
}
