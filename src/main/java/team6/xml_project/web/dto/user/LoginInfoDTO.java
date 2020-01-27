package team6.xml_project.web.dto.user;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class LoginInfoDTO {

    @NotBlank(message = "Email cannot be empty")
    private String email;

    @NotBlank(message = "Password cannot be empty")
    private String password;

    public LoginInfoDTO(){}

    public LoginInfoDTO(@NotBlank(message = "Email cannot be empty") String email, @NotBlank(message = "Password cannot be empty") String password) {
        this.email = email;
        this.password = password;
    }
}
