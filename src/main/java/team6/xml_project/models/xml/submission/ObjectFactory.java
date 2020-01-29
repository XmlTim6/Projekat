
package team6.xml_project.models.xml.submission;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the team6.xml_project.models.xml.submission package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SubmissionStatus_QNAME = new QName("XML_tim6", "submissionStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: team6.xml_project.models.xml.submission
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Submission }
     * 
     */
    public Submission createSubmission() {
        return new Submission();
    }

    /**
     * Create an instance of {@link Submission.ReviewerIds }
     * 
     */
    public Submission.ReviewerIds createSubmissionReviewerIds() {
        return new Submission.ReviewerIds();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "XML_tim6", name = "submissionStatus", defaultValue = "SUBMITTED_FOR_REVIEW")
    public JAXBElement<String> createSubmissionStatus(String value) {
        return new JAXBElement<String>(_SubmissionStatus_QNAME, String.class, null, value);
    }

}
