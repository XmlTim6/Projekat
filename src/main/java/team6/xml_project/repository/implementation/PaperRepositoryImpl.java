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
    public String get(String collectionId, String documentId) throws Exception {
        return documentRepository.getDocumentById(collectionId, documentId);
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
    public List<String> findPaperURIsMatchingText(String text) throws Exception {
        String xquery = String.format("xquery version \"3.1\";\n" +
                "\n" +
                "declare default element namespace \"XML_tim6\";\n" +
                "\n" +
                "for $submission in collection(\"/db/xml_project_tim6/submissions\")//submission\n" +
                "where $submission/submissionStatus = \"ACCEPTED\"\n" +
                "let $acceptedSubmissions := $submission\n" +
                "\n" +
                "let $result := []\n" +
                "\n" +
                "let $result := for $acceptedSubmission in $acceptedSubmissions\n" +
                "return (for $paper in doc(concat(\"/db/xml_project_tim6/papers/\", $acceptedSubmission/id/text(), \"/revision_\", $acceptedSubmission/currentRevision/text(), \"/paper.xml\"))\n" +
                "    where $paper//*[contains(upper-case(text()[1]),upper-case('%s'))]\n" +
                "    return map {\n" +
                "                \"paper\": base-uri($paper),\n" +
                "                \"title\": $paper//@title/string(),\n" +
                "                \"keywords\": array {\n" +
                "                    for $keyword in $paper//keywords/keyword\n" +
                "                    return \"&apos;\" || $keyword/string() || \"&apos;, \"\n" +
                "                },\n" +
                "                \"authors\": array {\n" +
                "                    for $author in $paper//authors/author/personal\n" +
                "                    return \"&apos;\" || $author/first_name || \" \" || $author/middle_name || \" \" || $author/last_name || \"&apos;, \"\n" +
                "                },\n" +
                "                \"received\": $paper//received/text(),\n" +
                "                \"accepted\": $paper//accepted/text()\n" +
                "    }\n" +
                ")\n" +
                "\n" +
                "return '{&apos;paper&apos;:&apos;' || $result?paper || \"&apos;,\" ||\n" +
                "        '&apos;title&apos;:&apos;' ||  $result?title || \"&apos;,\" ||\n" +
                "        '&apos;keywords&apos;:[' || $result?keywords || \"],\" ||\n" +
                "        '&apos;authors&apos;:[' || $result?authors || \"],\" ||\n" +
                "        '&apos;received&apos;:&apos;' ||  $result?received || \"&apos;,\" ||\n" +
                "        '&apos;accepted&apos;:&apos;' ||  $result?accepted || \"&apos;\" ||\n" +
                "        '}'\n" +
                "\n", text);
        return getURIs(xquery, documentRepository, "/db/xml_project_tim6/");
    }

    @Override
    public void save(String paper, Submission submission, String documentName) {
        try {
            documentRepository.save(paper, String.format("/db/xml_project_tim6/papers/%s/revision_%s/",
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
