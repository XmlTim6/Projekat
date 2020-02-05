package team6.xml_project.web.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class KeywordListDTO {

    @NotNull
    @NotEmpty(message = "Must choose one or more keywords")
    public List<String> keywords;

    public KeywordListDTO(@NotNull @NotEmpty(message = "Must choose one or more keywords") List<String> keywords) {
        this.keywords = keywords;
    }

    public KeywordListDTO() {
    }

}