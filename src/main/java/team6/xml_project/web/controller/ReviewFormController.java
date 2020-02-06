package team6.xml_project.web.controller;

import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import team6.xml_project.exception.FailedToGenerateDocumentException;
import team6.xml_project.exception.SubmissionNotFoundException;
import team6.xml_project.helpers.AuthHelper;
import team6.xml_project.helpers.XMLMarshaller;
import team6.xml_project.models.xml.cover_letter.CoverLetter;
import team6.xml_project.models.xml.review_form.ReviewForm;
import team6.xml_project.security.TokenUtils;
import team6.xml_project.service.CoverLetterService;
import team6.xml_project.service.ReviewFormService;
import team6.xml_project.service.XSLTransformationService;

import javax.xml.bind.JAXBException;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;

@RestController
@RequestMapping(value = "api/reviewForm")
@CrossOrigin
public class ReviewFormController {

    @Autowired
    ReviewFormService reviewFormService;

    @Autowired
    TokenUtils tokenUtils;

    @Autowired
    XSLTransformationService xslTransformationService;

    @RequestMapping(value = "/{submission_id}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE)
    @PreAuthorize("hasRole('AUTHOR')")
    public ResponseEntity createReviewForm(@PathVariable String submission_id, @RequestBody String reviewForm) throws Exception {
        Long userId = AuthHelper.getCurrentUserId();
        reviewFormService.save(reviewForm, submission_id, userId);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(produces = MediaType.APPLICATION_XML_VALUE, method = RequestMethod.GET)
    public ResponseEntity<Object> getReviewForm(
            @RequestParam(value = "collection") String collection,
            @RequestParam(value = "revision") Long revision,
            @RequestParam(value = "document") String document,
            @RequestParam(value = "format") String format,
            @RequestParam(value = "token") String token) throws JAXBException {
        try {
            long userId = Long.parseLong(tokenUtils.getUsernameFromToken(token));
            String reviewStr = reviewFormService.findReviewForm(collection, revision, document, userId);
            switch (format) {
                case "string":
                    return new ResponseEntity<>(reviewStr, HttpStatus.OK);
                case "pdf": {
                    OutputStream output = xslTransformationService.createPdf(reviewStr, "data/xsl/xsl-fo/review_form_pdf.xsl");
                    byte[] contents = ((ByteArrayOutputStream) output).toByteArray();
                    HttpHeaders headers = new HttpHeaders();
                    headers.setContentType(MediaType.APPLICATION_PDF);
                    String filename = "paper.pdf";
                    ContentDisposition contentDisposition = ContentDisposition
                            .builder("inline")
                            .filename(filename)
                            .build();
                    headers.setContentDisposition(contentDisposition);
                    headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
                    return new ResponseEntity<>(contents, headers, HttpStatus.OK);
                }
                case "html": {
                    OutputStream output = xslTransformationService.createHtml(reviewStr, "data/xsl/xslt/review_form_Html.xsl");
                    byte[] contents = output.toString().getBytes();
                    return new ResponseEntity<>(contents, HttpStatus.OK);
                }
                default: {
                    byte[] contents = reviewStr.getBytes();
                    HttpHeaders headers = new HttpHeaders();
                    headers.setContentType(MediaType.APPLICATION_XML);
                    String filename = "cover_letter.xml";
                    ContentDisposition contentDisposition = ContentDisposition
                            .builder("inline")
                            .filename(filename)
                            .build();
                    headers.setContentDisposition(contentDisposition);
                    headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
                    return new ResponseEntity<>(contents, headers, HttpStatus.OK);
                }
            }
        } catch (Exception e) {
            throw new FailedToGenerateDocumentException();
        }
    }

    @RequestMapping(value = "/reviewFormsOfSubmission", method = RequestMethod.GET)
    @PreAuthorize("hasRole('AUTHOR') or hasRole('EDITOR')")
    public ResponseEntity<List<String>> getReviewFormURIsOfSubmission(
            @RequestParam(value = "submissionId") String submissionId) {
        Long userId = AuthHelper.getCurrentUserId();
        List<String> reviewFormURIs = reviewFormService.findReviewFormURIsOfSubmission(submissionId, userId);
        return new ResponseEntity<>(reviewFormURIs, HttpStatus.OK);
    }

}
