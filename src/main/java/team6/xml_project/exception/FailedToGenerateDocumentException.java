package team6.xml_project.exception;

public class FailedToGenerateDocumentException extends RuntimeException{
    public FailedToGenerateDocumentException() {
        super();
    }
    public FailedToGenerateDocumentException(String message) {
        super(message);
    }
}
