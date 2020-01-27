package team6.xml_project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import team6.xml_project.models.Role;
import team6.xml_project.models.Submission;
import team6.xml_project.models.SubmissionStatus;
import team6.xml_project.models.User;

import java.util.Arrays;
import java.util.Collections;

@Component
public class _Startup { //implements ApplicationRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SubmissionRepository submissionRepository;

    @Transactional
    //@Override
    public void run(ApplicationArguments args) throws Exception {

        User u1 = new User("u1@mail.com", "$2a$10$PH7tn1C1P8x2N6hEbPvXwOgD88Bz5Nanti7mklRQTg6BdD.qoJnAy", true, "Name1", "Surname1", Arrays.asList("math", "physics"), Role.ROLE_AUTHOR);
        User u2 = new User("u2@mail.com", "$2a$10$PH7tn1C1P8x2N6hEbPvXwOgD88Bz5Nanti7mklRQTg6BdD.qoJnAy", true, "Name2", "Surname2", Arrays.asList("math", "biology"), Role.ROLE_AUTHOR);
        User u3 = new User("u3@mail.com", "$2a$10$PH7tn1C1P8x2N6hEbPvXwOgD88Bz5Nanti7mklRQTg6BdD.qoJnAy", true, "Name3", "Surname3", Arrays.asList("chemistry", "biology"), Role.ROLE_AUTHOR);
        User e1 = new User("editor@mail.com", "$2a$10$PH7tn1C1P8x2N6hEbPvXwOgD88Bz5Nanti7mklRQTg6BdD.qoJnAy", true, "Name4", "Surname4", Arrays.asList("language", "biology"), Role.ROLE_EDITOR);
        userRepository.save(u1);
        userRepository.save(u2);
        userRepository.save(u3);
        userRepository.save(e1);

        Submission submission1 = new Submission(u1);
        Submission submission2 = new Submission(u2, e1, Arrays.asList(u1, u3), SubmissionStatus.ACCEPTED, 4L);
        Submission submission3 = new Submission(u3, e1, Arrays.asList(u1, u2), SubmissionStatus.IN_REVIEW, 1L);
        Submission submission4 = new Submission(u1, e1, Arrays.asList(u3, u2), SubmissionStatus.NEEDS_REWORK, 3L);
        Submission submission5 = new Submission(u1, e1, Collections.emptyList(), SubmissionStatus.REJECTED, 2L);
        Submission submission6 = new Submission(u3, e1, Arrays.asList(u1, u2), SubmissionStatus.AUTHOR_TAKEDOWN, 2L);
        submissionRepository.save(submission1);
        submissionRepository.save(submission2);
        submissionRepository.save(submission3);
        submissionRepository.save(submission4);
        submissionRepository.save(submission5);
        submissionRepository.save(submission6);

        submissionRepository.flush();
        userRepository.flush();
    }
}
