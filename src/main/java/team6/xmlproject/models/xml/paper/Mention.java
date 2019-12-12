
package team6.xmlproject.models.xml.paper;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *                 &lt;sequence>
 *                   &lt;element name="author">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="work">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="year_published" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="edition" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="publisher" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="numbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
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
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Mention {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Mention.Authors authors;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Mention.Work work;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String id;

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
     * Gets the value of the work property.
     * 
     * @return
     *     possible object is
     *     {@link Work }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Work getWork() {
        return work;
    }

    /**
     * Sets the value of the work property.
     * 
     * @param value
     *     allowed object is
     *     {@link Work }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setWork(Work value) {
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setId(String value) {
        this.id = value;
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
     *         &lt;element name="author">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
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
        protected Mention.Authors.Author author;

        /**
         * Gets the value of the author property.
         * 
         * @return
         *     possible object is
         *     {@link Author }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public Author getAuthor() {
            return author;
        }

        /**
         * Sets the value of the author property.
         * 
         * @param value
         *     allowed object is
         *     {@link Author }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setAuthor(Author value) {
            this.author = value;
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
         *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "lastName",
            "initial"
        })
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Author {

            @XmlElement(name = "last_name", required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String lastName;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String initial;

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

            /**
             * Gets the value of the initial property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getInitial() {
                return initial;
            }

            /**
             * Sets the value of the initial property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setInitial(String value) {
                this.initial = value;
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
     *         &lt;element name="year_published" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="edition" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
     *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="publisher" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="numbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "yearPublished",
        "title",
        "edition",
        "city",
        "publisher",
        "numbers"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Work {

        @XmlElement(name = "year_published")
        @XmlSchemaType(name = "gYear")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected XMLGregorianCalendar yearPublished;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String title;
        @XmlSchemaType(name = "unsignedInt")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected Long edition;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String city;
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String publisher;
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String numbers;

        /**
         * Gets the value of the yearPublished property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public XMLGregorianCalendar getYearPublished() {
            return yearPublished;
        }

        /**
         * Sets the value of the yearPublished property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setYearPublished(XMLGregorianCalendar value) {
            this.yearPublished = value;
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
         * Gets the value of the edition property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public Long getEdition() {
            return edition;
        }

        /**
         * Sets the value of the edition property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setEdition(Long value) {
            this.edition = value;
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
         * Gets the value of the publisher property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public String getPublisher() {
            return publisher;
        }

        /**
         * Sets the value of the publisher property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setPublisher(String value) {
            this.publisher = value;
        }

        /**
         * Gets the value of the numbers property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public String getNumbers() {
            return numbers;
        }

        /**
         * Sets the value of the numbers property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setNumbers(String value) {
            this.numbers = value;
        }

    }

}
