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
 * <p>Java class for HIPAARestrictionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HIPAARestrictionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/basetypes}HIPAARestrictionGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HIPAARestrictionType", propOrder = {
    "restrictionScope",
    "effectiveStartDate",
    "effectiveEndDate",
    "restrictedPerson",
    "relationshipToMemberCode"
})
public class HIPAARestrictionType {

    protected String restrictionScope;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveEndDate;
    protected PersonNameType restrictedPerson;
    protected CodeEntryInputType relationshipToMemberCode;

    /**
     * Gets the value of the restrictionScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictionScope() {
        return restrictionScope;
    }

    /**
     * Sets the value of the restrictionScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictionScope(String value) {
        this.restrictionScope = value;
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
     * Gets the value of the restrictedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getRestrictedPerson() {
        return restrictedPerson;
    }

    /**
     * Sets the value of the restrictedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setRestrictedPerson(PersonNameType value) {
        this.restrictedPerson = value;
    }

    /**
     * Gets the value of the relationshipToMemberCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getRelationshipToMemberCode() {
        return relationshipToMemberCode;
    }

    /**
     * Sets the value of the relationshipToMemberCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setRelationshipToMemberCode(CodeEntryInputType value) {
        this.relationshipToMemberCode = value;
    }

}
