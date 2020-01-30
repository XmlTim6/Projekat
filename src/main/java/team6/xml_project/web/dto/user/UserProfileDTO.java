package team6.xml_project.web.dto.user;

import lombok.Getter;
import lombok.Setter;
import team6.xml_project.models.Role;
import team6.xml_project.models.User;

import java.util.List;

@Getter
@Setter
public class UserProfileDTO {

    private Long id;

    private String name;

    private String surname;

    private String email;

    private List<String> expertises;

    private Role role;

    public UserProfileDTO(){}

    public UserProfileDTO(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.surname = user.getSurname();
        this.email = user.getEmail();
        this.expertises = user.getExpertise();
        this.role = user.getRole();
    }
}
