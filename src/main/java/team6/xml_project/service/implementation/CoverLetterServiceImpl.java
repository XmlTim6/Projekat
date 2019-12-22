package team6.xml_project.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team6.xml_project.models.xml.cover_letter.CoverLetter;
import team6.xml_project.repository.DocumentRepository;
import team6.xml_project.service.CoverLetterService;

@Service
public class CoverLetterServiceImpl implements CoverLetterService {

    @Autowired
    DocumentRepository documentRepository;

    public void save(CoverLetter coverLetter) throws Exception {
        documentRepository.save(coverLetter, "/db/apps/papers/userId/revision1", "CoverLetter1.xml");
    }
}
