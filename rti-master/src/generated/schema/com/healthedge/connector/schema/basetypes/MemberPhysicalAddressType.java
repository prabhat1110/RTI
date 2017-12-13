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
 * <p>Java class for MemberPhysicalAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberPhysicalAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/basetypes}MemberPhysicalAddressGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberPhysicalAddressType", propOrder = {
    "emailAddress",
    "addressInfo",
    "addressTypeCode"
})
public class MemberPhysicalAddressType {

    protected String emailAddress;
    protected MemberPhysicalAddressType.AddressInfo addressInfo;
    protected CodeEntryInputType addressTypeCode;

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
     * Gets the value of the addressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MemberPhysicalAddressType.AddressInfo }
     *     
     */
    public MemberPhysicalAddressType.AddressInfo getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberPhysicalAddressType.AddressInfo }
     *     
     */
    public void setAddressInfo(MemberPhysicalAddressType.AddressInfo value) {
        this.addressInfo = value;
    }

    /**
     * Gets the value of the addressTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getAddressTypeCode() {
        return addressTypeCode;
    }

    /**
     * Sets the value of the addressTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setAddressTypeCode(CodeEntryInputType value) {
        this.addressTypeCode = value;
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
     *       &lt;sequence>
     *         &lt;element name="postalAddress" type="{http://www.healthedge.com/connector/schema/basetypes}PostalAddressType" minOccurs="0"/>
     *         &lt;element name="addressPhoneList" type="{http://www.healthedge.com/connector/schema/basetypes}TelephoneNumberListType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "postalAddress",
        "addressPhoneList"
    })
    public static class AddressInfo {

        protected PostalAddressType postalAddress;
        protected TelephoneNumberListType addressPhoneList;

        /**
         * Gets the value of the postalAddress property.
         * 
         * @return
         *     possible object is
         *     {@link PostalAddressType }
         *     
         */
        public PostalAddressType getPostalAddress() {
            return postalAddress;
        }

        /**
         * Sets the value of the postalAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link PostalAddressType }
         *     
         */
        public void setPostalAddress(PostalAddressType value) {
            this.postalAddress = value;
        }

        /**
         * Gets the value of the addressPhoneList property.
         * 
         * @return
         *     possible object is
         *     {@link TelephoneNumberListType }
         *     
         */
        public TelephoneNumberListType getAddressPhoneList() {
            return addressPhoneList;
        }

        /**
         * Sets the value of the addressPhoneList property.
         * 
         * @param value
         *     allowed object is
         *     {@link TelephoneNumberListType }
         *     
         */
        public void setAddressPhoneList(TelephoneNumberListType value) {
            this.addressPhoneList = value;
        }

    }

}