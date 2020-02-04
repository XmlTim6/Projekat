package team6.xml_project.repository;

import org.xmldb.api.base.ResourceSet;
import team6.xml_project.models.xml.Document;


public interface DocumentRepository {

    void save(Document document, String collectionId, String documentId) throws Exception;

    void save(String document, String collectionId, String documentId) throws Exception;

    Document getDocumentById(Document document, String collectionId, String documentId) throws Exception;

    String getDocumentById(String collectionId, String documentId) throws Exception;

    void deleteDocumentById(String collectionId, String documentId) throws Exception;

    ResourceSet executeXPathQuery(String collectionId, String xPathExp) throws Exception;

    ResourceSet executeXQuery(String collectionId, String xQuery) throws Exception;

    ResourceSet checkIfDocumentExist(String collectionId, String documentName) throws Exception;

    ResourceSet countDocumentsInCollection(String collectionId) throws Exception;
}
