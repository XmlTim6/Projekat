
package team6.xmlproject.models.xml.paper;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tim6.models.paper package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tim6.models.paper
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Paper }
     * 
     */
    public Paper createPaper() {
        return new Paper();
    }

    /**
     * Create an instance of {@link Section }
     * 
     */
    public Section createSection() {
        return new Section();
    }

    /**
     * Create an instance of {@link Mention }
     * 
     */
    public Mention createMention() {
        return new Mention();
    }

    /**
     * Create an instance of {@link Mention.Authors }
     * 
     */
    public Mention.Authors createMentionAuthors() {
        return new Mention.Authors();
    }

    /**
     * Create an instance of {@link Section.Table }
     * 
     */
    public Section.Table createSectionTable() {
        return new Section.Table();
    }

    /**
     * Create an instance of {@link Section.Table.Row }
     * 
     */
    public Section.Table.Row createSectionTableRow() {
        return new Section.Table.Row();
    }

    /**
     * Create an instance of {@link Paper.Notes }
     * 
     */
    public Paper.Notes createPaperNotes() {
        return new Paper.Notes();
    }

    /**
     * Create an instance of {@link Paper.Abstract }
     * 
     */
    public Paper.Abstract createPaperAbstract() {
        return new Paper.Abstract();
    }

    /**
     * Create an instance of {@link Paper.Authors }
     * 
     */
    public Paper.Authors createPaperAuthors() {
        return new Paper.Authors();
    }

    /**
     * Create an instance of {@link Paper.Authors.Author }
     * 
     */
    public Paper.Authors.Author createPaperAuthorsAuthor() {
        return new Paper.Authors.Author();
    }

    /**
     * Create an instance of {@link Paragraph }
     * 
     */
    public Paragraph createParagraph() {
        return new Paragraph();
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link Quote }
     * 
     */
    public Quote createQuote() {
        return new Quote();
    }

    /**
     * Create an instance of {@link Code }
     * 
     */
    public Code createCode() {
        return new Code();
    }

    /**
     * Create an instance of {@link Paper.Content }
     * 
     */
    public Paper.Content createPaperContent() {
        return new Paper.Content();
    }

    /**
     * Create an instance of {@link Paper.References }
     * 
     */
    public Paper.References createPaperReferences() {
        return new Paper.References();
    }

    /**
     * Create an instance of {@link Paper.Citations }
     * 
     */
    public Paper.Citations createPaperCitations() {
        return new Paper.Citations();
    }

    /**
     * Create an instance of {@link Formula }
     * 
     */
    public Formula createFormula() {
        return new Formula();
    }

    /**
     * Create an instance of {@link Section.List }
     * 
     */
    public Section.List createSectionList() {
        return new Section.List();
    }

    /**
     * Create an instance of {@link Mention.Work }
     * 
     */
    public Mention.Work createMentionWork() {
        return new Mention.Work();
    }

    /**
     * Create an instance of {@link Mention.Authors.Author }
     * 
     */
    public Mention.Authors.Author createMentionAuthorsAuthor() {
        return new Mention.Authors.Author();
    }

    /**
     * Create an instance of {@link Section.Table.Row.Cell }
     * 
     */
    public Section.Table.Row.Cell createSectionTableRowCell() {
        return new Section.Table.Row.Cell();
    }

    /**
     * Create an instance of {@link Paper.Notes.Note }
     * 
     */
    public Paper.Notes.Note createPaperNotesNote() {
        return new Paper.Notes.Note();
    }

    /**
     * Create an instance of {@link Paper.Abstract.Keywords }
     * 
     */
    public Paper.Abstract.Keywords createPaperAbstractKeywords() {
        return new Paper.Abstract.Keywords();
    }

    /**
     * Create an instance of {@link Paper.Authors.Author.Personal }
     * 
     */
    public Paper.Authors.Author.Personal createPaperAuthorsAuthorPersonal() {
        return new Paper.Authors.Author.Personal();
    }

    /**
     * Create an instance of {@link Paper.Authors.Author.Institution }
     * 
     */
    public Paper.Authors.Author.Institution createPaperAuthorsAuthorInstitution() {
        return new Paper.Authors.Author.Institution();
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
