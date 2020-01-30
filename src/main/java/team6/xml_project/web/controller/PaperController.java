package team6.xml_project.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import team6.xml_project.exception.SubmissionNotFoundException;
import team6.xml_project.helpers.AuthHelper;
import team6.xml_project.helpers.XMLMarshaller;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.service.PaperService;
import team6.xml_project.service.SubmissionService;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/api/paper")
@CrossOrigin
public class PaperController {

    @Autowired
    PaperService paperService;

    @Autowired
    SubmissionService submissionService;

    @RequestMapping(produces = MediaType.APPLICATION_XML_VALUE, method = RequestMethod.GET)
    public ResponseEntity<String> getPaper(
            @RequestParam(value = "collection") String collection,
            @RequestParam(value = "revision") Long revision,
            @RequestParam(value = "document") String document) throws JAXBException {
        Paper paper = paperService.findPaper(String.format("/db/xml_project_tim6/papers/%s/revision_%s",
                collection, revision), document);
        return new ResponseEntity<>(XMLMarshaller.createStringFromPaper(paper), HttpStatus.OK);
    }

    @RequestMapping(value = "/papersOfSubmission", method = RequestMethod.GET)
    public ResponseEntity<List<String>> getPaperURIsOfSubmission(@RequestParam(value = "submission") String submission) {
        try {
            Long userId = AuthHelper.getCurrentUserId();
            List<String> paperURIs = paperService.findPaperURIsOfSubmission(submission, userId);
            return new ResponseEntity<>(paperURIs, HttpStatus.OK);
        } catch (Exception e) {
            throw new SubmissionNotFoundException();
        }
    }

    @RequestMapping(produces = MediaType.APPLICATION_XML_VALUE, value="/{id}/metadata", method = RequestMethod.GET)
    public ResponseEntity<String> getPaperMetadata(@PathVariable String id) throws IOException {
        return new ResponseEntity<>(paperService.findPaperMetadataById(id), HttpStatus.OK);
    }

    @RequestMapping(produces = MediaType.APPLICATION_XML_VALUE, value="/metadata", method = RequestMethod.GET)
    public ResponseEntity<String> getPaperMetadata(
            @RequestParam(value = "author", required = false) String author,
            @RequestParam(value = "title", required = false) String title) throws IOException {
        if (title != null && !title.isEmpty())
            return new ResponseEntity<>(paperService.findPapersMetadataByTitle(title), HttpStatus.OK);
        else if (author != null && !author.isEmpty())
            return new ResponseEntity<>(paperService.findPapersMetadataByAuthorName(author), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
