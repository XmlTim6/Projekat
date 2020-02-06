
package team6.xml_project.models.xml.paper;

import team6.xml_project.models.xml.Document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="received" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                 &lt;anyAttribute processContents='lax'/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="revised" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                 &lt;anyAttribute processContents='lax'/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="accepted" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                 &lt;anyAttribute processContents='lax'/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="authors">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="author">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="personal">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="first_name">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;anyAttribute processContents='lax'/>
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="middle_name" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;anyAttribute processContents='lax'/>
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="last_name">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;anyAttribute processContents='lax'/>
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="institution" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="name">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;anyAttribute processContents='lax'/>
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="city">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;anyAttribute processContents='lax'/>
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="country">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;anyAttribute processContents='lax'/>
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;anyAttribute processContents='lax'/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="email">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[_\-a-zA-Z0-9\.\+]+@[a-zA-Z0-9](\.?[\-a-zA-Z0-9]*[a-zA-Z0-9])*"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="abstract">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purpose">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="methodology">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="findings">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="research_implications">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="practical_implications">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="orginality">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="keywords">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded">
 *                             &lt;element name="keyword">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;anyAttribute processContents='lax'/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="paper_type" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="conceptual"/>
 *                       &lt;enumeration value="empirical"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                 &lt;anyAttribute processContents='lax'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="content">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element ref="{XML_tim6}section"/>
 *                   &lt;element ref="{XML_tim6}quote"/>
 *                 &lt;/choice>
 *                 &lt;anyAttribute processContents='lax'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="references">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{XML_tim6}mention"/>
 *                 &lt;/sequence>
 *                 &lt;anyAttribute processContents='lax'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="citations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{XML_tim6}mention"/>
 *                 &lt;/sequence>
 *                 &lt;anyAttribute processContents='lax'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="notes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="note">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="ref_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;anyAttribute processContents='lax'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="title" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "received",
    "revised",
    "accepted",
    "authors",
    "_abstract",
    "content",
    "references",
    "citations",
    "notes"
})
@XmlRootElement(name = "paper", namespace = "XML_tim6")
public class Paper extends Document {

    @XmlElement(namespace = "XML_tim6")
    protected Paper.Received received;
    @XmlElement(namespace = "XML_tim6")
    protected Paper.Revised revised;
    @XmlElement(namespace = "XML_tim6")
    protected Paper.Accepted accepted;
    @XmlElement(namespace = "XML_tim6", required = true)
    protected Paper.Authors authors;
    @XmlElement(name = "abstract", namespace = "XML_tim6", required = true)
    protected Paper.Abstract _abstract;
    @XmlElement(namespace = "XML_tim6", required = true)
    protected Paper.Content content;
    @XmlElement(namespace = "XML_tim6", required = true)
    protected Paper.References references;
    @XmlElement(namespace = "XML_tim6", required = true)
    protected Paper.Citations citations;
    @XmlElement(namespace = "XML_tim6")
    protected Paper.Notes notes;
    @XmlAttribute(name = "title", required = true)
    protected String title;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the received property.
     * 
     * @return
     *     possible object is
     *     {@link Paper.Received }
     *     
     */
    public Paper.Received getReceived() {
        return received;
    }

    /**
     * Sets the value of the received property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paper.Received }
     *     
     */
    public void setReceived(Paper.Received value) {
        this.received = value;
    }

    /**
     * Gets the value of the revised property.
     * 
     * @return
     *     possible object is
     *     {@link Paper.Revised }
     *     
     */
    public Paper.Revised getRevised() {
        return revised;
    }

    /**
     * Sets the value of the revised property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paper.Revised }
     *     
     */
    public void setRevised(Paper.Revised value) {
        this.revised = value;
    }

