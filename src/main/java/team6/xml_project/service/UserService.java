package team6.xml_project.service;

import org.springframework.stereotype.Service;
import team6.xml_project.models.User;

import java.util.List;

@Service
public interface UserService {

    User findById(Long id);

    List<User> findByIds(List<Long> ids);

    User findByEmail(String email);

    List<User> findAll();

    void register(User user);

    User save(User user);

    User update(User oldUser, User updatedUser);

    void remove(Long id);
}
