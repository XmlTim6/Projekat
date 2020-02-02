package team6.xml_project.service.implementation;

import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import team6.xml_project.helpers.XSLFOTransformer;
import team6.xml_project.service.XSLTransformationService;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

@Service
public class XSLTransformationServiceImpl implements XSLTransformationService {

    @Override
    public String addMetadataToPaper(String paper, String paperLocation) throws IOException, SAXException {
        Map<String, Object> xslParameters = new HashMap<>();
        xslParameters.put("paperLocation", paperLocation);

        OutputStream annotatedPaper = new XSLFOTransformer().generateXml(paper, "data/xsl/paperToRdf.xsl", xslParameters);
        return annotatedPaper.toString().replaceFirst("<paper", "<paper xmlns:pred=\"http://www.tim6.rs/predicate/\"");
    }

    @Override
    public OutputStream createPdf(String document, String transformation) throws IOException, SAXException {
        return new XSLFOTransformer().generatePdf(document, transformation);
    }

    @Override
    public OutputStream createHtml(String document, String transformation) throws  IOException, SAXException {
        return new XSLFOTransformer().generateHtml(document, transformation);
    }
}
