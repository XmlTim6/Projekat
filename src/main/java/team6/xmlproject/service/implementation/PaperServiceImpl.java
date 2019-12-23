package team6.xmlproject.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team6.xmlproject.helpers.RDFMetadataExtractor;
import team6.xmlproject.repository.RDF.PaperRDFRepository;
import team6.xmlproject.service.PaperService;

import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperRDFRepository paperRDFRepository;

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
