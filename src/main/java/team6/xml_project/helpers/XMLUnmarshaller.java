package team6.xml_project.helpers;

import team6.xml_project.models.xml.cover_letter.CoverLetter;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.models.xml.review_form.ReviewForm;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class XMLUnmarshaller {

    public static Paper createPaperFromXML(String paperXML) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Paper.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        StringReader reader = new StringReader(paperXML);
        return (Paper) unmarshaller.unmarshal(reader);
    }

    public static CoverLetter createCoverLetterFromXML(String coverLetterXML) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(CoverLetter.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        StringReader reader = new StringReader(coverLetterXML);
        return (CoverLetter) unmarshaller.unmarshal(reader);
    }

    public static ReviewForm createReviewFormFromXML(String reviewFormXML) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(ReviewForm.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        StringReader reader = new StringReader(reviewFormXML);
        return (ReviewForm) unmarshaller.unmarshal(reader);
    }

}
