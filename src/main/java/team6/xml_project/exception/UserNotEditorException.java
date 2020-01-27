package team6.xml_project.exception;

public class UserNotEditorException extends PermissionDeniedException {

    public UserNotEditorException() {
        super("User is not an editor");
    }
}
