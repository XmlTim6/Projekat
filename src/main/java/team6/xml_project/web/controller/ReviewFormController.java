package team6.xml_project.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import team6.xml_project.models.xml.review_form.ReviewForm;
import team6.xml_project.service.ReviewFormService;

@RestController
@RequestMapping(value = "api/reviewForm")
public class ReviewFormController {

    @Autowired
    ReviewFormService reviewFormService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Boolean> createReviewForm(@RequestBody ReviewForm reviewForm){
        try{
            reviewFormService.save(reviewForm);
        }catch (Exception ignored){

        }
        return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.CREATED);
    }

}
