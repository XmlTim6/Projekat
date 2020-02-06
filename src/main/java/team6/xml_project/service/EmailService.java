package team6.xml_project.service;

import team6.xml_project.models.User;
import team6.xml_project.models.xml.submission.Submission;

import javax.mail.MessagingException;

public interface EmailService {

    void sendReviewerChosenNotification(String receiver, Submission submission, String editorEmail) throws MessagingException;

    void sendChangeStatusNotificationAuthor(String receiver, Submission submission) throws MessagingException;

    void sendChangeStatusNotificationEditor(String receiver, Submission submission) throws MessagingException;

    void sendReviewerDeclinedReviewing(String receiver, User reviewer, Submission submission) throws MessagingException;
}
