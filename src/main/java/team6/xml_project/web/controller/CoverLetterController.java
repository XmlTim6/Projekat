package team6.xml_project.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import team6.xml_project.helpers.AuthHelper;
import team6.xml_project.models.xml.cover_letter.CoverLetter;
import team6.xml_project.service.CoverLetterService;

@RestController
@RequestMapping(value = "api/coverLetter")
public class CoverLetterController {

    @Autowired
    CoverLetterService coverLetterService;

    @RequestMapping(value = "/{submission_id}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Boolean> createCoverLetter(@PathVariable String submission_id, @RequestBody String coverLetter){
        try {
            Long userId = AuthHelper.getCurrentUserId();
            coverLetterService.save(coverLetter, submission_id, userId);
        } catch (Exception ex) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
