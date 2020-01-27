package team6.xml_project.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import team6.xml_project.exception.UserNotFoundException;
import team6.xml_project.models.User;
import team6.xml_project.repository.UserRepository;
import team6.xml_project.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }

    @Override
    public List<User> findByIds(List<Long> ids) {
        return userRepository.findAllById(ids);
    }

    @Override
    public User findByEmail(String email) { return userRepository.findUserByEmail(email).orElseThrow(UserNotFoundException::new);}

    @Override
    public void register(User user) {
        user.setPasswordHash(passwordEncoder.encode(user.getPasswordHash()));
        this.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User update(User oldUser, User updatedUser) {
        oldUser.setName(updatedUser.getName());
        oldUser.setSurname(updatedUser.getSurname());
        oldUser.setEmail(updatedUser.getEmail());
        if(!updatedUser.getPasswordHash().trim().equals("")){
            oldUser.setPasswordHash(passwordEncoder.encode(updatedUser.getPasswordHash()));
        }
        return this.save(oldUser);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }
}
