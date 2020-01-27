package team6.xml_project.exception;

public class EmailAlreadyExistsException extends RuntimeException {
    public EmailAlreadyExistsException() {
        super();
    }
    public EmailAlreadyExistsException(String message) {
        super(message);
    }
}
