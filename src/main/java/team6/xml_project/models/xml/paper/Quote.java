
package team6.xml_project.models.xml.paper;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="attributed_to" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reference_to" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
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
@XmlRootElement(name = "quote")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Quote {

    @XmlValue
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String value;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String id;
    @XmlAttribute(name = "attributed_to", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String attributedTo;
    @XmlAttribute(name = "source", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String source;
    @XmlAttribute(name = "reference_to", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Object referenceTo;

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
     * Gets the value of the attributedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getAttributedTo() {
        return attributedTo;
    }

    /**
     * Sets the value of the attributedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAttributedTo(String value) {
        this.attributedTo = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the referenceTo property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Object getReferenceTo() {
        return referenceTo;
    }

    /**
     * Sets the value of the referenceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:10:17+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setReferenceTo(Object value) {
        this.referenceTo = value;
    }

}
