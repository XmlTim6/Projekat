package team6.xml_project.web.controller;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import team6.xml_project.exception.UserNotFoundException;
import team6.xml_project.models.User;
import team6.xml_project.security.TokenUtils;
import team6.xml_project.service.UserService;
import team6.xml_project.web.dto.user.LoginInfoDTO;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Qualifier("userDetailsServiceImpl")
    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private UserService userService;

    @Autowired
    TokenUtils tokenUtils;

    @Validated
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> authenticate(@Valid @RequestBody LoginInfoDTO loginInfo){
        try {
            String token = tryToAuthenticate(loginInfo);
            return new ResponseEntity<>(token, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>("Login failed; Invalid user email or password", HttpStatus.BAD_REQUEST);
        }
    }

    private String tryToAuthenticate(LoginInfoDTO loginInfo) throws UserNotFoundException, MessagingException {
        User user = userService.findByEmail(loginInfo.getEmail());
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
                user.getId(), loginInfo.getPassword());
        Authentication authentication = authenticationManager.authenticate(token);
        UserDetails details = userDetailsService.loadUserByUsername(user.getId().toString());
        return tokenUtils.generateToken(details, user.getRole() );
    }

}
