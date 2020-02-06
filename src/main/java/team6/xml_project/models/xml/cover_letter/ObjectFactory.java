
package team6.xml_project.models.xml.cover_letter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the team6.xml_project.models.xml.cover_letter package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: team6.xml_project.models.xml.cover_letter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Paragraph }
     * 
     */
    public Paragraph createParagraph() {
        return new Paragraph();
    }

    /**
     * Create an instance of {@link CoverLetter }
     * 
     */
    public CoverLetter createCoverLetter() {
        return new CoverLetter();
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link CoverLetter.Author }
     * 
     */
    public CoverLetter.Author createCoverLetterAuthor() {
        return new CoverLetter.Author();
    }

    /**
     * Create an instance of {@link Paragraph.Bold }
     * 
     */
    public Paragraph.Bold createParagraphBold() {
        return new Paragraph.Bold();
    }

    /**
     * Create an instance of {@link Paragraph.Italic }
     * 
     */
    public Paragraph.Italic createParagraphItalic() {
        return new Paragraph.Italic();
    }

    /**
     * Create an instance of {@link CoverLetter.Content }
     * 
     */
    public CoverLetter.Content createCoverLetterContent() {
        return new CoverLetter.Content();
    }

    /**
     * Create an instance of {@link List.ListItem }
     * 
     */
    public List.ListItem createListListItem() {
        return new List.ListItem();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Paragraph.Italic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "XML_tim6", name = "italic", scope = Paragraph.class)
    public JAXBElement<Paragraph.Italic> createParagraphItalic(Paragraph.Italic value) {
        return new JAXBElement<Paragraph.Italic>(_ParagraphItalic_QNAME, Paragraph.Italic.class, Paragraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Paragraph.Bold }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "XML_tim6", name = "bold", scope = Paragraph.class)
    public JAXBElement<Paragraph.Bold> createParagraphBold(Paragraph.Bold value) {
        return new JAXBElement<Paragraph.Bold>(_ParagraphBold_QNAME, Paragraph.Bold.class, Paragraph.class, value);
    }

}
