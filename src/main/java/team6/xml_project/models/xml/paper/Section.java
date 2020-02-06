
package team6.xml_project.models.xml.paper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{XML_tim6}paragraph"/>
 *         &lt;element ref="{XML_tim6}image"/>
 *         &lt;element ref="{XML_tim6}list"/>
 *         &lt;element ref="{XML_tim6}quote"/>
 *         &lt;element ref="{XML_tim6}section"/>
 *         &lt;element ref="{XML_tim6}code"/>
 *         &lt;element ref="{XML_tim6}formula"/>
 *         &lt;element name="table">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="row">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded">
 *                             &lt;element name="cell">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice minOccurs="0">
 *                                       &lt;element ref="{XML_tim6}paragraph"/>
 *                                     &lt;/choice>
 *                                     &lt;attribute name="colspan" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *                                     &lt;attribute name="rowspan" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
 *                                     &lt;anyAttribute processContents='lax'/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;anyAttribute processContents='lax'/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                 &lt;attribute name="title" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;anyAttribute processContents='lax'/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="title" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="level" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
    "paragraphOrImageOrList"
})
@XmlRootElement(name = "section", namespace = "XML_tim6")
public class Section {

    @XmlElements({
        @XmlElement(name = "paragraph", namespace = "XML_tim6", type = Paragraph.class),
        @XmlElement(name = "image", namespace = "XML_tim6", type = Image.class),
        @XmlElement(name = "list", namespace = "XML_tim6", type = team6.xml_project.models.xml.paper.List.class),
        @XmlElement(name = "quote", namespace = "XML_tim6", type = Quote.class),
        @XmlElement(name = "section", namespace = "XML_tim6", type = Section.class),
        @XmlElement(name = "code", namespace = "XML_tim6", type = Code.class),
        @XmlElement(name = "formula", namespace = "XML_tim6", type = Formula.class),
        @XmlElement(name = "table", namespace = "XML_tim6", type = Section.Table.class)
    })
    protected java.util.List<Object> paragraphOrImageOrList;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "title", required = true)
    protected String title;
    @XmlAttribute(name = "level", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long level;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the paragraphOrImageOrList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paragraphOrImageOrList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParagraphOrImageOrList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Paragraph }
     * {@link Image }
     * {@link team6.xml_project.models.xml.paper.List }
     * {@link Quote }
     * {@link Section }
     * {@link Code }
     * {@link Formula }
     * {@link Section.Table }
     * 
     * 
     */
    public java.util.List<Object> getParagraphOrImageOrList() {
        if (paragraphOrImageOrList == null) {
            paragraphOrImageOrList = new ArrayList<Object>();
        }
        return this.paragraphOrImageOrList;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
     * Gets the value of the level property.
     * 
     */
    public long getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     */
    public void setLevel(long value) {
        this.level = value;
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
     *         &lt;element name="row">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;element name="cell">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice minOccurs="0">
     *                             &lt;element ref="{XML_tim6}paragraph"/>
     *                           &lt;/choice>
     *                           &lt;attribute name="colspan" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
     *                           &lt;attribute name="rowspan" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
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
     *       &lt;/sequence>
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
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
        "row"
    })
    public static class Table {

        @XmlElement(namespace = "XML_tim6", required = true)
        protected java.util.List<Section.Table.Row> row;
        @XmlAttribute(name = "id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(name = "title", required = true)
        protected String title;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the row property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the row property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Section.Table.Row }
         * 
         * 
         */
        public java.util.List<Section.Table.Row> getRow() {
            if (row == null) {
                row = new ArrayList<Section.Table.Row>();
            }
            return this.row;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
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
         *         &lt;element name="cell">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice minOccurs="0">
         *                   &lt;element ref="{XML_tim6}paragraph"/>
         *                 &lt;/choice>
         *                 &lt;attribute name="colspan" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
         *                 &lt;attribute name="rowspan" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
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
            "cell"
        })
        public static class Row {

            @XmlElement(namespace = "XML_tim6", required = true)
            protected java.util.List<Section.Table.Row.Cell> cell;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the cell property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cell property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCell().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Section.Table.Row.Cell }
             * 
             * 
             */
            public java.util.List<Section.Table.Row.Cell> getCell() {
                if (cell == null) {
                    cell = new ArrayList<Section.Table.Row.Cell>();
                }
                return this.cell;
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
             *       &lt;choice minOccurs="0">
             *         &lt;element ref="{XML_tim6}paragraph"/>
             *       &lt;/choice>
             *       &lt;attribute name="colspan" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
             *       &lt;attribute name="rowspan" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="1" />
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
                "paragraph"
            })
            public static class Cell {

                @XmlElement(namespace = "XML_tim6")
                protected Paragraph paragraph;
                @XmlAttribute(name = "colspan")
                @XmlSchemaType(name = "unsignedInt")
                protected Long colspan;
                @XmlAttribute(name = "rowspan")
                @XmlSchemaType(name = "unsignedInt")
                protected Long rowspan;
                @XmlAnyAttribute
                private Map<QName, String> otherAttributes = new HashMap<QName, String>();

                /**
                 * Gets the value of the paragraph property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Paragraph }
                 *     
                 */
                public Paragraph getParagraph() {
                    return paragraph;
                }

                /**
                 * Sets the value of the paragraph property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Paragraph }
                 *     
                 */
                public void setParagraph(Paragraph value) {
                    this.paragraph = value;
                }

                /**
                 * Gets the value of the colspan property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public long getColspan() {
                    if (colspan == null) {
                        return  1L;
                    } else {
                        return colspan;
                    }
                }

                /**
                 * Sets the value of the colspan property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setColspan(Long value) {
                    this.colspan = value;
                }

                /**
                 * Gets the value of the rowspan property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public long getRowspan() {
                    if (rowspan == null) {
                        return  1L;
                    } else {
                        return rowspan;
                    }
                }

                /**
                 * Sets the value of the rowspan property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setRowspan(Long value) {
                    this.rowspan = value;
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
                public Map<QName, String> getOtherAttributes() {
                    return otherAttributes;
                }

            }

        }

    }

}
