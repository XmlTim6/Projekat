package team6.xml_project.repository;

import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.models.xml.submission.Submission;

import java.util.List;

public interface PaperRepository {

    String get(String collectionId, String documentId) throws Exception;

    List<String> getAllPaperURIsOfSubmission(String submissionId) throws Exception;

    List<String> findPaperURIsMatchingText(String text) throws Exception;

    void save(String paper, Submission submission, String documentName);

    void save(Paper paper, Submission submission, String documentName);

    public boolean checkIfPaperExists(Submission submission, String documentId) throws Exception;
}
