//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 09:19:38 AM EST 
//


package com.healthedge.connector.schema.cobpolicy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RxInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RxInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rxBin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rxPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RxInfoType", propOrder = {
    "rxBin",
    "pcn",
    "rxGroup",
    "rxId",
    "rxPhoneNumber"
})
public class RxInfoType {

    protected String rxBin;
    protected String pcn;
    protected String rxGroup;
    protected String rxId;
    protected String rxPhoneNumber;

    /**
     * Gets the value of the rxBin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxBin() {
        return rxBin;
    }

    /**
     * Sets the value of the rxBin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxBin(String value) {
        this.rxBin = value;
    }

    /**
     * Gets the value of the pcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcn() {
        return pcn;
    }

    /**
     * Sets the value of the pcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcn(String value) {
        this.pcn = value;
    }

    /**
     * Gets the value of the rxGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxGroup() {
        return rxGroup;
    }

    /**
     * Sets the value of the rxGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxGroup(String value) {
        this.rxGroup = value;
    }

    /**
     * Gets the value of the rxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxId() {
        return rxId;
    }

    /**
     * Sets the value of the rxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxId(String value) {
        this.rxId = value;
    }

    /**
     * Gets the value of the rxPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRxPhoneNumber() {
        return rxPhoneNumber;
    }

    /**
     * Sets the value of the rxPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRxPhoneNumber(String value) {
        this.rxPhoneNumber = value;
    }

}
