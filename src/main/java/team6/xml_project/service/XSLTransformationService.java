package team6.xml_project.service;

import org.xml.sax.SAXException;

import java.io.IOException;

public interface XSLTransformationService {

    String addMetadataToPaper(String paper, String paperLocation) throws IOException, SAXException;
}
