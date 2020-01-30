package team6.xml_project.repository.implementation;

import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.update.UpdateExecutionFactory;
import org.apache.jena.update.UpdateFactory;
import org.apache.jena.update.UpdateProcessor;
import org.apache.jena.update.UpdateRequest;
import org.springframework.stereotype.Repository;
import team6.xml_project.repository.PaperRDFRepository;
import team6.xml_project.util.FileUtil;
import team6.xml_project.util.RDFEndpoints;
import team6.xml_project.util.SparqlUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Repository
public class PaperRDFRepositoryImpl implements PaperRDFRepository {

    private final String PAPERS_NAMED_GRAPH_URI = "/papers/metadata";

    private static final String SPARQL_NAMED_GRAPH_URI = "/papers/metadata";

    @Override
    public void addPaper(InputStream rdf) {
        // Creates a default model
        Model model = ModelFactory.createDefaultModel();
        model.read(rdf, null);

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        model.write(out, SparqlUtil.NTRIPLES);

        String sparqlUpdate = SparqlUtil.insertData(RDFEndpoints.dataEndpoint + PAPERS_NAMED_GRAPH_URI, new String(out.toByteArray()));

        // UpdateRequest represents a unit of execution
        UpdateRequest update = UpdateFactory.create(sparqlUpdate);

        /*
         * Create UpdateProcessor, an instance of execution of an UpdateRequest.
         * UpdateProcessor sends update request to a remote SPARQL update service.
         */
        UpdateProcessor processor = UpdateExecutionFactory.createRemote(update, RDFEndpoints.updateEndpoint);

        processor.execute();
    }

    @Override
    public String findPapersMetadataByAuthorName(String name) throws IOException {
        // SPARQL file which is to be queried
        String sparqlFilePath = "data/sparql/papersByAuthorName.rq";

        // Querying the named graph with a referenced SPARQL query
        String sparqlQuery = String.format(FileUtil.readFile(sparqlFilePath, StandardCharsets.UTF_8),
                RDFEndpoints.dataEndpoint + SPARQL_NAMED_GRAPH_URI, name);

        // Create a QueryExecution that will access a SPARQL service over HTTP
        QueryExecution query = QueryExecutionFactory.sparqlService(RDFEndpoints.queryEndpoint, sparqlQuery);
        ResultSet results = query.execSelect();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ResultSetFormatter.outputAsJSON(out, results);

        String json = new String(out.toByteArray());
        query.close();

        return json;
    }

    @Override
    public String findPapersMetadataByTitle(String title) throws IOException {
        // SPARQL file which is to be queried
        String sparqlFilePath = "data/sparql/papersByTitle.rq";

        // Querying the named graph with a referenced SPARQL query
        String sparqlQuery = String.format(FileUtil.readFile(sparqlFilePath, StandardCharsets.UTF_8),
                RDFEndpoints.dataEndpoint + SPARQL_NAMED_GRAPH_URI, title);

        // Create a QueryExecution that will access a SPARQL service over HTTP
        QueryExecution query = QueryExecutionFactory.sparqlService(RDFEndpoints.queryEndpoint, sparqlQuery);
        ResultSet results = query.execSelect();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ResultSetFormatter.outputAsXML(out, results);

        String json = new String(out.toByteArray());
        query.close();

        return json;
    }

    @Override
    public String findPaperMetadataById(String id) throws IOException {
        // SPARQL file which is to be queried
        String sparqlFilePath = "data/sparql/paperById.rq";

        // Querying the named graph with a referenced SPARQL query
        String sparqlQuery = String.format(FileUtil.readFile(sparqlFilePath, StandardCharsets.UTF_8),
                RDFEndpoints.dataEndpoint + SPARQL_NAMED_GRAPH_URI, id);

        // Create a QueryExecution that will access a SPARQL service over HTTP
        QueryExecution query = QueryExecutionFactory.sparqlService(RDFEndpoints.queryEndpoint, sparqlQuery);
        ResultSet results = query.execSelect();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ResultSetFormatter.outputAsJSON(out, results);

        String json = new String(out.toByteArray());
        query.close();

        return json;
    }
}
