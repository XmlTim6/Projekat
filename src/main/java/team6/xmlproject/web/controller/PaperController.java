package team6.xmlproject.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import team6.xmlproject.service.PaperService;

import javax.xml.transform.TransformerException;
import java.io.*;

@RestController
@RequestMapping(value="api/papers")
public class PaperController {

    @Autowired
    private PaperService paperService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> addPaperMetadata() throws FileNotFoundException, TransformerException {
        paperService.extractRDFMetadata(
                new FileInputStream(new File("data/paper/instance2.xml")),
                new FileOutputStream(new File("data/gen/instance2.rdf")));
        paperService.addPaper("data/gen/instance2.rdf");
        return null;
    }

    @RequestMapping(value="/{id}/metadata", method = RequestMethod.GET)
    public ResponseEntity<String> getPaperMetadata(@PathVariable String id) throws IOException {
        return new ResponseEntity<>(paperService.findPaperMetadataById(id), HttpStatus.OK);
    }

    @RequestMapping(value="/metadata", method = RequestMethod.GET)
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
