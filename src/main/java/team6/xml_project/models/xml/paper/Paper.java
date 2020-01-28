
package team6.xml_project.models.xml.paper;

import team6.xml_project.models.xml.Document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="received">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                 &lt;anyAttribute processContents='lax'/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="revised">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                 &lt;anyAttribute processContents='lax'/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="accepted">
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
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="methodology">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="findings">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="research_implications">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="practical_implcations">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="orginality">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
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
@XmlRootElement(name = "paper")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Paper extends Document {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Paper.Received received;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Paper.Revised revised;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Paper.Accepted accepted;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Paper.Authors authors;
    @XmlElement(name = "abstract", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Paper.Abstract _abstract;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Paper.Content content;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Paper.References references;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Paper.Citations citations;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Paper.Notes notes;
    @XmlAttribute(name = "title", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String title;
    @XmlAnyAttribute
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the received property.
     * 
     * @return
     *     possible object is
     *     {@link Paper.Received }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="methodology">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="findings">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="research_implications">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="practical_implcations">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="orginality">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
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
        "practicalImplcations",
        "orginality",
        "keywords"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Abstract {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Paper.Abstract.Purpose purpose;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Paper.Abstract.Methodology methodology;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Paper.Abstract.Findings findings;
        @XmlElement(name = "research_implications", required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Paper.Abstract.ResearchImplications researchImplications;
        @XmlElement(name = "practical_implcations", required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Paper.Abstract.PracticalImplcations practicalImplcations;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Paper.Abstract.Orginality orginality;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Paper.Abstract.Keywords keywords;
        @XmlAttribute(name = "paper_type", required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String paperType;
        @XmlAnyAttribute
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the purpose property.
         * 
         * @return
         *     possible object is
         *     {@link Paper.Abstract.Purpose }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setResearchImplications(Paper.Abstract.ResearchImplications value) {
            this.researchImplications = value;
        }

        /**
         * Gets the value of the practicalImplcations property.
         * 
         * @return
         *     possible object is
         *     {@link Paper.Abstract.PracticalImplcations }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public Paper.Abstract.PracticalImplcations getPracticalImplcations() {
            return practicalImplcations;
        }

        /**
         * Sets the value of the practicalImplcations property.
         * 
         * @param value
         *     allowed object is
         *     {@link Paper.Abstract.PracticalImplcations }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setPracticalImplcations(Paper.Abstract.PracticalImplcations value) {
            this.practicalImplcations = value;
        }

        /**
         * Gets the value of the orginality property.
         * 
         * @return
         *     possible object is
         *     {@link Paper.Abstract.Orginality }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setPaperType(String value) {
            this.paperType = value;
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Findings {

            @XmlValue
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String value;
            @XmlAnyAttribute
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Keywords {

            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected List<Paper.Abstract.Keywords.Keyword> keyword;
            @XmlAnyAttribute
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Keyword {

                @XmlValue
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String value;
                @XmlAnyAttribute
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Methodology {

            @XmlValue
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String value;
            @XmlAnyAttribute
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Orginality {

            @XmlValue
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String value;
            @XmlAnyAttribute
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class PracticalImplcations {

            @XmlValue
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String value;
            @XmlAnyAttribute
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Purpose {

            @XmlValue
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String value;
            @XmlAnyAttribute
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class ResearchImplications {

            @XmlValue
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String value;
            @XmlAnyAttribute
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Accepted {

        @XmlValue
        @XmlSchemaType(name = "date")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected XMLGregorianCalendar value;
        @XmlAnyAttribute
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Authors {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Author {

            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Paper.Authors.Author.Personal personal;
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Paper.Authors.Author.Institution institution;
            @XmlAttribute(name = "email")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String email;
            @XmlAnyAttribute
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the personal property.
             * 
             * @return
             *     possible object is
             *     {@link Paper.Authors.Author.Personal }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Institution {

                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected Paper.Authors.Author.Institution.Name name;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected Paper.Authors.Author.Institution.City city;
                @XmlElement(required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected Paper.Authors.Author.Institution.Country country;
                @XmlAnyAttribute
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Paper.Authors.Author.Institution.Name }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public static class City {

                    @XmlValue
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    protected String value;
                    @XmlAnyAttribute
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public static class Country {

                    @XmlValue
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    protected String value;
                    @XmlAnyAttribute
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public static class Name {

                    @XmlValue
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    protected String value;
                    @XmlAnyAttribute
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Personal {

                @XmlElement(name = "first_name", required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected Paper.Authors.Author.Personal.FirstName firstName;
                @XmlElement(name = "middle_name")
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected Paper.Authors.Author.Personal.MiddleName middleName;
                @XmlElement(name = "last_name", required = true)
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected Paper.Authors.Author.Personal.LastName lastName;

                /**
                 * Gets the value of the firstName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Paper.Authors.Author.Personal.FirstName }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public static class FirstName {

                    @XmlValue
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    protected String value;
                    @XmlAnyAttribute
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public static class LastName {

                    @XmlValue
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    protected String value;
                    @XmlAnyAttribute
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public static class MiddleName {

                    @XmlValue
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    protected String value;
                    @XmlAnyAttribute
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Citations {

        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Mention> mention;
        @XmlAnyAttribute
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Content {

        @XmlElements({
            @XmlElement(name = "section", type = Section.class),
            @XmlElement(name = "quote", type = Quote.class)
        })
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Object> sectionOrQuote;
        @XmlAnyAttribute
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Notes {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Paper.Notes.Note> note;
        @XmlAnyAttribute
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Note {

            @XmlValue
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String value;
            @XmlAttribute(name = "ref_id")
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Object refId;
            @XmlAnyAttribute
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Received {

        @XmlValue
        @XmlSchemaType(name = "date")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected XMLGregorianCalendar value;
        @XmlAnyAttribute
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class References {

        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Mention> mention;
        @XmlAnyAttribute
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Revised {

        @XmlValue
        @XmlSchemaType(name = "date")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected XMLGregorianCalendar value;
        @XmlAnyAttribute
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-28T05:39:49+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }

    }

}
