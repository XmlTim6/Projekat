package team6.xml_project.repository.implementation;

import org.exist.xmldb.EXistResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.*;
import org.xmldb.api.modules.CollectionManagementService;
import org.xmldb.api.modules.XMLResource;
import org.xmldb.api.modules.XPathQueryService;
import org.xmldb.api.modules.XQueryService;
import team6.xml_project.models.xml.Document;
import team6.xml_project.models.xml.cover_letter.CoverLetter;
import team6.xml_project.models.xml.paper.Paper;
import team6.xml_project.models.xml.review_form.ReviewForm;
import team6.xml_project.models.xml.submission.Submission;
import team6.xml_project.repository.DocumentRepository;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.OutputKeys;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DocumentRepositoryImpl implements DocumentRepository {
    @Value("${conn.user}")
    private String dbUsername;

    @Value("${conn.password}")
    private String dbPassword;

    @Value("${conn.driver}")
    private String driver;

    @Value("${conn.uri}")
    private String uri;

    @Value("${conn.host}")
    private String host;

    @Value("${conn.port}")
    private int port;

    private String getUri(){
        return String.format(this.uri, this.host, this.port);
    }

    private void initDb() throws Exception {
        // initialize database driver
        System.out.println("[INFO] Loading driver class: " + this.driver);
        Class<?> cl = Class.forName(this.driver);

        // encapsulation of the database driver functionality
        Database database = (Database) cl.newInstance();
        database.setProperty("create-database", "true");

        // entry point for the API which enables you to get the Collection reference
        DatabaseManager.registerDatabase(database);
    }

    public void save(Document document, String collectionId, String documentId) throws Exception {
        initDb();
        // a collection of Resources stored within an XML database
        Collection col = null;
        XMLResource res = null;
        OutputStream os = new ByteArrayOutputStream();

        try {
            System.out.println("[INFO] Retrieving the collection: " + collectionId);
            col = getOrCreateCollection(collectionId);
            /*
             *  create new XMLResource with a given id
             *  an id is assigned to the new resource if left empty (null)
             */
            System.out.println("[INFO] Inserting the document: " + documentId);
            res = (XMLResource) col.createResource(documentId, XMLResource.RESOURCE_TYPE);

            JAXBContext context = this.getContextDependingOnClass(document);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // marshal the contents to an output stream
            marshaller.marshal(document, os);

            // link the stream to the XML resource
            res.setContent(os);
            System.out.println("[INFO] Storing the document: " + res.getId());

            col.storeResource(res);
            System.out.println("[INFO] Done.");

        } finally {

            //don't forget to cleanup
            if(res != null) {
                try {
                    ((EXistResource)res).freeResources();
                } catch (XMLDBException xe) {
                    xe.printStackTrace();
                }
            }

            if(col != null) {
                try {
                    col.close();
                } catch (XMLDBException xe) {
                    xe.printStackTrace();
                }
            }
        }
    }

    private Collection getOrCreateCollection(String collectionUri) throws XMLDBException {
        return getOrCreateCollection(collectionUri, 0);
    }

    private Collection getOrCreateCollection(String collectionUri, int pathSegmentOffset) throws XMLDBException {

        Collection col = DatabaseManager.getCollection(this.getUri() + collectionUri, this.dbUsername, this.dbPassword);

        // create the collection if it does not exist
        if(col == null) {

            if(collectionUri.startsWith("/")) {
                collectionUri = collectionUri.substring(1);
            }

            String pathSegments[] = collectionUri.split("/");

            if(pathSegments.length > 0) {
                StringBuilder path = new StringBuilder();

                for(int i = 0; i <= pathSegmentOffset; i++) {
                    path.append("/" + pathSegments[i]);
                }

                Collection startCol = DatabaseManager.getCollection(this.getUri() + path, this.dbUsername, this.dbPassword);

                if (startCol == null) {

                    // child collection does not exist

                    String parentPath = path.substring(0, path.lastIndexOf("/"));
                    Collection parentCol = DatabaseManager.getCollection(this.getUri() + parentPath, this.dbUsername, this.dbPassword);

                    CollectionManagementService mgt = (CollectionManagementService) parentCol.getService("CollectionManagementService", "1.0");

                    System.out.println("[INFO] Creating the collection: " + pathSegments[pathSegmentOffset]);
                    col = mgt.createCollection(pathSegments[pathSegmentOffset]);

                    col.close();
                    parentCol.close();

                } else {
                    startCol.close();
                }
            }
            return getOrCreateCollection(collectionUri, ++pathSegmentOffset);
        } else {
            return col;
        }
    }

    private JAXBContext getContextDependingOnClass(Document document) throws JAXBException {
        JAXBContext context = null;
        if(document.getClass().equals(Paper.class)){
            context = JAXBContext.newInstance("team6.xml_project.models.xml.paper");
        }else if(document.getClass() == CoverLetter.class){
            context = JAXBContext.newInstance("team6.xml_project.models.xml.cover_letter");
        }else if(document.getClass() == ReviewForm.class){
            context = JAXBContext.newInstance("team6.xml_project.models.xml.review_form");
        }else if(document.getClass() == Submission.class){
            context = JAXBContext.newInstance("team6.xml_project.models.xml.submission");
        }
        return context;
    }

    public Document getDocumentById(Document document, String collectionId, String documentId) throws Exception{
        initDb();

        Collection col = null;
        XMLResource res = null;

        try {
            // get the collection
            System.out.println("[INFO] Retrieving the collection: " + collectionId);
            col = DatabaseManager.getCollection(this.getUri() + collectionId);
            col.setProperty(OutputKeys.INDENT, "yes");

            System.out.println("[INFO] Retrieving the document: " + documentId);
            res = (XMLResource)col.getResource(documentId);

            if(res == null) {
                System.out.println("[WARNING] Document '" + documentId + "' can not be found!");
            } else {

                System.out.println("[INFO] Binding XML resouce to an JAXB instance: ");
                JAXBContext context = this.getContextDependingOnClass(document);

                Unmarshaller unmarshaller = context.createUnmarshaller();

                document = (Document) unmarshaller.unmarshal(res.getContentAsDOM());
            }
        } finally {
            //don't forget to clean up!

            if(res != null) {
                try {
                    ((EXistResource)res).freeResources();
                } catch (XMLDBException xe) {
                    xe.printStackTrace();
                }
            }

            if(col != null) {
                try {
                    col.close();
                } catch (XMLDBException xe) {
                    xe.printStackTrace();
                }
            }
        }
        return document;
    }
    public void deleteDocumentById(String collectionID, String documentID) throws Exception{
        initDb();
        Collection col = null;
        XMLResource res = null;

        try {
            // get the collection
            System.out.println("[INFO] Retrieving the collection: " + collectionID);
            col = DatabaseManager.getCollection(this.getUri() + collectionID);
            col.setProperty(OutputKeys.INDENT, "yes");

            System.out.println("[INFO] Retrieving the document: " + documentID);
            res = (XMLResource)col.getResource(documentID);
            System.out.println("[INFO] Removing the document: " + documentID);
            col.removeResource(res);
        }finally {
            //don't forget to clean up!

            if(res != null) {
                try {
                    ((EXistResource)res).freeResources();
                } catch (XMLDBException xe) {
                    xe.printStackTrace();
                }
            }

            if(col != null) {
                try {
                    col.close();
                } catch (XMLDBException xe) {
                    xe.printStackTrace();
                }
            }
        }
    }

    public ResourceSet executeXPathQuery(String collectionId, String xPathExp) throws Exception{
        initDb();
        Collection col = null;
        try{
            col = DatabaseManager.getCollection(this.getUri() + collectionId);

            // get an instance of xpath query service
            XPathQueryService xpathService = (XPathQueryService) col.getService("XPathQueryService", "1.0");
            xpathService.setProperty("indent", "yes");

            xpathService.setNamespace("", "XML_tim6");

            // execute xpath expression
            System.out.println("[INFO] Invoking XPath query service for: " + xPathExp);
            return xpathService.query(xPathExp);
        }finally {

            // don't forget to cleanup
            if(col != null) {
                try {
                    col.close();
                } catch (XMLDBException xe) {
                    xe.printStackTrace();
                }
            }
        }
    }

    public ResourceSet executeXQuery(String collectionId, String xQuery) throws Exception{
        initDb();
        Collection col = null;

        try {

            // get the collection
            System.out.println("[INFO] Retrieving the collection: " + collectionId);
            col = DatabaseManager.getCollection(this.getUri() + collectionId);

            // get an instance of xquery service
            XQueryService xqueryService = (XQueryService) col.getService("XQueryService", "3.1");
            xqueryService.setProperty("indent", "yes");

            // make the service aware of namespaces
            xqueryService.setNamespace("b", "XML_tim6");

            // compile and execute the expression
            CompiledExpression compiledXQuery = xqueryService.compile(xQuery);
            return xqueryService.execute(compiledXQuery);

        }   finally {

            // don't forget to cleanup
            if(col != null) {
                try {
                    col.close();
                } catch (XMLDBException xe) {
                    xe.printStackTrace();
                }
            }
        }
    }

    @Override
    public ResourceSet checkIfDocumentExist(String collectionId, String documentName) throws Exception {
        initDb();
        Collection col = null;

        try {

            // get the collection
            System.out.println("[INFO] Retrieving the collection: " + collectionId);
            col = DatabaseManager.getCollection(this.getUri() + collectionId);

            // get an instance of xquery service
            XQueryService xqueryService = (XQueryService) col.getService("XQueryService", "1.0");
            xqueryService.setProperty("indent", "yes");

            // make the service aware of namespaces
            xqueryService.setNamespace("b", "XML_tim6");

            String xQueryExpression = "xquery version \"3.1\";\n" +
                    "doc-available('" + collectionId + documentName + "')";

            // compile and execute the expression
            CompiledExpression compiledXQuery = xqueryService.compile(xQueryExpression);
            return xqueryService.execute(compiledXQuery);

        }   finally {

            // don't forget to cleanup
            if(col != null) {
                try {
                    col.close();
                } catch (XMLDBException xe) {
                    xe.printStackTrace();
                }
            }
        }
    }

    @Override
    public ResourceSet countDocumentsInCollection(String collectionId) throws Exception {
        initDb();
        Collection col = null;

        try {

            // get the collection
            System.out.println("[INFO] Retrieving the collection: " + collectionId);
            col = DatabaseManager.getCollection(this.getUri() + collectionId);

            // get an instance of xquery service
            XQueryService xqueryService = (XQueryService) col.getService("XQueryService", "1.0");
            xqueryService.setProperty("indent", "yes");

            // make the service aware of namespaces
            xqueryService.setNamespace("b", "XML_tim6");

            String xQueryExpression = "xquery version \"3.1\";\n" +
                    "count(collection('" + collectionId + "'))";

            // compile and execute the expression
            CompiledExpression compiledXQuery = xqueryService.compile(xQueryExpression);
            return xqueryService.execute(compiledXQuery);

        }   finally {

            // don't forget to cleanup
            if(col != null) {
                try {
                    col.close();
                } catch (XMLDBException xe) {
                    xe.printStackTrace();
                }
            }
        }
    }

    /**
     * Convenience method for reading file contents into a string.
     */
    public static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    static List<String> getURIs(String xquery, DocumentRepository documentRepository, String collection) throws Exception {
        List<String> coverLetterURIs = new ArrayList<>();
        ResourceSet results = documentRepository.executeXQuery(collection, xquery);
        final ResourceIterator iter = results.getIterator();
        while (iter.hasMoreResources()) {
            Resource resource = iter.nextResource();
            String res = (String) resource.getContent();
            coverLetterURIs.add(res);
        }
        return coverLetterURIs;
    }

}
