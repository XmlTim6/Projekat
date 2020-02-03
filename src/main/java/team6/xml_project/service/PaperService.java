package team6.xml_project.service;

import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.models.xml.submission.Submission;

import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public interface PaperService {

    void save(String paper, Submission submission, String documentName);

    boolean checkIfPaperExists(Submission submission, String documentName) throws Exception;

    Paper findPaper(String collectionName, String documentName, long userId, String submissionId);

    InputStream createPaperRDFStreamFromXML(String paperXML) throws FileNotFoundException, TransformerException;

    List<String> findPaperURIsOfSubmission(String submissionId, Long userId) throws Exception;

    List<String> findPaperURIsMatchingText(String searchTerm) throws Exception;

    String findPapersByMetadata(String paperId, String paperTitle, String authorName, List<String> keywords, String type);

    String findPapersCitingPaper(String paperLocation, String type);
}
