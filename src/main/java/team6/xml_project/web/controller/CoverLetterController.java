package team6.xml_project.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import team6.xml_project.exception.SubmissionNotFoundException;
import team6.xml_project.helpers.AuthHelper;
import team6.xml_project.helpers.XMLMarshaller;
import team6.xml_project.models.xml.cover_letter.CoverLetter;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.service.CoverLetterService;

import javax.xml.bind.JAXBException;
import java.util.List;

@RestController
@RequestMapping(value = "api/coverLetter")
public class CoverLetterController {

    @Autowired
    CoverLetterService coverLetterService;

    @RequestMapping(value = "/{submission_id}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity createCoverLetter(@PathVariable String submission_id, @RequestBody String coverLetter){
        try {
            Long userId = AuthHelper.getCurrentUserId();
            coverLetterService.save(coverLetter, submission_id, userId);
        } catch (Exception ex) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(produces = MediaType.APPLICATION_XML_VALUE, method = RequestMethod.GET)
    @PreAuthorize("hasRole('AUTHOR') or hasRole('EDITOR')")
    public ResponseEntity<String> getCoverLetter(
            @RequestParam(value = "submissionId") String submissionId,
            @RequestParam(value = "revision") Long revision) throws JAXBException {
        Long userId = AuthHelper.getCurrentUserId();
        CoverLetter coverLetter = coverLetterService.findCoverLetter(submissionId, revision, userId);
        return new ResponseEntity<>(XMLMarshaller.createStringFromCoverLetter(coverLetter), HttpStatus.OK);
    }

    @RequestMapping(value = "/coverLettersOfSubmission", method = RequestMethod.GET)
    @PreAuthorize("hasRole('AUTHOR') or hasRole('EDITOR')")
    public ResponseEntity<List<String>> getCoverLetterURIsOfSubmission(
            @RequestParam(value = "submissionId") String submissionId) {
        Long userId = AuthHelper.getCurrentUserId();
        List<String> coverLetterURIs = coverLetterService.findCoverLetterURIsOfSubmission(submissionId, userId);
        return new ResponseEntity<>(coverLetterURIs, HttpStatus.OK);
    }
}
