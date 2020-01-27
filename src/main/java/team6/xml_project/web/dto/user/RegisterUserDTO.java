package team6.xml_project.web.dto.user;

import lombok.Getter;
import lombok.Setter;
import team6.xml_project.models.User;
import team6.xml_project.validator.ValidEmail;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class RegisterUserDTO {

    @Size(max = 32, message = "User's name cannot be longer than 32 characters")
    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Size(max = 32, message = "User's surname cannot be longer than 32 characters")
    @NotBlank(message = "Surname cannot be empty")
    private String surname;

    @Size(max = 128, message = "User's password cannot be longer than 32 characters")
    @NotBlank(message = "Password cannot be empty")
    private String password;

    @Size(max = 64, message = "User's email cannot be longer than 64 characters" )
    @ValidEmail(message = "Email format is not valid")
    @NotBlank(message = "Email cannot be empty")
    private String email;

    private List<String> expertises = new ArrayList<>();

    public RegisterUserDTO(){}

    public RegisterUserDTO(User user) {
        this.name = user.getName();
        this.surname = user.getSurname();
        this.email = user.getEmail();
        this.expertises = user.getExpertise();
    }
}
