
package team6.xml_project.models.xml.review_form;

import team6.xml_project.models.xml.Document;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="overview" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="positive_side" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="major_remarks">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element ref="{XML_tim6}paragraph"/>
 *                   &lt;element ref="{XML_tim6}list"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="minor_remarks">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element ref="{XML_tim6}paragraph"/>
 *                   &lt;element ref="{XML_tim6}list"/>
 *                 &lt;/choice>
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
    "overview",
    "positiveSide",
    "majorRemarks",
    "minorRemarks"
})
@XmlRootElement(name = "review_form", namespace = "XML_tim6")
public class ReviewForm extends Document {

    @XmlElement(namespace = "XML_tim6", required = true)
    protected String overview;
    @XmlElement(name = "positive_side", namespace = "XML_tim6", required = true)
    protected String positiveSide;
    @XmlElement(name = "major_remarks", namespace = "XML_tim6", required = true)
    protected ReviewForm.MajorRemarks majorRemarks;
    @XmlElement(name = "minor_remarks", namespace = "XML_tim6", required = true)
    protected ReviewForm.MinorRemarks minorRemarks;

    /**
     * Gets the value of the overview property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverview() {
        return overview;
    }

    /**
     * Sets the value of the overview property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverview(String value) {
        this.overview = value;
    }

    /**
     * Gets the value of the positiveSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositiveSide() {
        return positiveSide;
    }

    /**
     * Sets the value of the positiveSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositiveSide(String value) {
        this.positiveSide = value;
    }

    /**
     * Gets the value of the majorRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link ReviewForm.MajorRemarks }
     *     
     */
    public ReviewForm.MajorRemarks getMajorRemarks() {
        return majorRemarks;
    }

    /**
     * Sets the value of the majorRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewForm.MajorRemarks }
     *     
     */
    public void setMajorRemarks(ReviewForm.MajorRemarks value) {
        this.majorRemarks = value;
    }

    /**
     * Gets the value of the minorRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link ReviewForm.MinorRemarks }
     *     
     */
    public ReviewForm.MinorRemarks getMinorRemarks() {
        return minorRemarks;
    }

    /**
     * Sets the value of the minorRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewForm.MinorRemarks }
     *     
     */
    public void setMinorRemarks(ReviewForm.MinorRemarks value) {
        this.minorRemarks = value;
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
     *         &lt;element ref="{XML_tim6}paragraph"/>
     *         &lt;element ref="{XML_tim6}list"/>
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
        "paragraphOrList"
    })
    public static class MajorRemarks {

        @XmlElements({
            @XmlElement(name = "paragraph", namespace = "XML_tim6", type = Paragraph.class),
            @XmlElement(name = "list", namespace = "XML_tim6", type = team6.xml_project.models.xml.review_form.List.class)
        })
        protected java.util.List<Object> paragraphOrList;

        /**
         * Gets the value of the paragraphOrList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paragraphOrList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParagraphOrList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Paragraph }
         * {@link team6.xml_project.models.xml.review_form.List }
         * 
         * 
         */
        public java.util.List<Object> getParagraphOrList() {
            if (paragraphOrList == null) {
                paragraphOrList = new ArrayList<Object>();
            }
            return this.paragraphOrList;
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
     *         &lt;element ref="{XML_tim6}paragraph"/>
     *         &lt;element ref="{XML_tim6}list"/>
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
        "paragraphOrList"
    })
    public static class MinorRemarks {

        @XmlElements({
            @XmlElement(name = "paragraph", namespace = "XML_tim6", type = Paragraph.class),
            @XmlElement(name = "list", namespace = "XML_tim6", type = team6.xml_project.models.xml.review_form.List.class)
        })
        protected java.util.List<Object> paragraphOrList;

        /**
         * Gets the value of the paragraphOrList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paragraphOrList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParagraphOrList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Paragraph }
         * {@link team6.xml_project.models.xml.review_form.List }
         * 
         * 
         */
        public java.util.List<Object> getParagraphOrList() {
            if (paragraphOrList == null) {
                paragraphOrList = new ArrayList<Object>();
            }
            return this.paragraphOrList;
        }

    }

}
