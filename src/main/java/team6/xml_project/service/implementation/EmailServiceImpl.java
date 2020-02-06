package team6.xml_project.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import team6.xml_project.models.User;
import team6.xml_project.models.xml.submission.Submission;
import team6.xml_project.service.EmailService;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Async
    @Override
    public void sendReviewerChosenNotification(String receiver, Submission submission, String editorEmail) throws MessagingException {
        sendNotification(receiver, "Submission review", String.format(
                "You have been added as a reviewer to the submission %s." +
                "For any questions, contact the submission editor at %s." +
                "More details can be found on: http://localhost:3000/author/reviews",
                submission.getId(), editorEmail
        ));
    }

    @Async
    @Override
    public void sendChangeStatusNotificationAuthor(String receiver, Submission submission) throws MessagingException {
        sendNotification(receiver, "Submission status change", String.format(
                "Submission status has been changed to %s.\n" +
                "More details can be found on: http://localhost:3000/author/mysubs", submission.getSubmissionStatus()));
    }

    @Async
    @Override
    public void sendChangeStatusNotificationEditor(String receiver, Submission submission) throws MessagingException {
        sendNotification(receiver, "Submission status change", String.format(
                "Submission status has been changed to %s.\n" +
                "More details can be found on: http://localhost:3000/editor", submission.getSubmissionStatus()));
    }

    @Async
    @Override
    public void sendReviewerDeclinedReviewing(String receiver, User reviewer, Submission submission) throws MessagingException {
        sendNotification(receiver, "Declined reviewing", String.format(
                "Reviewer %s %s has declined further reviewing on submission '%s.'", reviewer.getName(), reviewer.getSurname(), submission.getTitle()
        ));
    }

    private void sendNotification(String receiver, String subject, String text) throws MessagingException {
        MimeMessage msg = javaMailSender.createMimeMessage();
        MimeMessageHelper msgHelper = new MimeMessageHelper(msg, true);
        msgHelper.setTo(receiver);
        msgHelper.setSubject(subject);
        msgHelper.setText(text);
        javaMailSender.send(msg);
    }
}
