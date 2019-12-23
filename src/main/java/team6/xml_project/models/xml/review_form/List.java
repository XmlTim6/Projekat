
package team6.xml_project.models.xml.review_form;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
@XmlRootElement(name = "list")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:14:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class List {

    @XmlElement(name = "list_item", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:14:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String listItem;
    @XmlAttribute(name = "type", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:14:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String type;

    /**
     * Gets the value of the listItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:14:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:14:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:14:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-12-04T04:14:54+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setType(String value) {
        this.type = value;
    }

}
