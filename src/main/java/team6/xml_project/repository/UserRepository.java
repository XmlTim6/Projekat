package team6.xml_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team6.xml_project.models.User;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findDistinctUsersByIdIsIn(Collection<Long> ids);

    List<User> findUsersDistinctByExpertiseIn(Collection<String> expertises);

    Optional<User> findUserByEmail(String email);

    Optional<User> findUsersByNameOrSurnameLike(String name, String surname);
}
