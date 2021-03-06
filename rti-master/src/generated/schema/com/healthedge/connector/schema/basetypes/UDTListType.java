//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 09:19:38 AM EST 
//


package com.healthedge.connector.schema.basetypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UDTListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UDTListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="udtListValueSet" type="{http://www.healthedge.com/connector/schema/basetypes}UDTValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userDefinedTermReference" type="{http://www.healthedge.com/connector/schema/basetypes}ReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UDTListType", propOrder = {
    "udtListValueSet",
    "userDefinedTermReference"
})
public class UDTListType {

    protected List<UDTValueType> udtListValueSet;
    protected ReferenceType userDefinedTermReference;

    /**
     * Gets the value of the udtListValueSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udtListValueSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUdtListValueSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDTValueType }
     * 
     * 
     */
    public List<UDTValueType> getUdtListValueSet() {
        if (udtListValueSet == null) {
            udtListValueSet = new ArrayList<UDTValueType>();
        }
        return this.udtListValueSet;
    }

    /**
     * Gets the value of the userDefinedTermReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getUserDefinedTermReference() {
        return userDefinedTermReference;
    }

    /**
     * Sets the value of the userDefinedTermReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setUserDefinedTermReference(ReferenceType value) {
        this.userDefinedTermReference = value;
    }

}
