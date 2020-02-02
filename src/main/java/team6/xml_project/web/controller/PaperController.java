package team6.xml_project.web.controller;

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
import java.util.List;

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
            Paper paper = paperService.findPaper(String.format("/db/xml_project_tim6/papers/%s/revision_%s",
                    collection, revision), document, userId, collection);

            String paperStr = XMLMarshaller.createStringFromPaper(paper);
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
                return new ResponseEntity<>(output, HttpStatus.OK);
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
