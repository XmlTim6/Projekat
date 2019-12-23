package team6.xml_project.repository;

import java.io.IOException;

public interface PaperRDFRepository {

    void addPaper(String rdfFilePath);

    String findPapersMetadataByAuthorName(String name) throws IOException;

    String findPapersMetadataByTitle(String title) throws IOException;

    String findPaperMetadataById(String id) throws IOException;
}
