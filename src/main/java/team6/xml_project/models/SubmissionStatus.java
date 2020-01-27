package team6.xml_project.models;

public enum SubmissionStatus {
    SUBMITTED_FOR_REVIEW, // Author submitted document draft
    IN_REVIEW,            // Submission is being reviewed
    REVIEWS_DONE,         // All reviewers have given their reviews
    NEEDS_REWORK,         // Author needs to rework parts of the submission
    REJECTED,             // Editor rejects the submission altogether
    ACCEPTED,             // Editor accepts the submission in it's current state
    AUTHOR_TAKEDOWN       // Submission taken down by author
}
