//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 09:19:38 AM EST 
//


package com.healthedge.connector.schema.basetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * User Defined Types(UDT) for the Subscription
 * 
 * <p>Java class for UDTValueSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UDTValueSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.healthedge.com/connector/schema/basetypes}UDTValueGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UDTValueSetType", propOrder = {
    "attributeRoleName",
    "attrValueAsString"
})
public class UDTValueSetType {

    protected String attributeRoleName;
    protected String attrValueAsString;

    /**
     * Gets the value of the attributeRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeRoleName() {
        return attributeRoleName;
    }

    /**
     * Sets the value of the attributeRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeRoleName(String value) {
        this.attributeRoleName = value;
    }

    /**
     * Gets the value of the attrValueAsString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrValueAsString() {
        return attrValueAsString;
    }

    /**
     * Sets the value of the attrValueAsString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrValueAsString(String value) {
        this.attrValueAsString = value;
    }

}
