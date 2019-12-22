package team6.xml_project.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.service.PaperService;

@RestController
@RequestMapping(value = "api/paper")
public class PaperController {

    @Autowired
    PaperService paperService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Boolean> createCoverLetter(@RequestBody Paper paper){
        try{
            paperService.save(paper);
        }catch (Exception ignored){

        }
        return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.CREATED);
    }
}
