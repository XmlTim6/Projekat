package team6.xml_project.helpers;

import net.sf.saxon.TransformerFactoryImpl;
import org.apache.fop.apps.FopFactory;
import org.xml.sax.SAXException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.util.Map;

public class XSLFOTransformer {

    private FopFactory fopFactory;

    private TransformerFactory transformerFactory;

    public XSLFOTransformer() throws SAXException, IOException {

        // Initialize FOP factory object
        fopFactory = FopFactory.newInstance(new File("data/xsl/fop.xconf"));

        // Setup the XSLT transformer factory
        transformerFactory = new TransformerFactoryImpl();
    }

    public OutputStream generateXml(String xmlInput, String xslPath, Map<String, Object> xslParameters) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            StreamSource xslt = new StreamSource(new File(xslPath));

            Transformer transformer = factory.newTransformer(xslt);
            xslParameters.forEach(transformer::setParameter);

            InputStream inputStream = new ByteArrayInputStream(xmlInput.getBytes());
            StreamSource text = new StreamSource(inputStream);

            OutputStream outputStream = new ByteArrayOutputStream();
            transformer.transform(text, new StreamResult(outputStream));
            return outputStream;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
