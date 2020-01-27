package team6.xml_project.helpers;

import team6.xml_project.models.xml.paper.Paper;

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
}
