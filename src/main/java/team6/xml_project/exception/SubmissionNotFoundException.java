package team6.xml_project.exception;

public class SubmissionNotFoundException extends EntityNotFoundException {

    public SubmissionNotFoundException() {
        super("Submission not found");
    }
}
