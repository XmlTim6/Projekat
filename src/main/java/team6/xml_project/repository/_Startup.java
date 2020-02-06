package team6.xml_project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import team6.xml_project.models.Role;
import team6.xml_project.models.SubmissionStatus;
import team6.xml_project.models.User;

import java.util.Arrays;
import java.util.Collections;

@Component
public class _Startup implements ApplicationRunner {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public void run(ApplicationArguments args) {
        if (!userRepository.findUserByEmail("tim6.xml+u1@gmail.com").isPresent()) {
            User user = new User("tim6.xml+u1@gmail.com",
                    "$2a$10$PH7tn1C1P8x2N6hEbPvXwOgD88Bz5Nanti7mklRQTg6BdD.qoJnAy", // "password"
                    true, "John", "Smith",
                    Arrays.asList("math", "physics", "algebra", "set theory", "mathematics", "quantum theory"), Role.ROLE_AUTHOR);
            userRepository.save(user);
        }

        if (!userRepository.findUserByEmail("tim6.xml+u2@gmail.com").isPresent()) {
            User user = new User("tim6.xml+u2@gmail.com",
                    "$2a$10$PH7tn1C1P8x2N6hEbPvXwOgD88Bz5Nanti7mklRQTg6BdD.qoJnAy", // "password"
                    true, "Jane", "Smith",
                    Arrays.asList("lasers", "physics", "theoretical physics", "astronomy", "quantum theory"), Role.ROLE_AUTHOR);
            userRepository.save(user);
        }

        if (!userRepository.findUserByEmail("tim6.xml+u3@gmail.com").isPresent()) {
            User user = new User("tim6.xml+u3@gmail.com",
                    "$2a$10$PH7tn1C1P8x2N6hEbPvXwOgD88Bz5Nanti7mklRQTg6BdD.qoJnAy", // "password"
                    true, "Robert", "Rich",
                    Arrays.asList("biology", "zoology", "chemistry", "organic chemistry", "bacteria", "viruses"), Role.ROLE_AUTHOR);
            userRepository.save(user);
        }

        if (!userRepository.findUserByEmail("tim6.xml+u4@gmail.com").isPresent()) {
            User user = new User("tim6.xml+u4@gmail.com",
                    "$2a$10$PH7tn1C1P8x2N6hEbPvXwOgD88Bz5Nanti7mklRQTg6BdD.qoJnAy", // "password"
                    true, "Jim", "Cook",
                    Arrays.asList("language", "medicine", "chemistry", "organic chemistry", "history"), Role.ROLE_AUTHOR);
            userRepository.save(user);
        }


        if (!userRepository.findUserByEmail("tim6.xml+e1@gmail.com").isPresent()) {
            User user = new User("tim6.xml+e1@gmail.com",
                    "$2a$10$PH7tn1C1P8x2N6hEbPvXwOgD88Bz5Nanti7mklRQTg6BdD.qoJnAy", // "password"
                    true, "Tim", "Stone",
                    Arrays.asList("radiology", "medicine", "heart surgery", "bacteria", "viruses"), Role.ROLE_EDITOR);
            userRepository.save(user);
        }

        if (!userRepository.findUserByEmail("tim6.xml+e2@gmail.com").isPresent()) {
            User user = new User("tim6.xml+e2@gmail.com",
                    "$2a$10$PH7tn1C1P8x2N6hEbPvXwOgD88Bz5Nanti7mklRQTg6BdD.qoJnAy", // "password"
                    true, "Billy", "Mays",
                    Arrays.asList("economy", "taxes", "capitalism", "sales"), Role.ROLE_EDITOR);
            userRepository.save(user);
        }

        userRepository.flush();
    }
}
