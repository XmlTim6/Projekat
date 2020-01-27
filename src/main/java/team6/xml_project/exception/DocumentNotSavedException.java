package team6.xml_project.exception;

public class DocumentNotSavedException extends RuntimeException {

    public DocumentNotSavedException() {
        super("Document not saved");
    }
}
