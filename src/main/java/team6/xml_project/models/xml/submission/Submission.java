
package team6.xml_project.models.xml.submission;

import team6.xml_project.models.SubmissionStatus;
import team6.xml_project.models.xml.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}ID"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authorId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="editorId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="reviewerIds" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reviewerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{XML_tim6}submissionStatus"/>
 *         &lt;element name="currentRevision" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "id",
    "title",
    "authorId",
    "editorId",
    "reviewerIds",
    "submissionStatus",
    "currentRevision"
})
@XmlRootElement(name = "submission")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Submission extends Document {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String id = UUID.randomUUID().toString();;
    @XmlElement(required = true, defaultValue = "")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String title = "";
    @XmlElement(defaultValue = "0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected long authorId = 0;
    @XmlElement(defaultValue = "0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected long editorId = 0;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Submission.ReviewerIds> reviewerIds =  new ArrayList<>();;
    @XmlElement(required = true, defaultValue = "SUBMITTED_FOR_REVIEW")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String submissionStatus = SubmissionStatus.SUBMITTED_FOR_REVIEW.toString();
    @XmlElement(defaultValue = "1")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected long currentRevision = 1;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the authorId property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public long getAuthorId() {
        return authorId;
    }

    /**
     * Sets the value of the authorId property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAuthorId(long value) {
        this.authorId = value;
    }

    /**
     * Gets the value of the editorId property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public long getEditorId() {
        return editorId;
    }

    /**
     * Sets the value of the editorId property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEditorId(long value) {
        this.editorId = value;
    }

    /**
     * Gets the value of the reviewerIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reviewerIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReviewerIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Submission.ReviewerIds }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Submission.ReviewerIds> getReviewerIds() {
        if (reviewerIds == null) {
            reviewerIds = new ArrayList<Submission.ReviewerIds>();
        }
        return this.reviewerIds;
    }

    /**
     * Gets the value of the submissionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getSubmissionStatus() {
        return submissionStatus;
    }

    /**
     * Sets the value of the submissionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSubmissionStatus(String value) {
        this.submissionStatus = value;
    }

    /**
     * Gets the value of the currentRevision property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public long getCurrentRevision() {
        return currentRevision;
    }

    /**
     * Sets the value of the currentRevision property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCurrentRevision(long value) {
        this.currentRevision = value;
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
     *         &lt;element name="reviewerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
        "reviewerId"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class ReviewerIds {

        @XmlElement(defaultValue = "0")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected long reviewerId;

        /**
         * Gets the value of the reviewerId property.
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public long getReviewerId() {
            return reviewerId;
        }

        /**
         * Sets the value of the reviewerId property.
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2020-01-30T03:56:57+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public void setReviewerId(long value) {
            this.reviewerId = value;
        }

    }

}
