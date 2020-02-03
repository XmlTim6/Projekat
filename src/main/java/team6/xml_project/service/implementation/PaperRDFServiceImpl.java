package team6.xml_project.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team6.xml_project.repository.PaperRDFRepository;
import team6.xml_project.service.PaperRDFService;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class PaperRDFServiceImpl implements PaperRDFService {

    @Autowired
    PaperRDFRepository paperRDFRepository;

    @Override
    public void addPaperMetadata(InputStream rdf) {
        paperRDFRepository.addPaper(rdf);
    }

    @Override
    public String findPapersByMetadata(String paperId, String paperTitle, String authorName, List<String> keywords, String type) {
        return paperRDFRepository.findPapersByMetadata(paperId, paperTitle, authorName, keywords, type);
    }

    @Override
    public String findPapersCitingPaper(String paperLocation, String type) {
        return paperRDFRepository.findPapersCitingPaper(paperLocation, type);
    }

}
