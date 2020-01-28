package team6.xml_project.service;

import team6.xml_project.models.xml.submission.Submission;

import javax.mail.MessagingException;

public interface EmailService {

    void sendReviewerChosenNotification(String receiver, Submission submission, String editorEmail) throws MessagingException;

    void sendChangeStatusNotification(String receiver, Submission submission) throws MessagingException;

}
