package team6.xml_project.web.dto.submission;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SetEditorDTO {
    private Long editorId;

    public SetEditorDTO(){

    }

    public SetEditorDTO(Long editorId) {
        this.editorId = editorId;
    }
}
