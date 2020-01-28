package team6.xml_project.repository;

import org.xmldb.api.base.ResourceSet;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.models.xml.submission.Submission;

public interface PaperRepository {

    Paper getById(String collectionId, String documentId) throws Exception;

    void save(String paper, Submission submission, String documentName);

    void save(Paper paper, Submission submission, String documentName);

    public boolean checkIfPaperExists(Submission submission, String documentId) throws Exception;
}
