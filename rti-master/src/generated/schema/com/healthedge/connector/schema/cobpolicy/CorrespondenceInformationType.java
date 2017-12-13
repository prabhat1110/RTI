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
import com.healthedge.connector.schema.basetypes.CodeEntryInputType;


/**
 * <p>Java class for CorrespondenceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrespondenceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/cobpolicy}CorrespondenceInformationGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrespondenceInformationType", propOrder = {
    "emailAddress",
    "addressInfo",
    "supplierCorrespondenceUsageCode",
    "supplierLocationCorrespondenceUsageCode",
    "accountCorrespondenceUsageCode"
})
public class CorrespondenceInformationType {

    protected String emailAddress;
    protected AddressInfoType addressInfo;
    protected CodeEntryInputType supplierCorrespondenceUsageCode;
    protected CodeEntryInputType supplierLocationCorrespondenceUsageCode;
    protected CodeEntryInputType accountCorrespondenceUsageCode;

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
     *     {@link AddressInfoType }
     *     
     */
    public AddressInfoType getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfoType }
     *     
     */
    public void setAddressInfo(AddressInfoType value) {
        this.addressInfo = value;
    }

    /**
     * Gets the value of the supplierCorrespondenceUsageCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getSupplierCorrespondenceUsageCode() {
        return supplierCorrespondenceUsageCode;
    }

    /**
     * Sets the value of the supplierCorrespondenceUsageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setSupplierCorrespondenceUsageCode(CodeEntryInputType value) {
        this.supplierCorrespondenceUsageCode = value;
    }

    /**
     * Gets the value of the supplierLocationCorrespondenceUsageCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getSupplierLocationCorrespondenceUsageCode() {
        return supplierLocationCorrespondenceUsageCode;
    }

    /**
     * Sets the value of the supplierLocationCorrespondenceUsageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setSupplierLocationCorrespondenceUsageCode(CodeEntryInputType value) {
        this.supplierLocationCorrespondenceUsageCode = value;
    }

    /**
     * Gets the value of the accountCorrespondenceUsageCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getAccountCorrespondenceUsageCode() {
        return accountCorrespondenceUsageCode;
    }

    /**
     * Sets the value of the accountCorrespondenceUsageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setAccountCorrespondenceUsageCode(CodeEntryInputType value) {
        this.accountCorrespondenceUsageCode = value;
    }

}
