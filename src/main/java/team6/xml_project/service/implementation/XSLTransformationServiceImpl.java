package team6.xml_project.service.implementation;

import org.springframework.stereotype.Service;
import team6.xml_project.helpers.XSLFOTransformer;
import team6.xml_project.service.XSLTransformationService;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

@Service
public class XSLTransformationServiceImpl implements XSLTransformationService {

    @Override
    public OutputStream addMetadataToPaper(String paper, String paperLocation) {
        Map<String, Object> xslParameters = new HashMap<>();
        xslParameters.put("paperLocation", paperLocation);
        return XSLFOTransformer.generateXml(paper, "data/xsl/paperToRdf.xsl", xslParameters);
    }
}
