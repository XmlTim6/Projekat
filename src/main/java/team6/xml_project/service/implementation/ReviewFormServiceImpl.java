package team6.xml_project.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team6.xml_project.models.xml.review_form.ReviewForm;
import team6.xml_project.repository.DocumentRepository;
import team6.xml_project.service.ReviewFormService;

@Service
public class ReviewFormServiceImpl implements ReviewFormService {

    @Autowired
    DocumentRepository documentRepository;

    public void save(ReviewForm reviewForm) throws Exception {
        documentRepository.save(reviewForm, "/db/apps/papers/userId/revision1", "reviewForm1.xml");
    }
}
