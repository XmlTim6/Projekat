package team6.xml_project.service;

import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.models.xml.submission.Submission;

import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface PaperService {

    void save(String paperXML) throws Exception;

    void save(String paper, Submission submission, String documentName);

    boolean checkIfPaperExists(Submission submission, String documentName) throws Exception;

    Paper findPaper(String collectionName, String documentName);

    InputStream createPaperRDFStreamFromXML(String paperXML) throws FileNotFoundException, TransformerException;

    String findPapersMetadataByAuthorName(String name) throws IOException;

    String findPapersMetadataByTitle(String title) throws IOException;

    String findPaperMetadataById(String id) throws IOException;
}
