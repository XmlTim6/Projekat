package team6.xml_project.service;

import java.io.InputStream;
import java.util.List;

public interface PaperRDFService {

    void addPaperMetadata(InputStream rdf);

    String findPapersByMetadata(String paperId, String paperTitle, String authorName, List<String> keywords, String type);

    String findPapersCitingPaper(String paperLocation, String type);
}
