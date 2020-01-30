package team6.xml_project.helpers;

import team6.xml_project.models.xml.paper.Paper;

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
}
