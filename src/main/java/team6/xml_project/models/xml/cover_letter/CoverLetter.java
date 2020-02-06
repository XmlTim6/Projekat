
package team6.xml_project.models.xml.cover_letter;

import team6.xml_project.models.xml.Document;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *                   &lt;element ref="{XML_tim6}list"/>
 *                   &lt;element ref="{XML_tim6}paragraph"/>
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
 *                       &lt;pattern value="[_\-a-zA-Z0-9\.\+]+@[a-zA-Z0-9](\.?[\-a-zA-Z0-9]*[a-zA-Z0-9])*"/>
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
@XmlRootElement(name = "cover_letter", namespace = "XML_tim6")
public class CoverLetter extends Document {

    @XmlElement(namespace = "XML_tim6", required = true)
    protected String title;
    @XmlElement(name = "submission_date", namespace = "XML_tim6", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar submissionDate;
    @XmlElement(namespace = "XML_tim6", required = true)
    protected CoverLetter.Content content;
    @XmlElement(namespace = "XML_tim6", required = true)
    protected CoverLetter.Author author;

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
     * Gets the value of the submissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
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
     *             &lt;pattern value="[_\-a-zA-Z0-9\.\+]+@[a-zA-Z0-9](\.?[\-a-zA-Z0-9]*[a-zA-Z0-9])*"/>
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
    public static class Author {

        @XmlElement(namespace = "XML_tim6", required = true)
        protected CoverLetter.Author.Personal personal;
        @XmlElement(namespace = "XML_tim6")
        protected CoverLetter.Author.Institution institution;
        @XmlAttribute(name = "email")
        protected String email;
        @XmlAttribute(name = "tel")
        protected String tel;

        /**
         * Gets the value of the personal property.
         * 
         * @return
         *     possible object is
         *     {@link CoverLetter.Author.Personal }
         *     
         */
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
         * Gets the value of the tel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
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
        public static class Institution {

            @XmlElement(namespace = "XML_tim6", required = true)
            protected String name;
            @XmlElement(namespace = "XML_tim6", required = true)
            protected String city;
            @XmlElement(namespace = "XML_tim6", required = true)
            protected String country;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
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
        public static class Personal {

            @XmlElement(name = "first_name", namespace = "XML_tim6", required = true)
            protected String firstName;
            @XmlElement(name = "middle_name", namespace = "XML_tim6")
            protected String middleName;
            @XmlElement(name = "last_name", namespace = "XML_tim6", required = true)
            protected String lastName;

            /**
             * Gets the value of the firstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
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
     *         &lt;element ref="{XML_tim6}list"/>
     *         &lt;element ref="{XML_tim6}paragraph"/>
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
    public static class Content {

        @XmlElements({
            @XmlElement(name = "list", namespace = "XML_tim6", type = team6.xml_project.models.xml.cover_letter.List.class),
            @XmlElement(name = "paragraph", namespace = "XML_tim6", type = Paragraph.class)
        })
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
         * {@link team6.xml_project.models.xml.cover_letter.List }
         * {@link Paragraph }
         * 
         * 
         */
        public java.util.List<Object> getListOrParagraph() {
            if (listOrParagraph == null) {
                listOrParagraph = new ArrayList<Object>();
            }
            return this.listOrParagraph;
        }

    }

}
