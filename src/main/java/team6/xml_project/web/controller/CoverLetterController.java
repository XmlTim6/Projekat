package team6.xml_project.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import team6.xml_project.exception.FailedToGenerateDocumentException;
import team6.xml_project.exception.SubmissionNotFoundException;
import team6.xml_project.helpers.AuthHelper;
import team6.xml_project.helpers.XMLMarshaller;
import team6.xml_project.models.xml.cover_letter.CoverLetter;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.security.TokenUtils;
import team6.xml_project.service.CoverLetterService;
import team6.xml_project.service.XSLTransformationService;

import javax.xml.bind.JAXBException;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;

@RestController
@RequestMapping(value = "api/coverLetter")
@CrossOrigin
public class CoverLetterController {

    @Autowired
    CoverLetterService coverLetterService;

    @Autowired
    TokenUtils tokenUtils;

    @Autowired
    XSLTransformationService xslTransformationService;

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
    public ResponseEntity<Object>  getCoverLetter(
            @RequestParam(value = "collection") String collection,
            @RequestParam(value = "revision") Long revision,
            @RequestParam(value = "document") String document,
            @RequestParam(value = "format") String format,
            @RequestParam(value = "token") String token) throws JAXBException {

        try {
            long userId = Long.parseLong(tokenUtils.getUsernameFromToken(token));
            CoverLetter coverLetter = coverLetterService.findCoverLetter(collection, revision, userId);
            String coverLetterStr = XMLMarshaller.createStringFromCoverLetter(coverLetter);
            if(format.equals("pdf")){
                OutputStream output = xslTransformationService.createPdf(coverLetterStr, "data/xsl/xsl-fo/cover_letter_pdf.xsl");
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
            }else if(format.equals("html")){
                OutputStream output = xslTransformationService.createHtml(coverLetterStr, "data/xsl/xslt/cover_letter_Html.xsl");
                byte[] contents = output.toString().getBytes();
                return new ResponseEntity<>(contents, HttpStatus.OK);
            }
            byte[] contents = coverLetterStr.getBytes();
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
        } catch (Exception e) {
            throw new FailedToGenerateDocumentException();
        }

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
