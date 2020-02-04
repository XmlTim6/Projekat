package team6.xml_project.repository.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.base.XMLDBException;
import team6.xml_project.exception.DocumentNotSavedException;
import team6.xml_project.helpers.XMLUnmarshaller;
import team6.xml_project.models.xml.cover_letter.CoverLetter;
import team6.xml_project.models.xml.review_form.ReviewForm;
import team6.xml_project.models.xml.submission.Submission;
import team6.xml_project.repository.DocumentRepository;
import team6.xml_project.repository.ReviewFormRepository;

import java.util.List;

import static team6.xml_project.repository.implementation.DocumentRepositoryImpl.getURIs;

@Repository
public class ReviewFormRepositoryImpl implements ReviewFormRepository {

    @Autowired
    private DocumentRepository documentRepository;

    private static final String reviewFormCollections = "/db/xml_project_tim6/reviewForms/";

    @Override
    public void save(String reviewForm, Submission submission, Long reviewerId) {
        try {
            documentRepository.save(reviewForm, String.format("/db/xml_project_tim6/reviewForms/%s/revision_%s/",
                    submission.getId(), submission.getCurrentRevision()),
                    String.format("review_form_%s.xml", reviewerId));
        } catch (Exception e) {
            throw new DocumentNotSavedException();
        }
    }

    @Override
    public String find(String submissionId, Long revision, String documentName) throws Exception {
        return documentRepository.getDocumentById( String.format("/db/xml_project_tim6/reviewForms/%s/revision_%s/",
                submissionId, revision), documentName);
    }

    @Override
    public List<String> getAllReviewFormURIsOfSubmission(String submissionId) throws Exception {
        String xquery = String.format("xquery version \"3.0\";\n" +
                "\n" +
                "declare default element namespace \"XML_tim6\";\n" +
                "\n" +
                "for $reviewForm in collection(\"/db/xml_project_tim6/reviewForms/%s\")\n" +
                "return base-uri($reviewForm)", submissionId);

        return getURIs(xquery, documentRepository, reviewFormCollections);
    }

    @Override
    public boolean checkIfReviewFormExists(Submission submission, String documentName) throws Exception {
        ResourceSet resourceSet = documentRepository.checkIfDocumentExist(
                String.format("/db/xml_project_tim6/reviewForms/%s/revision_%s/",
                submission.getId(), submission.getCurrentRevision()), documentName);
        return Boolean.parseBoolean(String.valueOf(resourceSet.getResource(0L).getContent()));
    }
}
