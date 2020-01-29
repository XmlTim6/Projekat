package team6.xml_project.service;

import java.io.IOException;
import java.io.InputStream;

public interface PaperRDFService {

    void addPaperMetadata(InputStream rdf);

    String findPapersMetadataByAuthorName(String name) throws IOException;

    String findPapersMetadataByTitle(String title) throws IOException;

    String findPaperMetadataById(String id) throws IOException;
}
