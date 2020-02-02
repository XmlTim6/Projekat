package team6.xml_project.service;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.OutputStream;

public interface XSLTransformationService {

    String addMetadataToPaper(String paper, String paperLocation) throws IOException, SAXException;

    OutputStream createPdf(String document, String transformation) throws IOException, SAXException;

    OutputStream createHtml(String document, String transformation) throws  IOException, SAXException;
}
