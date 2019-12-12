
package tim6.models.cover_letter;

import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="submission_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="content">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element name="list">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="list_item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="type" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="ordered"/>
 *                                 &lt;enumeration value="unordered"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="paragraph">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="bold" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="italic" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *                 &lt;attribute name="tel" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "title",
    "submissionDate",
    "content",
    "author"
})
@XmlRootElement(name = "cover_letter")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class CoverLetter {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String title;
    @XmlElement(name = "submission_date", required = true)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar submissionDate;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CoverLetter.Content content;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CoverLetter.Author author;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the submissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Sets the value of the submissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSubmissionDate(XMLGregorianCalendar value) {
        this.submissionDate = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link CoverLetter.Content }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CoverLetter.Content getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverLetter.Content }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setContent(CoverLetter.Content value) {
        this.content = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link CoverLetter.Author }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CoverLetter.Author getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverLetter.Author }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAuthor(CoverLetter.Author value) {
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
     *       &lt;attribute name="tel" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Author {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected CoverLetter.Author.Personal personal;
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected CoverLetter.Author.Institution institution;
        @XmlAttribute(name = "email")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String email;
        @XmlAttribute(name = "tel")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected String tel;

        /**
         * Gets the value of the personal property.
         * 
         * @return
         *     possible object is
         *     {@link CoverLetter.Author.Personal }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public CoverLetter.Author.Personal getPersonal() {
            return personal;
        }

        /**
         * Sets the value of the personal property.
         * 
         * @param value
         *     allowed object is
         *     {@link CoverLetter.Author.Personal }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setPersonal(CoverLetter.Author.Personal value) {
            this.personal = value;
        }

        /**
         * Gets the value of the institution property.
         * 
         * @return
         *     possible object is
         *     {@link CoverLetter.Author.Institution }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public CoverLetter.Author.Institution getInstitution() {
            return institution;
        }

        /**
         * Sets the value of the institution property.
         * 
         * @param value
         *     allowed object is
         *     {@link CoverLetter.Author.Institution }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setInstitution(CoverLetter.Author.Institution value) {
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the tel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public String getTel() {
            return tel;
        }

        /**
         * Sets the value of the tel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setTel(String value) {
            this.tel = value;
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Institution {

            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String name;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String city;
            @XmlElement(required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String country;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Personal {

            @XmlElement(name = "first_name", required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String firstName;
            @XmlElement(name = "middle_name")
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String middleName;
            @XmlElement(name = "last_name", required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String lastName;

            /**
             * Gets the value of the firstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setLastName(String value) {
                this.lastName = value;
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
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element name="list">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="list_item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="type" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="ordered"/>
     *                       &lt;enumeration value="unordered"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="paragraph">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="bold" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="italic" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "listOrParagraph"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Content {

        @XmlElements({
            @XmlElement(name = "list", type = CoverLetter.Content.List.class),
            @XmlElement(name = "paragraph", type = CoverLetter.Content.Paragraph.class)
        })
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected java.util.List<Object> listOrParagraph;

        /**
         * Gets the value of the listOrParagraph property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listOrParagraph property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getListOrParagraph().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CoverLetter.Content.List }
         * {@link CoverLetter.Content.Paragraph }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public java.util.List<Object> getListOrParagraph() {
            if (listOrParagraph == null) {
                listOrParagraph = new ArrayList<Object>();
            }
            return this.listOrParagraph;
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
         *         &lt;element name="list_item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="type" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="ordered"/>
         *             &lt;enumeration value="unordered"/>
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
            "listItem"
        })
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class List {

            @XmlElement(name = "list_item", required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String listItem;
            @XmlAttribute(name = "type", required = true)
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected String type;

            /**
             * Gets the value of the listItem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getListItem() {
                return listItem;
            }

            /**
             * Sets the value of the listItem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setListItem(String value) {
                this.listItem = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public void setType(String value) {
                this.type = value;
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
         *       &lt;choice maxOccurs="unbounded" minOccurs="0">
         *         &lt;element name="bold" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="italic" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "content"
        })
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public static class Paragraph {

            @XmlElementRefs({
                @XmlElementRef(name = "bold", namespace = "XML_tim6", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "italic", namespace = "XML_tim6", type = JAXBElement.class, required = false)
            })
            @XmlMixed
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            protected java.util.List<Serializable> content;

            /**
             * Gets the value of the content property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the content property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link String }
             * 
             * 
             */
            @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:15:13+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
            public java.util.List<Serializable> getContent() {
                if (content == null) {
                    content = new ArrayList<Serializable>();
                }
                return this.content;
            }

        }

    }

}
