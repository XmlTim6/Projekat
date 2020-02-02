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
                "You have been added as a reviewer to the submission %s.\n" +
                "For any questions, contact the submission editor at %s.\n",
                "www.test.com/submissions" + submission.getId(), editorEmail
        ));
    }

    @Async
    @Override
    public void sendChangeStatusNotification(String receiver, Submission submission) throws MessagingException {
        sendNotification(receiver, "SUBMISSION STATUS CHANGE", String.format(
                "Submission status has been changed to %s.\n" +
                "Find more details at: %s.", submission.getSubmissionStatus(), "www.test.com/submissions" + submission.getId()));
    }

    @Async
    @Override
    public void sendReviewerDeclinedReviewing(String receiver, User reviewer, Submission submission) throws MessagingException {
        sendNotification(receiver, "DECLINED REVIEWING", String.format(
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
