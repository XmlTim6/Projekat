package team6.xml_project.web.controller;

import com.google.common.collect.Lists;
import jdk.nashorn.internal.parser.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import team6.xml_project.exception.FailedToGenerateDocumentException;
import team6.xml_project.exception.SubmissionNotFoundException;
import team6.xml_project.helpers.AuthHelper;
import team6.xml_project.helpers.XMLMarshaller;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.security.TokenUtils;
import team6.xml_project.service.PaperService;
import team6.xml_project.service.SubmissionService;
import team6.xml_project.service.XSLTransformationService;

import javax.xml.bind.JAXBException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/paper")
@CrossOrigin
public class PaperController {

    @Autowired
    PaperService paperService;

    @Autowired
    SubmissionService submissionService;

    @Autowired
    XSLTransformationService xslTransformationService;

    @Autowired
    TokenUtils tokenUtils;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Object> getPaper(
            @RequestParam(value = "collection") String collection,
            @RequestParam(value = "revision") Long revision,
            @RequestParam(value = "document") String document,
            @RequestParam(value = "format") String format,
            @RequestParam(value = "token") String token) throws JAXBException {
        try {
            long userId = Long.parseLong(tokenUtils.getUsernameFromToken(token));
            String paperStr = paperService.findPaper(String.format("/db/xml_project_tim6/papers/%s/revision_%s",
                    collection, revision), document, userId, collection);

            if(format.equals("pdf")){
                OutputStream output = xslTransformationService.createPdf(paperStr, "data/xsl/xsl-fo/paper_pdf.xsl");
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
                OutputStream output = xslTransformationService.createHtml(paperStr, "data/xsl/xslt/paper_Html.xsl");
                byte[] contents = output.toString().getBytes();
                return new ResponseEntity<>(contents, HttpStatus.OK);
            }
            byte[] contents = paperStr.getBytes();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_XML);
            String filename = "paper.xml";
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

    @RequestMapping(value = "/basicSearch", method = RequestMethod.GET)
    public ResponseEntity<List<String>> basicSearch(@RequestParam(value = "term") String searchTerm) {
        try {
            return new ResponseEntity<>(paperService.findPaperURIsMatchingText(searchTerm), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(Lists.newArrayList(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/advancedSearch", method = RequestMethod.GET)
    public ResponseEntity<String> advancedSearch(
            @RequestParam(value = "paperId", required = false, defaultValue = "") String id,
            @RequestParam(value = "paperTitle", required = false, defaultValue = "") String title,
            @RequestParam(value = "paperAuthor", required = false, defaultValue = "") String author,
            @RequestParam(value = "keywords", required = false, defaultValue = "") String keywords,
            @RequestParam(value = "type", required = false, defaultValue = "json") String type) {

        return new ResponseEntity<>(paperService.findPapersByMetadata(
                id, title, author, Arrays.stream(keywords.split(",")).map(String::trim).collect(Collectors.toList()), type), HttpStatus.OK);
    }

    @RequestMapping(value = "/citedBy", method = RequestMethod.GET)
    public ResponseEntity<String> citedBy(
            @RequestParam(value = "paperLocation") String paperLocation,
            @RequestParam(value = "type", required = false, defaultValue = "json") String type) {
        return new ResponseEntity<>(paperService.findPapersCitingPaper(paperLocation, type), HttpStatus.OK);
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

}
