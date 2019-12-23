
package team6.xml_project.models.xml.paper;

import team6.xml_project.models.xml.Document;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *                                       &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="middle_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="email">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
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
 *                   &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="methodology" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="findings" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="research_implications" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="practical_implcations" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="orginality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="keywords">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded">
 *                             &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
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
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="title" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="received" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="revised" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="accepted" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authors",
    "_abstract",
    "content",
    "references",
    "citations",
    "notes"
})
@XmlRootElement(name = "paper")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Paper extends Document {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Paper.Authors authors;
    @XmlElement(name = "abstract", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Paper.Abstract _abstract;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Paper.Content content;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Paper.References references;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Paper.Citations citations;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Notes notes;
    @XmlAttribute(name = "title", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String title;
    @XmlAttribute(name = "received")
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar received;
    @XmlAttribute(name = "revised")
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar revised;
    @XmlAttribute(name = "accepted")
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar accepted;

    /**
     * Gets the value of the authors property.
     * 
     * @return
     *     possible object is
     *     {@link Authors }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Authors getAuthors() {
        return authors;
    }

    /**
     * Sets the value of the authors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authors }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAuthors(Authors value) {
        this.authors = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link Abstract }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Abstract getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Abstract }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAbstract(Abstract value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Content getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setContent(Content value) {
        this.content = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link References }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public References getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link References }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setReferences(References value) {
        this.references = value;
    }

    /**
     * Gets the value of the citations property.
     * 
     * @return
     *     possible object is
     *     {@link Citations }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Citations getCitations() {
        return citations;
    }

    /**
     * Sets the value of the citations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Citations }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCitations(Citations value) {
        this.citations = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Notes }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notes }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNotes(Notes value) {
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the received property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getReceived() {
        return received;
    }

    /**
     * Sets the value of the received property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setReceived(XMLGregorianCalendar value) {
        this.received = value;
    }

    /**
     * Gets the value of the revised property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getRevised() {
        return revised;
    }

    /**
     * Sets the value of the revised property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRevised(XMLGregorianCalendar value) {
        this.revised = value;
    }

    /**
     * Gets the value of the accepted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAccepted(XMLGregorianCalendar value) {
        this.accepted = value;
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
     *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="methodology" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="findings" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="research_implications" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="practical_implcations" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="orginality" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="keywords">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
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
        "practicalImplcations",
        "orginality",
        "keywords"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Abstract {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String purpose;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String methodology;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String findings;
        @XmlElement(name = "research_implications", required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String researchImplications;
        @XmlElement(name = "practical_implcations", required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String practicalImplcations;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String orginality;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Paper.Abstract.Keywords keywords;
        @XmlAttribute(name = "paper_type", required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String paperType;

        /**
         * Gets the value of the purpose property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public String getPurpose() {
            return purpose;
        }

        /**
         * Sets the value of the purpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setPurpose(String value) {
            this.purpose = value;
        }

        /**
         * Gets the value of the methodology property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public String getMethodology() {
            return methodology;
        }

        /**
         * Sets the value of the methodology property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setMethodology(String value) {
            this.methodology = value;
        }

        /**
         * Gets the value of the findings property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public String getFindings() {
            return findings;
        }

        /**
         * Sets the value of the findings property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setFindings(String value) {
            this.findings = value;
        }

        /**
         * Gets the value of the researchImplications property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public String getResearchImplications() {
            return researchImplications;
        }

        /**
         * Sets the value of the researchImplications property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setResearchImplications(String value) {
            this.researchImplications = value;
        }

        /**
         * Gets the value of the practicalImplcations property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public String getPracticalImplcations() {
            return practicalImplcations;
        }

        /**
         * Sets the value of the practicalImplcations property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setPracticalImplcations(String value) {
            this.practicalImplcations = value;
        }

        /**
         * Gets the value of the orginality property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public String getOrginality() {
            return orginality;
        }

        /**
         * Sets the value of the orginality property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setOrginality(String value) {
            this.orginality = value;
        }

        /**
         * Gets the value of the keywords property.
         * 
         * @return
         *     possible object is
         *     {@link Keywords }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public Keywords getKeywords() {
            return keywords;
        }

        /**
         * Sets the value of the keywords property.
         * 
         * @param value
         *     allowed object is
         *     {@link Keywords }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setKeywords(Keywords value) {
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setPaperType(String value) {
            this.paperType = value;
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
         *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "keyword"
        })
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Keywords {

            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected List<String> keyword;

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
             * {@link String }
             * 
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public List<String> getKeyword() {
                if (keyword == null) {
                    keyword = new ArrayList<String>();
                }
                return this.keyword;
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
     *                             &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="middle_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="email">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Authors {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Author> author;

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
         * {@link Author }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Author> getAuthor() {
            if (author == null) {
                author = new ArrayList<Author>();
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
         *                   &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="middle_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="email">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Author {

            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Paper.Authors.Author.Personal personal;
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Institution institution;
            @XmlAttribute(name = "email")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String email;

            /**
             * Gets the value of the personal property.
             * 
             * @return
             *     possible object is
             *     {@link Personal }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public Personal getPersonal() {
                return personal;
            }

            /**
             * Sets the value of the personal property.
             * 
             * @param value
             *     allowed object is
             *     {@link Personal }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setPersonal(Personal value) {
                this.personal = value;
            }

            /**
             * Gets the value of the institution property.
             * 
             * @return
             *     possible object is
             *     {@link Institution }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public Institution getInstitution() {
                return institution;
            }

            /**
             * Sets the value of the institution property.
             * 
             * @param value
             *     allowed object is
             *     {@link Institution }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setInstitution(Institution value) {
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setEmail(String value) {
                this.email = value;
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
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "name",
                "city",
                "country"
            })
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Institution {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String name;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String city;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String country;

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the city property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getCity() {
                    return city;
                }

                /**
                 * Sets the value of the city property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCity(String value) {
                    this.city = value;
                }

                /**
                 * Gets the value of the country property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getCountry() {
                    return country;
                }

                /**
                 * Sets the value of the country property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setCountry(String value) {
                    this.country = value;
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
             *         &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="middle_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Personal {

                @XmlElement(name = "first_name", required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String firstName;
                @XmlElement(name = "middle_name")
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String middleName;
                @XmlElement(name = "last_name", required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String lastName;

                /**
                 * Gets the value of the firstName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getFirstName() {
                    return firstName;
                }

                /**
                 * Sets the value of the firstName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setFirstName(String value) {
                    this.firstName = value;
                }

                /**
                 * Gets the value of the middleName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getMiddleName() {
                    return middleName;
                }

                /**
                 * Sets the value of the middleName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setMiddleName(String value) {
                    this.middleName = value;
                }

                /**
                 * Gets the value of the lastName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public String getLastName() {
                    return lastName;
                }

                /**
                 * Sets the value of the lastName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public void setLastName(String value) {
                    this.lastName = value;
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Citations {

        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Mention> mention;

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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Mention> getMention() {
            if (mention == null) {
                mention = new ArrayList<Mention>();
            }
            return this.mention;
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Content {

        @XmlElements({
            @XmlElement(name = "section", type = Section.class),
            @XmlElement(name = "quote", type = Quote.class)
        })
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Object> sectionOrQuote;

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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Object> getSectionOrQuote() {
            if (sectionOrQuote == null) {
                sectionOrQuote = new ArrayList<Object>();
            }
            return this.sectionOrQuote;
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
        "note"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Notes {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Note> note;

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
         * {@link Note }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Note> getNote() {
            if (note == null) {
                note = new ArrayList<Note>();
            }
            return this.note;
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Note {

            @XmlValue
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String value;
            @XmlAttribute(name = "ref_id")
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Object refId;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setRefId(Object value) {
                this.refId = value;
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class References {

        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Mention> mention;

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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Mention> getMention() {
            if (mention == null) {
                mention = new ArrayList<Mention>();
            }
            return this.mention;
        }

    }

}
