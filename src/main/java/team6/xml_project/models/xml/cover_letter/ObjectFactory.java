
package team6.xmlproject.models.xml.cover_letter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tim6.models.cover_letter package. 
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

    private final static QName _CoverLetterContentParagraphItalic_QNAME = new QName("XML_tim6", "italic");
    private final static QName _CoverLetterContentParagraphBold_QNAME = new QName("XML_tim6", "bold");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tim6.models.cover_letter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CoverLetter }
     * 
     */
    public CoverLetter createCoverLetter() {
        return new CoverLetter();
    }

    /**
     * Create an instance of {@link CoverLetter.Author }
     * 
     */
    public CoverLetter.Author createCoverLetterAuthor() {
        return new CoverLetter.Author();
    }

    /**
     * Create an instance of {@link CoverLetter.Content }
     * 
     */
    public CoverLetter.Content createCoverLetterContent() {
        return new CoverLetter.Content();
    }

    /**
     * Create an instance of {@link CoverLetter.Author.Personal }
     * 
     */
    public CoverLetter.Author.Personal createCoverLetterAuthorPersonal() {
        return new CoverLetter.Author.Personal();
    }

    /**
     * Create an instance of {@link CoverLetter.Author.Institution }
     * 
     */
    public CoverLetter.Author.Institution createCoverLetterAuthorInstitution() {
        return new CoverLetter.Author.Institution();
    }

    /**
     * Create an instance of {@link CoverLetter.Content.List }
     * 
     */
    public CoverLetter.Content.List createCoverLetterContentList() {
        return new CoverLetter.Content.List();
    }

    /**
     * Create an instance of {@link CoverLetter.Content.Paragraph }
     * 
     */
    public CoverLetter.Content.Paragraph createCoverLetterContentParagraph() {
        return new CoverLetter.Content.Paragraph();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "XML_tim6", name = "italic", scope = CoverLetter.Content.Paragraph.class)
    public JAXBElement<String> createCoverLetterContentParagraphItalic(String value) {
        return new JAXBElement<String>(_CoverLetterContentParagraphItalic_QNAME, String.class, CoverLetter.Content.Paragraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "XML_tim6", name = "bold", scope = CoverLetter.Content.Paragraph.class)
    public JAXBElement<String> createCoverLetterContentParagraphBold(String value) {
        return new JAXBElement<String>(_CoverLetterContentParagraphBold_QNAME, String.class, CoverLetter.Content.Paragraph.class, value);
    }

}
