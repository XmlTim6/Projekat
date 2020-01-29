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
import team6.xml_project.models.Role;
import team6.xml_project.models.User;
import team6.xml_project.service.UserService;
import team6.xml_project.web.dto.user.RegisterUserDTO;
import team6.xml_project.web.dto.user.UpdateUserDTO;
import team6.xml_project.web.dto.user.UserProfileDTO;

import javax.validation.Valid;

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

