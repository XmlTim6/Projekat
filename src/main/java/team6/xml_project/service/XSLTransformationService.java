package team6.xml_project.service;

import java.io.OutputStream;

public interface XSLTransformationService {

    OutputStream addMetadataToPaper(String paper, String paperLocation);
}
