package team6.xml_project.exception;

public class PermissionDeniedException extends RuntimeException {

    public PermissionDeniedException() {
        super("Cannot access this resource.");
    }

    public PermissionDeniedException(String message) {
        super(message);
    }
}
