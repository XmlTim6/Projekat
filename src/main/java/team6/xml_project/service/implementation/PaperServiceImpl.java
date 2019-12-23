package team6.xml_project.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team6.xml_project.helpers.RDFMetadataExtractor;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.repository.DocumentRepository;
import team6.xml_project.repository.PaperRDFRepository;
import team6.xml_project.service.PaperService;

import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    DocumentRepository documentRepository;

    @Autowired
    PaperRDFRepository paperRDFRepository;

    public void save(Paper paper) throws Exception {
        documentRepository.save(paper, "/db/apps/papers/userId/revision1", "paper1.xml");
    }

    @Override
    public void addPaper(String rdfFilePath) {
        paperRDFRepository.addPaper(rdfFilePath);
    }

    @Override
    public void extractRDFMetadata(InputStream in, OutputStream out) throws FileNotFoundException, TransformerException {
        RDFMetadataExtractor rdfMetadataExtractor = new RDFMetadataExtractor();
        rdfMetadataExtractor.extractMetadata(in, out);
    }

    @Override
    public String findPapersMetadataByAuthorName(String name) throws IOException {
        return paperRDFRepository.findPapersMetadataByAuthorName(name);
    }

    @Override
    public String findPapersMetadataByTitle(String title) throws IOException {
        return paperRDFRepository.findPapersMetadataByTitle(title);
    }

    @Override
    public String findPaperMetadataById(String id) throws IOException {
        return paperRDFRepository.findPaperMetadataById(id);
    }
}
