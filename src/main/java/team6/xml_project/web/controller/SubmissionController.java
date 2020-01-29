package team6.xml_project.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import team6.xml_project.models.SubmissionStatus;
import team6.xml_project.models.xml.submission.Submission;
import team6.xml_project.service.SubmissionService;
import team6.xml_project.web.dto.ReviewerListDTO;
import team6.xml_project.web.dto.submission.SetEditorDTO;
import team6.xml_project.web.dto.submission.SubmissionGetDTO;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/submission")
@CrossOrigin
public class SubmissionController {

    @Autowired
    private SubmissionService submissionService;

    @RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("hasRole('EDITOR')")
    public ResponseEntity<List<SubmissionGetDTO>> getSubmissions(
            @RequestParam(value = "status", required = false) SubmissionStatus status) throws Exception {
        List<Submission> submissions;
        if (status == null) {
            submissions = submissionService.findAll();
        } else {
            submissions = submissionService.findAllByStatus(status);
        }

        List<SubmissionGetDTO> submissionDTOs = submissions.stream().
                map(SubmissionGetDTO::new).collect(Collectors.toList());
        return new ResponseEntity<>(submissionDTOs, HttpStatus.OK);
    }

    @RequestMapping(value = "/authored", method = RequestMethod.GET)
    @PreAuthorize("hasRole('AUTHOR')")
    public ResponseEntity<List<SubmissionGetDTO>> getSubmissionsOfAuthor() throws Exception {
        Long userId = this.getCurrentUserId();
        List<Submission> submissions = submissionService.findAllByAuthorId(userId);

        List<SubmissionGetDTO> submissionDTOs = submissions.stream().
                map(SubmissionGetDTO::new).collect(Collectors.toList());
        return new ResponseEntity<>(submissionDTOs, HttpStatus.OK);
    }

    @RequestMapping(value = "/reviewable", method = RequestMethod.GET)
    @PreAuthorize("hasRole('AUTHOR')")
    public ResponseEntity<List<SubmissionGetDTO>> getReviewableSubmissionsForReviewer() throws Exception {
        Long userId = this.getCurrentUserId();
        List<Submission> submissions = submissionService.findAllNeedingReviewByReviewerId(userId);

        List<SubmissionGetDTO> submissionDTOs = submissions.stream().
                map(SubmissionGetDTO::new).collect(Collectors.toList());
        return new ResponseEntity<>(submissionDTOs, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE)
    @PreAuthorize("hasRole('AUTHOR')")
    public ResponseEntity addSubmission(@RequestBody String paper) {
        try {
            Long userId = this.getCurrentUserId();
            submissionService.create(paper, userId);
        } catch (Exception ex) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{submission_id}/revision", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE)
    @PreAuthorize("hasRole('AUTHOR')")
    public ResponseEntity addRevision(@PathVariable String submission_id, @RequestBody String revision) {
        try {
            Long userId = this.getCurrentUserId();
            submissionService.addRevision(submission_id, revision, userId);
        } catch (Exception ex) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{submission_id}/review", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE)
    @PreAuthorize("hasRole('AUTHOR')")
    public ResponseEntity addReview(@PathVariable String submission_id, @RequestBody String review) {
        try {
            Long userId = this.getCurrentUserId();
            submissionService.addReview(submission_id, review, userId);
        } catch (Exception ex){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(value="/{submission_id}/set_editor", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @PreAuthorize("hasRole('EDITOR')")
    public ResponseEntity setEditor(@PathVariable String submission_id, @RequestBody SetEditorDTO setEditorDTO) {
        submissionService.setSubmissionEditor(submission_id, setEditorDTO.getEditorId());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value="/{submission_id}/set_reviewers", method = RequestMethod.PUT)
    @PreAuthorize("hasRole('EDITOR')")
    public ResponseEntity setReviewers(@PathVariable String submission_id,
                                       @Valid @RequestBody ReviewerListDTO reviewers) {
        Long userId = this.getCurrentUserId();
        submissionService.setSubmissionReviewers(submission_id, userId, reviewers.getReviewerIds());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value="/{submission_id}/set_status", method = RequestMethod.PUT)
    @PreAuthorize("hasRole('EDITOR')")
    public ResponseEntity setStatus(@PathVariable String submission_id,
                                       @Valid @RequestBody SubmissionStatus status) {
        Long userId = this.getCurrentUserId();
        submissionService.setSubmissionStatus(submission_id, userId, status);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value="/{submission_id}/takedown", method = RequestMethod.PUT)
    @PreAuthorize("hasRole('AUTHOR')")
    public ResponseEntity setStatus(@PathVariable String submission_id) {
        Long userId = this.getCurrentUserId();
        submissionService.setSubmissionStatus(submission_id, userId, SubmissionStatus.AUTHOR_TAKEDOWN);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private Long getCurrentUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return Long.parseLong(authentication.getName());
    }

}
