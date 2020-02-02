package team6.xml_project.helpers;

import net.sf.saxon.TransformerFactoryImpl;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;
import org.xml.sax.SAXException;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXResult;
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

    public OutputStream generateHtml(String xmlInput, String xslPath){
        try{
            // Initialize Transformer instance
            StreamSource transformSource = new StreamSource(new File(xslPath));
            Transformer transformer = transformerFactory.newTransformer(transformSource);
            transformer.setOutputProperty("{http://xml.apache.org/xalan}indent-amount", "2");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            // Generate XHTML
            transformer.setOutputProperty(OutputKeys.METHOD, "xhtml");

            InputStream inputStream = new ByteArrayInputStream(xmlInput.getBytes());
            StreamSource text = new StreamSource(inputStream);
            StreamResult result = new StreamResult();
            transformer.transform(text, result);
            return result.getOutputStream();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public OutputStream generatePdf(String xmlInput, String xslPath){
        try {
            StreamSource transformSource = new StreamSource(new File(xslPath));
            InputStream inputStream = new ByteArrayInputStream(xmlInput.getBytes());
            StreamSource text = new StreamSource(inputStream);

            FOUserAgent userAgent = fopFactory.newFOUserAgent();
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            Transformer xslFoTransformer = transformerFactory.newTransformer(transformSource);
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, userAgent, outStream);

            Result res = new SAXResult(fop.getDefaultHandler());
            xslFoTransformer.transform(text, res);

            return outStream;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
