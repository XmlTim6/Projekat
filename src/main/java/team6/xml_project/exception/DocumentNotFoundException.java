package team6.xml_project.exception;

public class DocumentNotFoundException extends EntityNotFoundException {

    public DocumentNotFoundException() {
        super("Document not found");
    }
}
