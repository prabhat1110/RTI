//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 09:19:38 AM EST 
//


package com.healthedge.connector.schema.basetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherIDsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherIDsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otherID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="otherIDTypeCode" type="{http://www.healthedge.com/connector/schema/basetypes}CodeEntryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherIDsType", propOrder = {
    "otherID",
    "otherIDTypeCode"
})
public class OtherIDsType {

    @XmlElement(required = true)
    protected String otherID;
    @XmlElement(required = true)
    protected CodeEntryType otherIDTypeCode;

    /**
     * Gets the value of the otherID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherID() {
        return otherID;
    }

    /**
     * Sets the value of the otherID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherID(String value) {
        this.otherID = value;
    }

    /**
     * Gets the value of the otherIDTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryType }
     *     
     */
    public CodeEntryType getOtherIDTypeCode() {
        return otherIDTypeCode;
    }

    /**
     * Sets the value of the otherIDTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryType }
     *     
     */
    public void setOtherIDTypeCode(CodeEntryType value) {
        this.otherIDTypeCode = value;
    }

}
