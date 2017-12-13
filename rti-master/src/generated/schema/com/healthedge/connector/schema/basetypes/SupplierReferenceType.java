//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 09:19:38 AM EST 
//


package com.healthedge.connector.schema.basetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Supplier information used for matching during a search.
 * 
 * <p>Java class for SupplierReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hccIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplierOtherIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asOfDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierReferenceType", propOrder = {
    "hccIdentificationNumber",
    "supplierOtherIdentificationNumber",
    "primaryName",
    "asOfDate"
})
public class SupplierReferenceType {

    protected String hccIdentificationNumber;
    protected String supplierOtherIdentificationNumber;
    protected String primaryName;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asOfDate;

    /**
     * Gets the value of the hccIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHccIdentificationNumber() {
        return hccIdentificationNumber;
    }

    /**
     * Sets the value of the hccIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHccIdentificationNumber(String value) {
        this.hccIdentificationNumber = value;
    }

    /**
     * Gets the value of the supplierOtherIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierOtherIdentificationNumber() {
        return supplierOtherIdentificationNumber;
    }

    /**
     * Sets the value of the supplierOtherIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierOtherIdentificationNumber(String value) {
        this.supplierOtherIdentificationNumber = value;
    }

    /**
     * Gets the value of the primaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryName() {
        return primaryName;
    }

    /**
     * Sets the value of the primaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryName(String value) {
        this.primaryName = value;
    }

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfDate(XMLGregorianCalendar value) {
        this.asOfDate = value;
    }

}