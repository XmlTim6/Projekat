package team6.xmlproject.models.xml.review_form;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tim6.models.review_form package. 
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

    private final static QName _ParagraphItalic_QNAME = new QName("XML_tim6", "italic");
    private final static QName _ParagraphBold_QNAME = new QName("XML_tim6", "bold");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tim6.models.review_form
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReviewForm }
     * 
     */
    public ReviewForm createReviewForm() {
        return new ReviewForm();
    }

    /**
     * Create an instance of {@link Paragraph }
     * 
     */
    public Paragraph createParagraph() {
        return new Paragraph();
    }

    /**
     * Create an instance of {@link ReviewForm.MajorRemarks }
     * 
     */
    public ReviewForm.MajorRemarks createReviewFormMajorRemarks() {
        return new ReviewForm.MajorRemarks();
    }

    /**
     * Create an instance of {@link ReviewForm.MinorRemarks }
     * 
     */
    public ReviewForm.MinorRemarks createReviewFormMinorRemarks() {
        return new ReviewForm.MinorRemarks();
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public team6.xmlproject.models.xml.review_form.List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "XML_tim6", name = "italic", scope = Paragraph.class)
    public JAXBElement<String> createParagraphItalic(String value) {
        return new JAXBElement<String>(_ParagraphItalic_QNAME, String.class, Paragraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "XML_tim6", name = "bold", scope = Paragraph.class)
    public JAXBElement<String> createParagraphBold(String value) {
        return new JAXBElement<String>(_ParagraphBold_QNAME, String.class, Paragraph.class, value);
    }

}
