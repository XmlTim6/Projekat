package team6.xml_project.repository.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import team6.xml_project.exception.DocumentNotSavedException;
import team6.xml_project.helpers.XMLUnmarshaller;
import team6.xml_project.models.xml.cover_letter.CoverLetter;
import team6.xml_project.models.xml.submission.Submission;
import team6.xml_project.repository.CoverLetterRepository;
import team6.xml_project.repository.DocumentRepository;

import java.util.List;

import static team6.xml_project.repository.implementation.DocumentRepositoryImpl.getURIs;

@Repository
public class CoverLetterRepositoryImpl implements CoverLetterRepository {

    @Autowired
    private DocumentRepository documentRepository;

    private static final String coverLetterCollections = "/db/xml_project_tim6/coverLetters/";

    @Override
    public void save(String coverLetter, Submission submission) {
        try {
            CoverLetter coverLetterObject = XMLUnmarshaller.createCoverLetterFromXML(coverLetter);
            documentRepository.save(coverLetterObject, String.format("/db/xml_project_tim6/coverLetters/%s/revision_%s/",
                    submission.getId(), submission.getCurrentRevision()), "coverLetter.xml");
        } catch (Exception e) {
            throw new DocumentNotSavedException();
        }
    }

    @Override
    public CoverLetter find(String submissionId, Long revision) throws Exception {
        CoverLetter coverLetter = new CoverLetter();
        coverLetter = (CoverLetter) documentRepository.getDocumentById(coverLetter, String.format("/db/xml_project_tim6/coverLetters/%s/revision_%s/",
                submissionId, revision), "coverLetter.xml");
        return coverLetter;
    }

    @Override
    public List<String> getAllCoverLetterURIsOfSubmission(String submissionId) throws Exception {
        String xquery = String.format("xquery version \"3.0\";\n" +
                "\n" +
                "declare default element namespace \"XML_tim6\";\n" +
                "\n" +
                "for $coverLetter in collection(\"/db/xml_project_tim6/coverLetters/%s\")\n" +
                "return base-uri($coverLetter)", submissionId);

        return getURIs(xquery, documentRepository, coverLetterCollections);
    }
}
