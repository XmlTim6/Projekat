package team6.xml_project.repository;

import java.io.IOException;
import java.io.InputStream;

public interface PaperRDFRepository {

    void addPaper(InputStream rdf);

    String findPapersMetadataByAuthorName(String name) throws IOException;

    String findPapersMetadataByTitle(String title) throws IOException;

    String findPaperMetadataById(String id) throws IOException;
}
