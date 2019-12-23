package team6.xml_project.service;

import team6.xml_project.models.xml.paper.Paper;

import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface PaperService {

    void save(Paper paper) throws Exception;

    void addPaper(String rdfFilePath);

    void extractRDFMetadata(InputStream in, OutputStream out) throws FileNotFoundException, TransformerException;

    String findPapersMetadataByAuthorName(String name) throws IOException;

    String findPapersMetadataByTitle(String title) throws IOException;

    String findPaperMetadataById(String id) throws IOException;
}
