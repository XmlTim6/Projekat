package team6.xml_project.web.dto.user;

import lombok.Getter;
import lombok.Setter;
import team6.xml_project.validator.ValidEmail;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
public class UpdateUserDTO {

    @Size(max = 32, message = "User's name cannot be longer than 32 characters")
    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Size(max = 32, message = "User's surname cannot be longer than 32 characters")
    @NotBlank(message = "Surname cannot be empty")
    private String surname;

    @Size(max = 128, message = "User's password cannot be longer than 32 characters")
    @NotNull(message = "Password cannot be null")
    private String password;

    @Size(max = 64, message = "User's e,ao; cannot be longer than 64 characters" )
    @ValidEmail(message = "Email format is not valid")
    @NotBlank(message = "Email cannot be empty")
    private String email;

    private List<String> expertises;

    public UpdateUserDTO(){}

    public UpdateUserDTO(@Size(max = 32, message = "User's name cannot be longer than 32 characters") @NotBlank(message = "Name cannot be empty") String name, @Size(max = 32, message = "User's surname cannot be longer than 32 characters") @NotBlank(message = "Surname cannot be empty") String surname, @Size(max = 128, message = "User's password cannot be longer than 32 characters") @NotNull(message = "Password cannot be null") String password, @Size(max = 64, message = "User's e,ao; cannot be longer than 64 characters") @NotBlank(message = "Email cannot be empty") String email, List<String> expertises) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.expertises = expertises;
    }
}
