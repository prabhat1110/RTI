//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 09:19:38 AM EST 
//


package com.healthedge.connector.schema.basetypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Common person name type
 * 
 * <p>Java class for PersonNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/basetypes}PersonNameGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType", propOrder = {
    "lastName",
    "firstName",
    "middleName",
    "namePrefix",
    "nameSuffix",
    "nameSuffixList",
    "credentialSuffixList"
})
public class PersonNameType {

    @XmlElement(required = true, nillable = true)
    protected String lastName;
    @XmlElementRef(name = "firstName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "middleName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middleName;
    @XmlElementRef(name = "namePrefix", type = JAXBElement.class, required = false)
    protected JAXBElement<String> namePrefix;
    @XmlElementRef(name = "nameSuffix", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nameSuffix;
    protected NameSuffixList nameSuffixList;
    protected CredentialSuffixList credentialSuffixList;

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddleName(JAXBElement<String> value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the namePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNamePrefix() {
        return namePrefix;
    }

    /**
     * Sets the value of the namePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNamePrefix(JAXBElement<String> value) {
        this.namePrefix = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameSuffix(JAXBElement<String> value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the nameSuffixList property.
     * 
     * @return
     *     possible object is
     *     {@link NameSuffixList }
     *     
     */
    public NameSuffixList getNameSuffixList() {
        return nameSuffixList;
    }

    /**
     * Sets the value of the nameSuffixList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameSuffixList }
     *     
     */
    public void setNameSuffixList(NameSuffixList value) {
        this.nameSuffixList = value;
    }

    /**
     * Gets the value of the credentialSuffixList property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialSuffixList }
     *     
     */
    public CredentialSuffixList getCredentialSuffixList() {
        return credentialSuffixList;
    }

    /**
     * Sets the value of the credentialSuffixList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialSuffixList }
     *     
     */
    public void setCredentialSuffixList(CredentialSuffixList value) {
        this.credentialSuffixList = value;
    }

}
