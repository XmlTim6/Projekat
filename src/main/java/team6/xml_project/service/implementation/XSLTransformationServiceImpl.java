package team6.xml_project.service.implementation;

import org.springframework.stereotype.Service;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import team6.xml_project.helpers.XSLFOTransformer;
import team6.xml_project.service.XSLTransformationService;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class XSLTransformationServiceImpl implements XSLTransformationService {

    @Override
    public String addMetadataToPaper(String paper, String paperLocation) throws IOException, SAXException {
        Map<String, Object> xslParameters = new HashMap<>();
        xslParameters.put("paperLocation", paperLocation);

        OutputStream annotatedPaper = new XSLFOTransformer().generateXml(paper, "data/xsl/paperToRdf.xsl", xslParameters);
        return annotatedPaper.toString().replaceFirst("<paper", "<paper xmlns:pred=\"http://www.tim6.rs/predicate/\"");
    }

    public OutputStream mergeReviews(String review, String transformation, List<String> otherFiles) throws IOException, SAXException{
        Map<String, Object> xslParameters = new HashMap<>();
        List<StreamSource> otherDocuments = new ArrayList<>();
        otherDocuments = otherFiles.stream().map(file -> new StreamSource(new StringReader(file))).collect(Collectors.toList());
        xslParameters.put("otherFiles", otherDocuments);

        return new XSLFOTransformer().generateXml(review, transformation, xslParameters);

    }

    @Override
    public OutputStream createPdf(String document, String transformation) throws IOException, SAXException {
        return new XSLFOTransformer().generatePdf(document, transformation);
    }

    @Override
    public OutputStream createHtml(String document, String transformation) throws  IOException, SAXException {
        return new XSLFOTransformer().generateHtml(document, transformation);
    }

    @Override
    public OutputStream createXml(String document, String transformation) throws IOException, SAXException {
        Map<String, Object> xslParameters = new HashMap<>();
        return new XSLFOTransformer().generateXml(document, transformation, xslParameters);
    }
}
