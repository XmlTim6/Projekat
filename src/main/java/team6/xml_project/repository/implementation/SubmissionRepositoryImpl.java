package team6.xml_project.repository.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.xmldb.api.base.Resource;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.base.ResourceSet;
import team6.xml_project.exception.DocumentNotSavedException;
import team6.xml_project.models.SubmissionStatus;
import team6.xml_project.models.xml.submission.Submission;
import team6.xml_project.repository.DocumentRepository;
import team6.xml_project.repository.SubmissionRepository;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SubmissionRepositoryImpl implements SubmissionRepository {

    @Autowired
    private DocumentRepository documentRepository;

    private static final String submissionCollections = "/db/xml_project_tim6/submissions/";

    @Override
    public void save(Submission submission) {
        try {
            documentRepository.save(submission, submissionCollections, submission.getId());
        } catch (Exception e) {
            throw new DocumentNotSavedException();
        }
    }

    @Override
    public Submission getById(String submissionId) throws Exception {
        Submission submission = new Submission();
        submission = (Submission) documentRepository.getDocumentById(submission, submissionCollections, submissionId);
        return submission;
    }

    @Override
    public List<Submission> getAll() throws Exception {
        String xquery = String.format("xquery version \"3.1\";\n" +
                "\n" +
                "declare default element namespace \"XML_tim6\";\n" +
                "\n" +
                "for $submission in collection(\"%s\")//submission\n" +
                "where $submission/submissionStatus != \"%s\"\n" +
                "return $submission", submissionCollections, SubmissionStatus.AUTHOR_TAKEDOWN.toString());
        return getSubmissionsFromQuery(xquery);
    }

    @Override
    public List<Submission> findDistinctSubmissionsByAuthor_Id(Long authorId) throws Exception {
        String xquery = String.format("xquery version \"3.1\";\n" +
                "\n" +
                "declare default element namespace \"XML_tim6\";\n" +
                "\n" +
                "for $submission in collection(\"%s\")//submission\n" +
                "where $submission/authorId = %d and $submission/submissionStatus != \"%s\"\n" +
                "return $submission", submissionCollections, authorId, SubmissionStatus.AUTHOR_TAKEDOWN.toString());
        return getSubmissionsFromQuery(xquery);
    }

    @Override
    public List<Submission> findDistinctSubmissionsByReviewersContaining(Long reviewerId) throws Exception {
        String xquery = String.format("xquery version \"3.1\";\n" +
                "\n" +
                "declare default element namespace \"XML_tim6\";\n" +
                "\n" +
                "for $submission in collection(\"%s\")//submission\n" +
                "where $submission/reviewerIds/reviewerId = %d and $submission/submissionStatus = \"%s\"\n" +
                "return $submission", submissionCollections, reviewerId, SubmissionStatus.IN_REVIEW.toString());
        return getSubmissionsFromQuery(xquery);
    }

    @Override
    public List<Submission> findDistinctSubmissionsByStatus(SubmissionStatus status) throws Exception {
        String xquery = String.format("xquery version \"3.1\";\n" +
                "\n" +
                "declare default element namespace \"XML_tim6\";\n" +
                "\n" +
                "for $submission in collection(\"%s\")//submission\n" +
                "where $submission/submissionStatus = \"%s\"\n" +
                "return $submission", submissionCollections, status.toString());
        return getSubmissionsFromQuery(xquery);
    }

    private List<Submission> getSubmissionsFromQuery(String xquery) throws Exception {
        JAXBContext context = JAXBContext.newInstance("team6.xml_project.models.xml.submission");
        Unmarshaller unmarshaller = context.createUnmarshaller();
        List<Submission> submissions = new ArrayList<>();

        ResourceSet results = documentRepository.executeXQuery(submissionCollections, xquery);
        final ResourceIterator iter = results.getIterator();
        while (iter.hasMoreResources()) {
            Resource resource = iter.nextResource();
            String res = (String) resource.getContent();
            InputStream is = new ByteArrayInputStream(res.getBytes());

            Submission submission = (Submission) unmarshaller.unmarshal(is);
            submissions.add(submission);
        }

        return submissions;
    }
}
