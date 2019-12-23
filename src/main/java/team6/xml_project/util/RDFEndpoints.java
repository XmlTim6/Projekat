package team6.xml_project.util;

public class RDFEndpoints {

    private static final String endpoint = "http://localhost:8081/fuseki";

    private static final String dataset = "FTNProject";

    private static final String query = "query";

    private static final String update = "update";

    private static final String data = "data";

    public static final String queryEndpoint = String.join("/", endpoint, dataset, query);

    public static final String updateEndpoint = String.join("/", endpoint, dataset, update);

    public static final String dataEndpoint = String.join("/", endpoint, dataset, data);
}