    /**
     * Gets the value of the accepted property.
     * 
     * @return
     *     possible object is
     *     {@link Paper.Accepted }
     *     
     */
    public Paper.Accepted getAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paper.Accepted }
     *     
     */
    public void setAccepted(Paper.Accepted value) {
        this.accepted = value;
    }

    /**
     * Gets the value of the authors property.
     * 
     * @return
     *     possible object is
     *     {@link Paper.Authors }
     *     
     */
    public Paper.Authors getAuthors() {
        return authors;
    }

    /**
     * Sets the value of the authors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paper.Authors }
     *     
     */
    public void setAuthors(Paper.Authors value) {
        this.authors = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link Paper.Abstract }
     *     
     */
    public Paper.Abstract getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paper.Abstract }
     *     
     */
    public void setAbstract(Paper.Abstract value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Paper.Content }
     *     
     */
    public Paper.Content getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paper.Content }
     *     
     */
    public void setContent(Paper.Content value) {
        this.content = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link Paper.References }
     *     
     */
    public Paper.References getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paper.References }
     *     
     */
    public void setReferences(Paper.References value) {
        this.references = value;
    }

    /**
     * Gets the value of the citations property.
     * 
     * @return
     *     possible object is
     *     {@link Paper.Citations }
     *     
     */
    public Paper.Citations getCitations() {
        return citations;
    }

    /**
     * Sets the value of the citations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paper.Citations }
     *     
     */
    public void setCitations(Paper.Citations value) {
        this.citations = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Paper.Notes }
     *     
     */
    public Paper.Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paper.Notes }
     *     
     */
    public void setNotes(Paper.Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="purpose">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="methodology">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="findings">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="research_implications">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="practical_implications">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="orginality">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="keywords">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;element name="keyword">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;anyAttribute processContents='lax'/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="paper_type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="conceptual"/>
     *             &lt;enumeration value="empirical"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *       &lt;anyAttribute processContents='lax'/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "purpose",
        "methodology",
        "findings",
        "researchImplications",
        "practicalImplications",
        "orginality",
        "keywords"
    })
    public static class Abstract {

        @XmlElement(namespace = "XML_tim6", required = true)
        protected Paper.Abstract.Purpose purpose;
        @XmlElement(namespace = "XML_tim6", required = true)
        protected Paper.Abstract.Methodology methodology;
        @XmlElement(namespace = "XML_tim6", required = true)
        protected Paper.Abstract.Findings findings;
        @XmlElement(name = "research_implications", namespace = "XML_tim6", required = true)
        protected Paper.Abstract.ResearchImplications researchImplications;
        @XmlElement(name = "practical_implications", namespace = "XML_tim6", required = true)
        protected Paper.Abstract.PracticalImplications practicalImplications;
        @XmlElement(namespace = "XML_tim6", required = true)
        protected Paper.Abstract.Orginality orginality;
        @XmlElement(namespace = "XML_tim6", required = true)
        protected Paper.Abstract.Keywords keywords;
        @XmlAttribute(name = "paper_type", required = true)
        protected String paperType;
        @XmlAttribute(name = "id")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the purpose property.
         * 
         * @return
         *     possible object is
         *     {@link Paper.Abstract.Purpose }
         *     
         */
        public Paper.Abstract.Purpose getPurpose() {
            return purpose;
        }

        /**
         * Sets the value of the purpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link Paper.Abstract.Purpose }
         *     
         */
        public void setPurpose(Paper.Abstract.Purpose value) {
            this.purpose = value;
        }

        /**
         * Gets the value of the methodology property.
         * 
         * @return
         *     possible object is
         *     {@link Paper.Abstract.Methodology }
         *     
         */
        public Paper.Abstract.Methodology getMethodology() {
            return methodology;
        }

        /**
         * Sets the value of the methodology property.
         * 
         * @param value
         *     allowed object is
         *     {@link Paper.Abstract.Methodology }
         *     
         */
        public void setMethodology(Paper.Abstract.Methodology value) {
            this.methodology = value;
        }

        /**
         * Gets the value of the findings property.
         * 
         * @return
         *     possible object is
         *     {@link Paper.Abstract.Findings }
         *     
         */
        public Paper.Abstract.Findings getFindings() {
            return findings;
        }

        /**
         * Sets the value of the findings property.
         * 
         * @param value
         *     allowed object is
         *     {@link Paper.Abstract.Findings }
         *     
         */
        public void setFindings(Paper.Abstract.Findings value) {
            this.findings = value;
        }

        /**
         * Gets the value of the researchImplications property.
         * 
         * @return
         *     possible object is
         *     {@link Paper.Abstract.ResearchImplications }
         *     
         */
        public Paper.Abstract.ResearchImplications getResearchImplications() {
            return researchImplications;
        }

        /**
         * Sets the value of the researchImplications property.
         * 
         * @param value
         *     allowed object is
         *     {@link Paper.Abstract.ResearchImplications }
         *     
         */
        public void setResearchImplications(Paper.Abstract.ResearchImplications value) {
            this.researchImplications = value;
        }

        /**
         * Gets the value of the practicalImplications property.
         * 
         * @return
         *     possible object is
         *     {@link Paper.Abstract.PracticalImplications }
         *     
         */
        public Paper.Abstract.PracticalImplications getPracticalImplications() {
            return practicalImplications;
        }

        /**
         * Sets the value of the practicalImplications property.
         * 
         * @param value
         *     allowed object is
         *     {@link Paper.Abstract.PracticalImplications }
         *     
         */
        public void setPracticalImplications(Paper.Abstract.PracticalImplications value) {
            this.practicalImplications = value;
        }

        /**
         * Gets the value of the orginality property.
         * 
         * @return
         *     possible object is
         *     {@link Paper.Abstract.Orginality }
         *     
         */
        public Paper.Abstract.Orginality getOrginality() {
            return orginality;
        }

        /**
         * Sets the value of the orginality property.
         * 
         * @param value
         *     allowed object is
         *     {@link Paper.Abstract.Orginality }
         *     
         */
        public void setOrginality(Paper.Abstract.Orginality value) {
            this.orginality = value;
        }

        /**
         * Gets the value of the keywords property.
         * 
         * @return
         *     possible object is
         *     {@link Paper.Abstract.Keywords }
         *     
         */
        public Paper.Abstract.Keywords getKeywords() {
            return keywords;
        }

        /**
         * Sets the value of the keywords property.
         * 
         * @param value
         *     allowed object is
         *     {@link Paper.Abstract.Keywords }
         *     
         */
        public void setKeywords(Paper.Abstract.Keywords value) {
            this.keywords = value;
        }

        /**
         * Gets the value of the paperType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaperType() {
            return paperType;
        }

        /**
         * Sets the value of the paperType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaperType(String value) {
            this.paperType = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *       &lt;anyAttribute processContents='lax'/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Findings {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets a map that contains attributes that aren't bound to any typed property on this class.
             * 
             * <p>
             * the map is keyed by the name of the attribute and 
             * the value is the string value of the attribute.
             * 
             * the map returned by this method is live, and you can add new attribute
             * by updating the map directly. Because of this design, there's no setter.
             * 
             * 
             * @return
             *     always non-null
             */
            public Map<QName, String> getOtherAttributes() {
                return otherAttributes;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence maxOccurs="unbounded">
         *         &lt;element name="keyword">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;anyAttribute processContents='lax'/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;anyAttribute processContents='lax'/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "keyword"
        })
        public static class Keywords {

            @XmlElement(namespace = "XML_tim6", required = true)
            protected List<Paper.Abstract.Keywords.Keyword> keyword;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the keyword property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the keyword property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getKeyword().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Paper.Abstract.Keywords.Keyword }
             * 
             * 
             */
            public List<Paper.Abstract.Keywords.Keyword> getKeyword() {
                if (keyword == null) {
                    keyword = new ArrayList<Paper.Abstract.Keywords.Keyword>();
                }
                return this.keyword;
            }

            /**
             * Gets a map that contains attributes that aren't bound to any typed property on this class.
             * 
             * <p>
             * the map is keyed by the name of the attribute and 
             * the value is the string value of the attribute.
             * 
             * the map returned by this method is live, and you can add new attribute
             * by updating the map directly. Because of this design, there's no setter.
             * 
             * 
             * @return
             *     always non-null
             */
            public Map<QName, String> getOtherAttributes() {
                return otherAttributes;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;anyAttribute processContents='lax'/>
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Keyword {

                @XmlValue
                protected String value;
                @XmlAnyAttribute
                private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets a map that contains attributes that aren't bound to any typed property on this class.
                 * 
                 * <p>
                 * the map is keyed by the name of the attribute and 
                 * the value is the string value of the attribute.
                 * 
                 * the map returned by this method is live, and you can add new attribute
                 * by updating the map directly. Because of this design, there's no setter.
                 * 
                 * 
                 * @return
                 *     always non-null
                 */
                public Map<QName, String> getOtherAttributes() {
                    return otherAttributes;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *       &lt;anyAttribute processContents='lax'/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Methodology {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets a map that contains attributes that aren't bound to any typed property on this class.
             * 
             * <p>
             * the map is keyed by the name of the attribute and 
             * the value is the string value of the attribute.
             * 
             * the map returned by this method is live, and you can add new attribute
             * by updating the map directly. Because of this design, there's no setter.
             * 
             * 
             * @return
             *     always non-null
             */
            public Map<QName, String> getOtherAttributes() {
                return otherAttributes;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *       &lt;anyAttribute processContents='lax'/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Orginality {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets a map that contains attributes that aren't bound to any typed property on this class.
             * 
             * <p>
             * the map is keyed by the name of the attribute and 
             * the value is the string value of the attribute.
             * 
             * the map returned by this method is live, and you can add new attribute
             * by updating the map directly. Because of this design, there's no setter.
             * 
             * 
             * @return
             *     always non-null
             */
            public Map<QName, String> getOtherAttributes() {
                return otherAttributes;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *       &lt;anyAttribute processContents='lax'/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class PracticalImplications {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets a map that contains attributes that aren't bound to any typed property on this class.
             * 
             * <p>
             * the map is keyed by the name of the attribute and 
             * the value is the string value of the attribute.
             * 
             * the map returned by this method is live, and you can add new attribute
             * by updating the map directly. Because of this design, there's no setter.
             * 
             * 
             * @return
             *     always non-null
             */
            public Map<QName, String> getOtherAttributes() {
                return otherAttributes;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *       &lt;anyAttribute processContents='lax'/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Purpose {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets a map that contains attributes that aren't bound to any typed property on this class.
             * 
             * <p>
             * the map is keyed by the name of the attribute and 
             * the value is the string value of the attribute.
             * 
             * the map returned by this method is live, and you can add new attribute
             * by updating the map directly. Because of this design, there's no setter.
             * 
             * 
             * @return
             *     always non-null
             */
            public Map<QName, String> getOtherAttributes() {
                return otherAttributes;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
         *       &lt;anyAttribute processContents='lax'/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ResearchImplications {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets a map that contains attributes that aren't bound to any typed property on this class.
             * 
             * <p>
             * the map is keyed by the name of the attribute and 
             * the value is the string value of the attribute.
             * 
             * the map returned by this method is live, and you can add new attribute
             * by updating the map directly. Because of this design, there's no setter.
             * 
             * 
             * @return
             *     always non-null
             */
            public Map<QName, String> getOtherAttributes() {
                return otherAttributes;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
     *       &lt;anyAttribute processContents='lax'/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Accepted {

        @XmlValue
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar value;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(XMLGregorianCalendar value) {
            this.value = value;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="author">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="personal">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="first_name">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;anyAttribute processContents='lax'/>
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="middle_name" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;anyAttribute processContents='lax'/>
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="last_name">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;anyAttribute processContents='lax'/>
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="institution" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="name">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;anyAttribute processContents='lax'/>
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="city">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;anyAttribute processContents='lax'/>
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="country">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;anyAttribute processContents='lax'/>
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;anyAttribute processContents='lax'/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="email">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[_\-a-zA-Z0-9\.\+]+@[a-zA-Z0-9](\.?[\-a-zA-Z0-9]*[a-zA-Z0-9])*"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "author"
    })
    public static class Authors {

        @XmlElement(namespace = "XML_tim6", required = true)
        protected List<Paper.Authors.Author> author;

        /**
         * Gets the value of the author property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the author property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuthor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Paper.Authors.Author }
         * 
         * 
         */
        public List<Paper.Authors.Author> getAuthor() {
            if (author == null) {
                author = new ArrayList<Paper.Authors.Author>();
            }
            return this.author;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="personal">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="first_name">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;anyAttribute processContents='lax'/>
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="middle_name" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;anyAttribute processContents='lax'/>
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="last_name">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;anyAttribute processContents='lax'/>
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="institution" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="name">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;anyAttribute processContents='lax'/>
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="city">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;anyAttribute processContents='lax'/>
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="country">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;anyAttribute processContents='lax'/>
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;anyAttribute processContents='lax'/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="email">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[_\-a-zA-Z0-9\.\+]+@[a-zA-Z0-9](\.?[\-a-zA-Z0-9]*[a-zA-Z0-9])*"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;anyAttribute processContents='lax'/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "personal",
            "institution"
        })
        public static class Author {

            @XmlElement(namespace = "XML_tim6", required = true)
            protected Paper.Authors.Author.Personal personal;
            @XmlElement(namespace = "XML_tim6")
            protected Paper.Authors.Author.Institution institution;
            @XmlAttribute(name = "email")
            protected String email;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the personal property.
             * 
             * @return
             *     possible object is
             *     {@link Paper.Authors.Author.Personal }
             *     
             */
            public Paper.Authors.Author.Personal getPersonal() {
                return personal;
            }

            /**
             * Sets the value of the personal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Paper.Authors.Author.Personal }
             *     
             */
            public void setPersonal(Paper.Authors.Author.Personal value) {
                this.personal = value;
            }

            /**
             * Gets the value of the institution property.
             * 
             * @return
             *     possible object is
             *     {@link Paper.Authors.Author.Institution }
             *     
             */
            public Paper.Authors.Author.Institution getInstitution() {
                return institution;
            }

            /**
             * Sets the value of the institution property.
             * 
             * @param value
             *     allowed object is
             *     {@link Paper.Authors.Author.Institution }
             *     
             */
            public void setInstitution(Paper.Authors.Author.Institution value) {
                this.institution = value;
            }

            /**
             * Gets the value of the email property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * Sets the value of the email property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
            }

            /**
             * Gets a map that contains attributes that aren't bound to any typed property on this class.
             * 
             * <p>
             * the map is keyed by the name of the attribute and 
             * the value is the string value of the attribute.
             * 
             * the map returned by this method is live, and you can add new attribute
             * by updating the map directly. Because of this design, there's no setter.
             * 
             * 
             * @return
             *     always non-null
             */
            public Map<QName, String> getOtherAttributes() {
                return otherAttributes;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="name">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;anyAttribute processContents='lax'/>
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="city">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;anyAttribute processContents='lax'/>
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="country">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;anyAttribute processContents='lax'/>
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;anyAttribute processContents='lax'/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name",
                "city",
                "country"
            })
            public static class Institution {

                @XmlElement(namespace = "XML_tim6", required = true)
                protected Paper.Authors.Author.Institution.Name name;
                @XmlElement(namespace = "XML_tim6", required = true)
                protected Paper.Authors.Author.Institution.City city;
                @XmlElement(namespace = "XML_tim6", required = true)
                protected Paper.Authors.Author.Institution.Country country;
                @XmlAnyAttribute
                private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Paper.Authors.Author.Institution.Name }
                 *     
                 */
                public Paper.Authors.Author.Institution.Name getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Paper.Authors.Author.Institution.Name }
                 *     
                 */
                public void setName(Paper.Authors.Author.Institution.Name value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the city property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Paper.Authors.Author.Institution.City }
                 *     
                 */
                public Paper.Authors.Author.Institution.City getCity() {
                    return city;
                }

                /**
                 * Sets the value of the city property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Paper.Authors.Author.Institution.City }
                 *     
                 */
                public void setCity(Paper.Authors.Author.Institution.City value) {
                    this.city = value;
                }

                /**
                 * Gets the value of the country property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Paper.Authors.Author.Institution.Country }
                 *     
                 */
                public Paper.Authors.Author.Institution.Country getCountry() {
                    return country;
                }

                /**
                 * Sets the value of the country property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Paper.Authors.Author.Institution.Country }
                 *     
                 */
                public void setCountry(Paper.Authors.Author.Institution.Country value) {
                    this.country = value;
                }

                /**
                 * Gets a map that contains attributes that aren't bound to any typed property on this class.
                 * 
                 * <p>
                 * the map is keyed by the name of the attribute and 
                 * the value is the string value of the attribute.
                 * 
                 * the map returned by this method is live, and you can add new attribute
                 * by updating the map directly. Because of this design, there's no setter.
                 * 
                 * 
                 * @return
                 *     always non-null
                 */
                public Map<QName, String> getOtherAttributes() {
                    return otherAttributes;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;anyAttribute processContents='lax'/>
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class City {

                    @XmlValue
                    protected String value;
                    @XmlAnyAttribute
                    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets a map that contains attributes that aren't bound to any typed property on this class.
                     * 
                     * <p>
                     * the map is keyed by the name of the attribute and 
                     * the value is the string value of the attribute.
                     * 
                     * the map returned by this method is live, and you can add new attribute
                     * by updating the map directly. Because of this design, there's no setter.
                     * 
                     * 
                     * @return
                     *     always non-null
                     */
                    public Map<QName, String> getOtherAttributes() {
                        return otherAttributes;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;anyAttribute processContents='lax'/>
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Country {

                    @XmlValue
                    protected String value;
                    @XmlAnyAttribute
                    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets a map that contains attributes that aren't bound to any typed property on this class.
                     * 
                     * <p>
                     * the map is keyed by the name of the attribute and 
                     * the value is the string value of the attribute.
                     * 
                     * the map returned by this method is live, and you can add new attribute
                     * by updating the map directly. Because of this design, there's no setter.
                     * 
                     * 
                     * @return
                     *     always non-null
                     */
                    public Map<QName, String> getOtherAttributes() {
                        return otherAttributes;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;anyAttribute processContents='lax'/>
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Name {

                    @XmlValue
                    protected String value;
                    @XmlAnyAttribute
                    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets a map that contains attributes that aren't bound to any typed property on this class.
                     * 
                     * <p>
                     * the map is keyed by the name of the attribute and 
                     * the value is the string value of the attribute.
                     * 
                     * the map returned by this method is live, and you can add new attribute
                     * by updating the map directly. Because of this design, there's no setter.
                     * 
                     * 
                     * @return
                     *     always non-null
                     */
                    public Map<QName, String> getOtherAttributes() {
                        return otherAttributes;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="first_name">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;anyAttribute processContents='lax'/>
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="middle_name" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;anyAttribute processContents='lax'/>
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="last_name">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;anyAttribute processContents='lax'/>
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "firstName",
                "middleName",
                "lastName"
            })
            public static class Personal {

                @XmlElement(name = "first_name", namespace = "XML_tim6", required = true)
                protected Paper.Authors.Author.Personal.FirstName firstName;
                @XmlElement(name = "middle_name", namespace = "XML_tim6")
                protected Paper.Authors.Author.Personal.MiddleName middleName;
                @XmlElement(name = "last_name", namespace = "XML_tim6", required = true)
                protected Paper.Authors.Author.Personal.LastName lastName;

                /**
                 * Gets the value of the firstName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Paper.Authors.Author.Personal.FirstName }
                 *     
                 */
                public Paper.Authors.Author.Personal.FirstName getFirstName() {
                    return firstName;
                }

                /**
                 * Sets the value of the firstName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Paper.Authors.Author.Personal.FirstName }
                 *     
                 */
                public void setFirstName(Paper.Authors.Author.Personal.FirstName value) {
                    this.firstName = value;
                }

                /**
                 * Gets the value of the middleName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Paper.Authors.Author.Personal.MiddleName }
                 *     
                 */
                public Paper.Authors.Author.Personal.MiddleName getMiddleName() {
                    return middleName;
                }

                /**
                 * Sets the value of the middleName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Paper.Authors.Author.Personal.MiddleName }
                 *     
                 */
                public void setMiddleName(Paper.Authors.Author.Personal.MiddleName value) {
                    this.middleName = value;
                }

                /**
                 * Gets the value of the lastName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Paper.Authors.Author.Personal.LastName }
                 *     
                 */
                public Paper.Authors.Author.Personal.LastName getLastName() {
                    return lastName;
                }

                /**
                 * Sets the value of the lastName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Paper.Authors.Author.Personal.LastName }
                 *     
                 */
                public void setLastName(Paper.Authors.Author.Personal.LastName value) {
                    this.lastName = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;anyAttribute processContents='lax'/>
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class FirstName {

                    @XmlValue
                    protected String value;
                    @XmlAnyAttribute
                    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets a map that contains attributes that aren't bound to any typed property on this class.
                     * 
                     * <p>
                     * the map is keyed by the name of the attribute and 
                     * the value is the string value of the attribute.
                     * 
                     * the map returned by this method is live, and you can add new attribute
                     * by updating the map directly. Because of this design, there's no setter.
                     * 
                     * 
                     * @return
                     *     always non-null
                     */
                    public Map<QName, String> getOtherAttributes() {
                        return otherAttributes;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;anyAttribute processContents='lax'/>
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class LastName {

                    @XmlValue
                    protected String value;
                    @XmlAnyAttribute
                    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets a map that contains attributes that aren't bound to any typed property on this class.
                     * 
                     * <p>
                     * the map is keyed by the name of the attribute and 
                     * the value is the string value of the attribute.
                     * 
                     * the map returned by this method is live, and you can add new attribute
                     * by updating the map directly. Because of this design, there's no setter.
                     * 
                     * 
                     * @return
                     *     always non-null
                     */
                    public Map<QName, String> getOtherAttributes() {
                        return otherAttributes;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;anyAttribute processContents='lax'/>
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class MiddleName {

                    @XmlValue
                    protected String value;
                    @XmlAnyAttribute
                    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets a map that contains attributes that aren't bound to any typed property on this class.
                     * 
                     * <p>
                     * the map is keyed by the name of the attribute and 
                     * the value is the string value of the attribute.
                     * 
                     * the map returned by this method is live, and you can add new attribute
                     * by updating the map directly. Because of this design, there's no setter.
                     * 
                     * 
                     * @return
                     *     always non-null
                     */
                    public Map<QName, String> getOtherAttributes() {
                        return otherAttributes;
                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{XML_tim6}mention"/>
     *       &lt;/sequence>
     *       &lt;anyAttribute processContents='lax'/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mention"
    })
    public static class Citations {

        @XmlElement(namespace = "XML_tim6")
        protected List<Mention> mention;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the mention property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mention property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMention().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Mention }
         * 
         * 
         */
        public List<Mention> getMention() {
            if (mention == null) {
                mention = new ArrayList<Mention>();
            }
            return this.mention;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element ref="{XML_tim6}section"/>
     *         &lt;element ref="{XML_tim6}quote"/>
     *       &lt;/choice>
     *       &lt;anyAttribute processContents='lax'/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sectionOrQuote"
    })
    public static class Content {

        @XmlElements({
            @XmlElement(name = "section", namespace = "XML_tim6", type = Section.class),
            @XmlElement(name = "quote", namespace = "XML_tim6", type = Quote.class)
        })
        protected List<Object> sectionOrQuote;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the sectionOrQuote property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sectionOrQuote property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSectionOrQuote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Section }
         * {@link Quote }
         * 
         * 
         */
        public List<Object> getSectionOrQuote() {
            if (sectionOrQuote == null) {
                sectionOrQuote = new ArrayList<Object>();
            }
            return this.sectionOrQuote;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="note">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="ref_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;anyAttribute processContents='lax'/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "note"
    })
    public static class Notes {

        @XmlElement(namespace = "XML_tim6", required = true)
        protected List<Paper.Notes.Note> note;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the note property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the note property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Paper.Notes.Note }
         * 
         * 
         */
        public List<Paper.Notes.Note> getNote() {
            if (note == null) {
                note = new ArrayList<Paper.Notes.Note>();
            }
            return this.note;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="ref_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
         *       &lt;anyAttribute processContents='lax'/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Note {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "ref_id")
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object refId;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the refId property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getRefId() {
                return refId;
            }

            /**
             * Sets the value of the refId property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setRefId(Object value) {
                this.refId = value;
            }

            /**
             * Gets a map that contains attributes that aren't bound to any typed property on this class.
             * 
             * <p>
             * the map is keyed by the name of the attribute and 
             * the value is the string value of the attribute.
             * 
             * the map returned by this method is live, and you can add new attribute
             * by updating the map directly. Because of this design, there's no setter.
             * 
             * 
             * @return
             *     always non-null
             */
            public Map<QName, String> getOtherAttributes() {
                return otherAttributes;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
     *       &lt;anyAttribute processContents='lax'/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Received {

        @XmlValue
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar value;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(XMLGregorianCalendar value) {
            this.value = value;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{XML_tim6}mention"/>
     *       &lt;/sequence>
     *       &lt;anyAttribute processContents='lax'/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mention"
    })
    public static class References {

        @XmlElement(namespace = "XML_tim6")
        protected List<Mention> mention;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the mention property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mention property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMention().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Mention }
         * 
         * 
         */
        public List<Mention> getMention() {
            if (mention == null) {
                mention = new ArrayList<Mention>();
            }
            return this.mention;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
     *       &lt;anyAttribute processContents='lax'/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Revised {

        @XmlValue
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar value;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(XMLGregorianCalendar value) {
            this.value = value;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }

    }

}
