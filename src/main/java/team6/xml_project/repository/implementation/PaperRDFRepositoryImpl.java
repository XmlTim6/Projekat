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
import java.util.List;

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
    public String findPapersByMetadata(String paperId, String paperTitle, String authorName, List<String> keywords,
                                       String type) {

        StringBuilder builder = new StringBuilder();
        for (String keyword: keywords) {
           builder.append(String.format("regex(str(?keyword), \"%s\", \"i\") &&\n", keyword));
        }

        String sparqlQuery = String.format("SELECT DISTINCT ?paper ?title ?received ?revised ?accepted ?author ?institution ?keyword FROM <%s>\n" +
                "WHERE {\n" +
                "  \t?paper <http://www.tim6.rs/predicate/title> ?title .\n" +
                "  \t?paper <http://www.tim6.rs/predicate/received> ?received .\n" +
                "  \t?paper <http://www.tim6.rs/predicate/revised> ?revised .\n" +
                "    ?paper <http://www.tim6.rs/predicate/accepted> ?accepted .\n" +
                "    ?paper <http://www.tim6.rs/predicate/author> ?author .\n" +
                "    ?paper <http://www.tim6.rs/predicate/institution> ?institution .\n" +
                "    ?paper <http://www.tim6.rs/predicate/keyword> ?keyword .\n" +
                "  FILTER(" + builder.toString() +
                "    regex(str(?paper), \"%s\", \"i\") &&\n" +
                "    regex(str(?title), \"%s\", \"i\") &&\n" +
                "    regex(str(?author), \"%s\", \"i\")\n" +
                "  )\n" +
                "}",
                RDFEndpoints.dataEndpoint + SPARQL_NAMED_GRAPH_URI,
                paperId, paperTitle, authorName
                );
        return executeQuery(type, sparqlQuery);
    }

    @Override
    public String findPapersCitingPaper(String paperLocation, String type) {
        String sparqlQuery = String.format("SELECT DISTINCT ?paper ?title ?received ?revised ?accepted ?author ?institution ?keyword FROM <http://localhost:8081/fuseki/FTNProject/data/papers/metadata>\n" +
                "WHERE {\n" +
                "  \t?paper <http://www.tim6.rs/predicate/title> ?title .\n" +
                "  \t?paper <http://www.tim6.rs/predicate/received> ?received .\n" +
                "  \t?paper <http://www.tim6.rs/predicate/revised> ?revised .\n" +
                "    ?paper <http://www.tim6.rs/predicate/accepted> ?accepted .\n" +
                "    ?paper <http://www.tim6.rs/predicate/author> ?author .\n" +
                "    ?paper <http://www.tim6.rs/predicate/institution> ?institution .\n" +
                "    ?paper <http://www.tim6.rs/predicate/keyword> ?keyword .\n" +
                "  \t?paper <http://www.tim6.rs/predicate/citations> ?citations .\n" +
                "    ?citations <http://www.tim6.rs/predicate/uri> ?uri\n" +
                "  FILTER(regex(str(?uri), str(\"%s\"), \"i\")\n" +
                "  )\n" +
                "}", paperLocation);
        return executeQuery(type, sparqlQuery);
    }

    private String executeQuery(String type, String sparqlQuery) {
        // Create a QueryExecution that will access a SPARQL service over HTTP
        QueryExecution query = QueryExecutionFactory.sparqlService(RDFEndpoints.queryEndpoint, sparqlQuery);
        ResultSet results = query.execSelect();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        switch (type) {
            case "json": ResultSetFormatter.outputAsJSON(out, results); break;
            case "xml": ResultSetFormatter.outputAsXML(out, results); break;
        }

        String result = new String(out.toByteArray());
        query.close();

        return result;
    }
}
