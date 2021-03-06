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
 * <p>Java class for CorrespondenceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrespondenceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emailAddress" type="{http://www.healthedge.com/connector/schema/basetypes}EmailAddressValueType" minOccurs="0"/>
 *         &lt;element name="addressInformation" type="{http://www.healthedge.com/connector/schema/basetypes}CorrespondenceAddressInformationType" minOccurs="0"/>
 *         &lt;element name="contacts" type="{http://www.healthedge.com/connector/schema/basetypes}ContactListType" minOccurs="0"/>
 *         &lt;element name="correspondenceUsageTypeCode" type="{http://www.healthedge.com/connector/schema/basetypes}CodeEntryInputType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrespondenceInfoType", propOrder = {
    "emailAddress",
    "addressInformation",
    "contacts",
    "correspondenceUsageTypeCode"
})
public class CorrespondenceInfoType {

    protected String emailAddress;
    protected CorrespondenceAddressInformationType addressInformation;
    protected ContactListType contacts;
    protected CodeEntryInputType correspondenceUsageTypeCode;

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
     * Gets the value of the addressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CorrespondenceAddressInformationType }
     *     
     */
    public CorrespondenceAddressInformationType getAddressInformation() {
        return addressInformation;
    }

    /**
     * Sets the value of the addressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrespondenceAddressInformationType }
     *     
     */
    public void setAddressInformation(CorrespondenceAddressInformationType value) {
        this.addressInformation = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link ContactListType }
     *     
     */
    public ContactListType getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactListType }
     *     
     */
    public void setContacts(ContactListType value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the correspondenceUsageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getCorrespondenceUsageTypeCode() {
        return correspondenceUsageTypeCode;
    }

    /**
     * Sets the value of the correspondenceUsageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setCorrespondenceUsageTypeCode(CodeEntryInputType value) {
        this.correspondenceUsageTypeCode = value;
    }

}
