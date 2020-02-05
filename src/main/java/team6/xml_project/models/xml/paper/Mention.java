
package team6.xml_project.models.xml.paper;

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
import javax.xml.bind.annotation.XmlID;
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
 *                             &lt;element name="last_name">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;anyAttribute processContents='lax'/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="initial">
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
 *                 &lt;anyAttribute processContents='lax'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="work">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="year_published" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>gYear">
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="title">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="edition" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>unsignedInt">
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
 *                   &lt;element name="publisher">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="numbers" minOccurs="0">
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
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
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
    "authors",
    "work"
})
@XmlRootElement(name = "mention")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Mention {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Mention.Authors authors;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Mention.Work work;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String id;
    @XmlAttribute(name = "location")
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String location;
    @XmlAnyAttribute
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the authors property.
     * 
     * @return
     *     possible object is
     *     {@link Mention.Authors }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Mention.Authors getAuthors() {
        return authors;
    }

    /**
     * Sets the value of the authors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mention.Authors }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAuthors(Mention.Authors value) {
        this.authors = value;
    }

    /**
     * Gets the value of the work property.
     * 
     * @return
     *     possible object is
     *     {@link Mention.Work }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Mention.Work getWork() {
        return work;
    }

    /**
     * Sets the value of the work property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mention.Work }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setWork(Mention.Work value) {
        this.work = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLocation(String value) {
        this.location = value;
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="author">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="last_name">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;anyAttribute processContents='lax'/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="initial">
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
        "author"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Authors {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Mention.Authors.Author> author;
        @XmlAnyAttribute
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
         * {@link Mention.Authors.Author }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Mention.Authors.Author> getAuthor() {
            if (author == null) {
                author = new ArrayList<Mention.Authors.Author>();
            }
            return this.author;
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
         *         &lt;element name="last_name">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;anyAttribute processContents='lax'/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="initial">
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
            "lastName",
            "initial"
        })
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Author {

            @XmlElement(name = "last_name", required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Mention.Authors.Author.LastName lastName;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected Mention.Authors.Author.Initial initial;
            @XmlAnyAttribute
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the lastName property.
             * 
             * @return
             *     possible object is
             *     {@link Mention.Authors.Author.LastName }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public Mention.Authors.Author.LastName getLastName() {
                return lastName;
            }

            /**
             * Sets the value of the lastName property.
             * 
             * @param value
             *     allowed object is
             *     {@link Mention.Authors.Author.LastName }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setLastName(Mention.Authors.Author.LastName value) {
                this.lastName = value;
            }

            /**
             * Gets the value of the initial property.
             * 
             * @return
             *     possible object is
             *     {@link Mention.Authors.Author.Initial }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public Mention.Authors.Author.Initial getInitial() {
                return initial;
            }

            /**
             * Sets the value of the initial property.
             * 
             * @param value
             *     allowed object is
             *     {@link Mention.Authors.Author.Initial }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setInitial(Mention.Authors.Author.Initial value) {
                this.initial = value;
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class Initial {

                @XmlValue
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String value;
                @XmlAnyAttribute
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public static class LastName {

                @XmlValue
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                protected String value;
                @XmlAnyAttribute
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
                @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
                public Map<QName, String> getOtherAttributes() {
                    return otherAttributes;
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
     *       &lt;sequence>
     *         &lt;element name="year_published" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>gYear">
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="title">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="edition" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>unsignedInt">
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
     *         &lt;element name="publisher">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;anyAttribute processContents='lax'/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="numbers" minOccurs="0">
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
        "yearPublished",
        "title",
        "edition",
        "city",
        "publisher",
        "numbers"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Work {

        @XmlElement(name = "year_published")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Mention.Work.YearPublished yearPublished;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Mention.Work.Title title;
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Mention.Work.Edition edition;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Mention.Work.City city;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Mention.Work.Publisher publisher;
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Mention.Work.Numbers numbers;
        @XmlAnyAttribute
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the yearPublished property.
         * 
         * @return
         *     possible object is
         *     {@link Mention.Work.YearPublished }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public Mention.Work.YearPublished getYearPublished() {
            return yearPublished;
        }

        /**
         * Sets the value of the yearPublished property.
         * 
         * @param value
         *     allowed object is
         *     {@link Mention.Work.YearPublished }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setYearPublished(Mention.Work.YearPublished value) {
            this.yearPublished = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link Mention.Work.Title }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public Mention.Work.Title getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link Mention.Work.Title }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setTitle(Mention.Work.Title value) {
            this.title = value;
        }

        /**
         * Gets the value of the edition property.
         * 
         * @return
         *     possible object is
         *     {@link Mention.Work.Edition }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public Mention.Work.Edition getEdition() {
            return edition;
        }

        /**
         * Sets the value of the edition property.
         * 
         * @param value
         *     allowed object is
         *     {@link Mention.Work.Edition }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setEdition(Mention.Work.Edition value) {
            this.edition = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link Mention.Work.City }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public Mention.Work.City getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link Mention.Work.City }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setCity(Mention.Work.City value) {
            this.city = value;
        }

        /**
         * Gets the value of the publisher property.
         * 
         * @return
         *     possible object is
         *     {@link Mention.Work.Publisher }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public Mention.Work.Publisher getPublisher() {
            return publisher;
        }

        /**
         * Sets the value of the publisher property.
         * 
         * @param value
         *     allowed object is
         *     {@link Mention.Work.Publisher }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setPublisher(Mention.Work.Publisher value) {
            this.publisher = value;
        }

        /**
         * Gets the value of the numbers property.
         * 
         * @return
         *     possible object is
         *     {@link Mention.Work.Numbers }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public Mention.Work.Numbers getNumbers() {
            return numbers;
        }

        /**
         * Sets the value of the numbers property.
         * 
         * @param value
         *     allowed object is
         *     {@link Mention.Work.Numbers }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setNumbers(Mention.Work.Numbers value) {
            this.numbers = value;
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class City {

            @XmlValue
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String value;
            @XmlAnyAttribute
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>unsignedInt">
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Edition {

            @XmlValue
            @XmlSchemaType(name = "unsignedInt")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected long value;
            @XmlAnyAttribute
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public long getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setValue(long value) {
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Numbers {

            @XmlValue
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String value;
            @XmlAnyAttribute
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Publisher {

            @XmlValue
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String value;
            @XmlAnyAttribute
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Title {

            @XmlValue
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String value;
            @XmlAnyAttribute
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>gYear">
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class YearPublished {

            @XmlValue
            @XmlSchemaType(name = "gYear")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected XMLGregorianCalendar value;
            @XmlAnyAttribute
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-02-05T04:07:23+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public Map<QName, String> getOtherAttributes() {
                return otherAttributes;
            }

        }

    }

}
