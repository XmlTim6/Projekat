package team6.xml_project.exception;

public class SubmissionClosedForReviews extends PermissionDeniedException {

    public SubmissionClosedForReviews() {
        super("Submission is closed for reviews");
    }
}