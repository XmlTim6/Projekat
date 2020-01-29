package team6.xml_project.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team6.xml_project.repository.PaperRDFRepository;
import team6.xml_project.service.PaperRDFService;

import java.io.IOException;
import java.io.InputStream;

@Service
public class PaperRDFServiceImpl implements PaperRDFService {

    @Autowired
    PaperRDFRepository paperRDFRepository;

    @Override
    public void addPaperMetadata(InputStream rdf) {
        paperRDFRepository.addPaper(rdf);
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
