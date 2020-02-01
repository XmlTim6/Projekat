package team6.xml_project.helpers;

import team6.xml_project.models.xml.cover_letter.CoverLetter;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.models.xml.review_form.ReviewForm;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class XMLMarshaller {

    public static String createStringFromPaper(Paper paper) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance("team6.xml_project.models.xml.paper");
        Marshaller marshaller = context.createMarshaller();
        OutputStream paperXML = new ByteArrayOutputStream();
        marshaller.marshal(paper, paperXML);
        return paperXML.toString();
    }

    public static String createStringFromCoverLetter(CoverLetter coverLetter) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance("team6.xml_project.models.xml.cover_letter");
        Marshaller marshaller = context.createMarshaller();
        OutputStream coverLetterXML = new ByteArrayOutputStream();
        marshaller.marshal(coverLetter, coverLetterXML);
        return coverLetterXML.toString();
    }

    public static String createStringFromReviewForm(ReviewForm reviewForm) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance("team6.xml_project.models.xml.review_form");
        Marshaller marshaller = context.createMarshaller();
        OutputStream reviewFormXML = new ByteArrayOutputStream();
        marshaller.marshal(reviewForm, reviewFormXML);
        return reviewFormXML.toString();
    }

}
