package team6.xml_project.repository;

import org.xmldb.api.base.ResourceSet;
import team6.xml_project.models.xml.Document;

public interface DocumentRepository {

    void save(Document document, String collectionId, String documentId) throws Exception;

    Document getDocumentById(Document document, String collectionId, String documentId) throws Exception;

    void deleteDocumentById(String collectionId, String documentId) throws Exception;

    ResourceSet executeXPathQuery(String collectionId, String xPathExp) throws Exception;

    ResourceSet executeXQuery(String collectionId, String xQueryFilePath) throws Exception;
}
