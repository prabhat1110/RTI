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
 * <p>Java class for ContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.healthedge.com/connector/schema/basetypes}String60Type" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.healthedge.com/connector/schema/basetypes}EmailAddressValueType" minOccurs="0"/>
 *         &lt;element name="personName" type="{http://www.healthedge.com/connector/schema/basetypes}PersonNameType" minOccurs="0"/>
 *         &lt;element name="telephoneList" type="{http://www.healthedge.com/connector/schema/basetypes}TelephoneNumberListType" minOccurs="0"/>
 *         &lt;element name="usageTypeCode" type="{http://www.healthedge.com/connector/schema/basetypes}CodeEntryInputType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactType", propOrder = {
    "title",
    "emailAddress",
    "personName",
    "telephoneList",
    "usageTypeCode"
})
public class ContactType {

    protected String title;
    protected String emailAddress;
    protected PersonNameType personName;
    protected TelephoneNumberListType telephoneList;
    protected CodeEntryInputType usageTypeCode;

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
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the telephoneList property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumberListType }
     *     
     */
    public TelephoneNumberListType getTelephoneList() {
        return telephoneList;
    }

    /**
     * Sets the value of the telephoneList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumberListType }
     *     
     */
    public void setTelephoneList(TelephoneNumberListType value) {
        this.telephoneList = value;
    }

    /**
     * Gets the value of the usageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getUsageTypeCode() {
        return usageTypeCode;
    }

    /**
     * Sets the value of the usageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setUsageTypeCode(CodeEntryInputType value) {
        this.usageTypeCode = value;
    }

}