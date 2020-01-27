package team6.xml_project.web.dto.user;

import lombok.Getter;
import lombok.Setter;
import team6.xml_project.models.User;

import java.util.List;

@Getter
@Setter
public class UserProfileDTO {

    private String name;

    private String surname;

    private String email;

    private List<String> expertises;

    public UserProfileDTO(){}

    public UserProfileDTO(User user){
        this.name = user.getName();
        this.surname = user.getSurname();
        this.email = user.getEmail();
        this.expertises = user.getExpertise();
    }
}
