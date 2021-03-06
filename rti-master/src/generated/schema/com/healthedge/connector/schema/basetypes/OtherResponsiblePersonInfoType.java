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
 * <p>Java class for OtherResponsiblePersonInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherResponsiblePersonInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/basetypes}OtherResponsiblePersonInfoGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherResponsiblePersonInfoType", propOrder = {
    "sourceOfAuthorization",
    "responsiblePersonEmailAddress",
    "responsiblePersonName",
    "responsibleAddressInfo",
    "responsibilityTypeCodeCode",
    "relationshipToMemberCode"
})
public class OtherResponsiblePersonInfoType {

    protected SourceOfAuthorizationDomainType sourceOfAuthorization;
    protected String responsiblePersonEmailAddress;
    protected PersonNameType responsiblePersonName;
    protected OtherResponsiblePersonInfoType.ResponsibleAddressInfo responsibleAddressInfo;
    protected CodeEntryInputType responsibilityTypeCodeCode;
    protected CodeEntryInputType relationshipToMemberCode;

    /**
     * Gets the value of the sourceOfAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link SourceOfAuthorizationDomainType }
     *     
     */
    public SourceOfAuthorizationDomainType getSourceOfAuthorization() {
        return sourceOfAuthorization;
    }

    /**
     * Sets the value of the sourceOfAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceOfAuthorizationDomainType }
     *     
     */
    public void setSourceOfAuthorization(SourceOfAuthorizationDomainType value) {
        this.sourceOfAuthorization = value;
    }

    /**
     * Gets the value of the responsiblePersonEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsiblePersonEmailAddress() {
        return responsiblePersonEmailAddress;
    }

    /**
     * Sets the value of the responsiblePersonEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsiblePersonEmailAddress(String value) {
        this.responsiblePersonEmailAddress = value;
    }

    /**
     * Gets the value of the responsiblePersonName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getResponsiblePersonName() {
        return responsiblePersonName;
    }

    /**
     * Sets the value of the responsiblePersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setResponsiblePersonName(PersonNameType value) {
        this.responsiblePersonName = value;
    }

    /**
     * Gets the value of the responsibleAddressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OtherResponsiblePersonInfoType.ResponsibleAddressInfo }
     *     
     */
    public OtherResponsiblePersonInfoType.ResponsibleAddressInfo getResponsibleAddressInfo() {
        return responsibleAddressInfo;
    }

    /**
     * Sets the value of the responsibleAddressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherResponsiblePersonInfoType.ResponsibleAddressInfo }
     *     
     */
    public void setResponsibleAddressInfo(OtherResponsiblePersonInfoType.ResponsibleAddressInfo value) {
        this.responsibleAddressInfo = value;
    }

    /**
     * Gets the value of the responsibilityTypeCodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getResponsibilityTypeCodeCode() {
        return responsibilityTypeCodeCode;
    }

    /**
     * Sets the value of the responsibilityTypeCodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setResponsibilityTypeCodeCode(CodeEntryInputType value) {
        this.responsibilityTypeCodeCode = value;
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
    public static class ResponsibleAddressInfo {

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
