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
 * <p>Java class for ConfidentialCommunicationDirectiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfidentialCommunicationDirectiveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/basetypes}ConfidentialCommunicationDirectiveGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfidentialCommunicationDirectiveType", propOrder = {
    "confidentialCommunicationScope",
    "effectiveStartDate",
    "effectiveEndDate",
    "confidentialCommunicationTypeCode"
})
public class ConfidentialCommunicationDirectiveType {

    protected String confidentialCommunicationScope;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveEndDate;
    protected CodeEntryInputType confidentialCommunicationTypeCode;

    /**
     * Gets the value of the confidentialCommunicationScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidentialCommunicationScope() {
        return confidentialCommunicationScope;
    }

    /**
     * Sets the value of the confidentialCommunicationScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidentialCommunicationScope(String value) {
        this.confidentialCommunicationScope = value;
    }

    /**
     * Gets the value of the effectiveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveStartDate() {
        return effectiveStartDate;
    }

    /**
     * Sets the value of the effectiveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveStartDate(XMLGregorianCalendar value) {
        this.effectiveStartDate = value;
    }

    /**
     * Gets the value of the effectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * Sets the value of the effectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveEndDate(XMLGregorianCalendar value) {
        this.effectiveEndDate = value;
    }

    /**
     * Gets the value of the confidentialCommunicationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getConfidentialCommunicationTypeCode() {
        return confidentialCommunicationTypeCode;
    }

    /**
     * Sets the value of the confidentialCommunicationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setConfidentialCommunicationTypeCode(CodeEntryInputType value) {
        this.confidentialCommunicationTypeCode = value;
    }

}
