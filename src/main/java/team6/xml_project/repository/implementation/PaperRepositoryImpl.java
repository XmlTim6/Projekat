package team6.xml_project.repository.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.xmldb.api.base.Resource;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.base.XMLDBException;
import team6.xml_project.exception.DocumentNotSavedException;
import team6.xml_project.helpers.XMLUnmarshaller;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.models.xml.submission.Submission;
import team6.xml_project.repository.DocumentRepository;
import team6.xml_project.repository.PaperRepository;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static team6.xml_project.repository.implementation.DocumentRepositoryImpl.getURIs;

@Repository
public class PaperRepositoryImpl implements PaperRepository {

    @Autowired
    private DocumentRepository documentRepository;

    private static final String paperCollections = "/db/xml_project_tim6/papers/";

    @Override
    public Paper get(String collectionId, String documentId) throws Exception {
        Paper paper = new Paper();
        paper = (Paper) documentRepository.getDocumentById(paper, collectionId, documentId);
        return paper;
    }

    @Override
    public List<String> getAllPaperURIsOfSubmission(String submissionId) throws Exception {
        String xquery = String.format("xquery version \"3.0\";\n" +
                "\n" +
                "declare default element namespace \"XML_tim6\";\n" +
                "\n" +
                "for $paper in collection(\"/db/xml_project_tim6/papers/%s\")\n" +
                "return base-uri($paper)", submissionId);

        return getURIs(xquery, documentRepository, paperCollections);
    }

    @Override
    public void save(String paper, Submission submission, String documentName) {
        try {
            Paper paperObject = XMLUnmarshaller.createPaperFromXML(paper);
            documentRepository.save(paperObject, String.format("/db/xml_project_tim6/papers/%s/revision_%s/",
                    submission.getId(), submission.getCurrentRevision()), documentName);
        } catch (Exception e) {
            throw new DocumentNotSavedException();
        }
    }

    @Override
    public void save(Paper paper, Submission submission, String documentName) {
        try {
            documentRepository.save(paper, String.format("/db/xml_project_tim6/papers/%s/revision_%s/",
                    submission.getId(), submission.getCurrentRevision()), documentName);
        } catch (Exception e) {
            throw new DocumentNotSavedException();
        }
    }

    @Override
    public boolean checkIfPaperExists(Submission submission, String documentId) throws Exception {
        ResourceSet resourceSet = documentRepository.checkIfDocumentExist(String.format("/db/xml_project_tim6/papers/%s/revision_%s/",
                submission.getId(), submission.getCurrentRevision()), documentId);
        return Boolean.parseBoolean(String.valueOf(resourceSet.getResource(0L).getContent()));
    }

}
