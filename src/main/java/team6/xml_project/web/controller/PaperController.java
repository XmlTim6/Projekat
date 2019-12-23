package team6.xml_project.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.service.PaperService;

import javax.xml.transform.TransformerException;
import java.io.*;

@RestController
@RequestMapping(value = "api/paper")
public class PaperController {

    @Autowired
    PaperService paperService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Boolean> createPaper(@RequestBody Paper paper){
        try{
            paperService.save(paper);
        }catch (Exception ignored){

        }
        return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.CREATED);
    }

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
