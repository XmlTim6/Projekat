package team6.xml_project.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.repository.DocumentRepository;
import team6.xml_project.service.PaperService;

@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    DocumentRepository documentRepository;

    public void save(Paper paper) throws Exception {
        documentRepository.save(paper, "/db/apps/papers/userId/revision1", "paper1.xml");
    }
}
