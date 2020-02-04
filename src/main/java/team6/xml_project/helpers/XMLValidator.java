package team6.xml_project.helpers;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import team6.xml_project.models.DocumentType;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;

public class XMLValidator {

    public void validate(String documentStr, DocumentType type) throws SAXException, ParserConfigurationException, IOException {
        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        documentFactory.setNamespaceAware(true);
        DocumentBuilder builder = documentFactory.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(documentStr));
        Document document = builder.parse(is);
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Source schemaFile = null;
        if (type == DocumentType.REVIEW_FORM){
            schemaFile = new StreamSource(new File("data/schema/review_form.xsd"));
        } else if (type == DocumentType.COVER_LETTER){
            schemaFile = new StreamSource(new File("data/schema/cover_letter.xsd"));
        } else{
            schemaFile = new StreamSource(new File("data/schema/paper.xsd"));
        }
        Schema schema = factory.newSchema(schemaFile);
        Validator validator = schema.newValidator();
        validator.validate(new DOMSource(document));
    }

}
