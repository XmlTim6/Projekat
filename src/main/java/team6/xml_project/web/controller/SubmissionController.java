package team6.xml_project.web.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import team6.xml_project.models.Submission;
import team6.xml_project.models.SubmissionStatus;
import team6.xml_project.service.SubmissionService;
import team6.xml_project.specification.SubmissionWithStatus;
import team6.xml_project.web.dto.ReviewerListDTO;
import team6.xml_project.web.dto.submission.SubmissionGetDTO;
import team6.xml_project.web.dto.submission.SubmissionPage;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/submission")
@CrossOrigin
public class SubmissionController {

    @Autowired
    private SubmissionService submissionService;

    @RequestMapping(method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", dataType = "integer", paramType = "query",
                    value = "Results page you want to retrieve (0..N)", defaultValue = "0"),
            @ApiImplicitParam(name = "size", dataType = "integer", paramType = "query",
                    value = "Number of records per page.", defaultValue = "5"),
            @ApiImplicitParam(name = "sort", allowMultiple = true, dataType = "string", paramType = "query",
                    value = "Sorting criteria in the format: property(,asc|desc). " +
                            "Default sort order is ascending. " +
                            "Multiple sort criteria are supported.")
    })
    @PreAuthorize("hasRole('EDITOR')")
    public ResponseEntity<SubmissionPage> getSubmissions(
            @RequestParam(value = "status", required = false) SubmissionStatus status,
            @ApiIgnore(
                    "Ignored because swagger ui shows the wrong params, " +
                            "instead they are explained in the implicit params"
            )
            Pageable page) {
        Specification<Submission> specification = Specification.where(new SubmissionWithStatus(status));
        Page<Submission> submissions = submissionService.findAll(specification, page);

        List<SubmissionGetDTO> submissionDTOs = submissions.get().map(SubmissionGetDTO::new).collect(Collectors.toList());
        SubmissionPage submissionPage = new SubmissionPage(submissionDTOs, submissions.getPageable(), submissions.getTotalElements());
        return new ResponseEntity<>(submissionPage, HttpStatus.OK);
    }

    @RequestMapping(value = "/authored", method = RequestMethod.GET)
    @PreAuthorize("hasRole('AUTHOR')")
    public ResponseEntity<List<SubmissionGetDTO>> getSubmissionsOfAuthor() {
        Long userId = this.getCurrentUserId();
        List<Submission> submissions = submissionService.findAllByAuthorId(userId);

        List<SubmissionGetDTO> submissionDTOs = submissions.stream().
                map(SubmissionGetDTO::new).collect(Collectors.toList());
        return new ResponseEntity<>(submissionDTOs, HttpStatus.OK);
    }

    @RequestMapping(value = "/reviewable", method = RequestMethod.GET)
    @PreAuthorize("hasRole('AUTHOR')")
    public ResponseEntity<List<SubmissionGetDTO>> getReviewableSubmissionsForReviewer() {
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
    public ResponseEntity addRevision(@PathVariable Long submission_id, @RequestBody String revision) {
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
    public ResponseEntity addReview(@PathVariable Long submission_id, @RequestBody String review) {
        try {
            Long userId = this.getCurrentUserId();
            submissionService.addReview(submission_id, review, userId);
        } catch (Exception ex){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(value="/{submission_id}/set_editor", method = RequestMethod.PUT)
    @PreAuthorize("hasRole('EDITOR')")
    public ResponseEntity setEditor(@PathVariable Long submission_id, @RequestBody Long editorId) {
        submissionService.setSubmissionEditor(submission_id, editorId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value="/{submission_id}/set_reviewers", method = RequestMethod.PUT)
    @PreAuthorize("hasRole('EDITOR')")
    public ResponseEntity setReviewers(@PathVariable Long submission_id,
                                       @Valid @RequestBody ReviewerListDTO reviewers) {
        Long userId = this.getCurrentUserId();
        submissionService.setSubmissionReviewers(submission_id, userId, reviewers.getReviewerIds());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value="/{submission_id}/set_status", method = RequestMethod.PUT)
    @PreAuthorize("hasRole('EDITOR')")
    public ResponseEntity setStatus(@PathVariable Long submission_id,
                                       @Valid @RequestBody SubmissionStatus status) {
        Long userId = this.getCurrentUserId();
        submissionService.setSubmissionStatus(submission_id, userId, status);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value="/{submission_id}/takedown", method = RequestMethod.PUT)
    @PreAuthorize("hasRole('AUTHOR')")
    public ResponseEntity setStatus(@PathVariable Long submission_id) {
        Long userId = this.getCurrentUserId();
        submissionService.setSubmissionStatus(submission_id, userId, SubmissionStatus.AUTHOR_TAKEDOWN);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private Long getCurrentUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return Long.parseLong(authentication.getName());
    }

}
