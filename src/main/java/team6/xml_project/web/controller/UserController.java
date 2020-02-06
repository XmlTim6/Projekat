package team6.xml_project.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import team6.xml_project.exception.EmailAlreadyExistsException;
import team6.xml_project.exception.UserNotFoundException;
import team6.xml_project.helpers.AuthHelper;
import team6.xml_project.models.Role;
import team6.xml_project.models.User;
import team6.xml_project.models.xml.submission.Submission;
import team6.xml_project.service.PaperService;
import team6.xml_project.service.SubmissionService;
import team6.xml_project.service.UserService;
import team6.xml_project.web.dto.KeywordListDTO;
import team6.xml_project.web.dto.user.RegisterUserDTO;
import team6.xml_project.web.dto.user.UpdateUserDTO;
import team6.xml_project.web.dto.user.UserProfileDTO;

import javax.validation.Valid;
import javax.xml.bind.JAXBException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "api/users")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("hasAnyRole('AUTHOR','EDITOR')")
    public ResponseEntity<UserProfileDTO> getUserProfile(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Long id = Long.parseLong(authentication.getName());
        User currentUser = userService.findById(id);
        UserProfileDTO currentUserProfile = new UserProfileDTO(currentUser);
        return new ResponseEntity<>(currentUserProfile, HttpStatus.OK);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @PreAuthorize("hasAnyRole('EDITOR')")
    public ResponseEntity<List<UserProfileDTO>> getAll(){
        List<User> users = userService.findAll();
        List<UserProfileDTO> usersToReturn = users.stream()
                .sorted(Comparator.comparing(User::getRole))
                .map(UserProfileDTO::new)
                .collect(Collectors.toList());
        return new ResponseEntity<>(usersToReturn, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @PreAuthorize("hasAnyRole('AUTHOR','EDITOR')")
    public ResponseEntity<UserProfileDTO> updateUserProfile(@Valid @RequestBody UpdateUserDTO updatedRegisterUserDTO){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Long id = Long.parseLong(authentication.getName());
        User currentUser = userService.findById(id);

        User updatedUser = new User();
        updatedUser.setName(updatedRegisterUserDTO.getName());
        updatedUser.setSurname(updatedRegisterUserDTO.getSurname());
        updatedUser.setEmail(updatedRegisterUserDTO.getEmail());
        updatedUser.setPasswordHash(updatedRegisterUserDTO.getPassword());

        User retUser = userService.update(currentUser, updatedUser);
        UserProfileDTO retVal = new UserProfileDTO(retUser);
        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @RequestMapping(value = "/author", method = RequestMethod.POST, consumes="application/json")
    public ResponseEntity registerAuthor(@Valid @RequestBody RegisterUserDTO newUser){
        isDuplicateEmail(newUser);
        User user = new User(newUser.getEmail(), newUser.getPassword(),
                false, newUser.getName(), newUser.getSurname(),
                newUser.getExpertises(), Role.ROLE_AUTHOR);

        userService.register(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/editor", method = RequestMethod.POST, consumes="application/json")
    @PreAuthorize("hasRole('EDITOR')")
    public ResponseEntity registerEditor(@Valid @RequestBody RegisterUserDTO newUser){
        isDuplicateEmail(newUser);
        User user = new User(newUser.getEmail(), newUser.getPassword(),
                false, newUser.getName(), newUser.getSurname(),
                newUser.getExpertises(), Role.ROLE_EDITOR);

        userService.register(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/recommended-reviewers", method = RequestMethod.GET)
    @PreAuthorize("hasRole('EDITOR')")
    public ResponseEntity<List<UserProfileDTO>> recommendReviewersFor(@RequestParam(value = "submissionId") String submissionId) throws JAXBException {
        Long userId = AuthHelper.getCurrentUserId();

        List<User> users = userService.findRecommendedReviewersForSubmission(submissionId, userId);
        List<UserProfileDTO> result = users.stream().map(UserProfileDTO::new).collect(Collectors.toList());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    private void isDuplicateEmail(RegisterUserDTO newUser) {
        if (emailAlreadyExists(newUser.getEmail())){
            throw new EmailAlreadyExistsException();
        }
    }

    private Boolean emailAlreadyExists(String email){
        try {
            userService.findByEmail(email);
        } catch (UserNotFoundException e) {
            return false;
        }
        return true;

    }

}

