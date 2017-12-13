//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 09:19:38 AM EST 
//


package com.healthedge.connector.schema.basetypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CredentialSuffixList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CredentialSuffixList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listMode" type="{http://www.healthedge.com/connector/schema/basetypes}ListActionType" minOccurs="0"/>
 *         &lt;element name="CredentialSuffix" type="{http://www.healthedge.com/connector/schema/basetypes}CodeEntryInputType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialSuffixList", propOrder = {
    "listMode",
    "credentialSuffix"
})
public class CredentialSuffixList {

    protected ListActionType listMode;
    @XmlElement(name = "CredentialSuffix")
    protected List<CodeEntryInputType> credentialSuffix;

    /**
     * Gets the value of the listMode property.
     * 
     * @return
     *     possible object is
     *     {@link ListActionType }
     *     
     */
    public ListActionType getListMode() {
        return listMode;
    }

    /**
     * Sets the value of the listMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListActionType }
     *     
     */
    public void setListMode(ListActionType value) {
        this.listMode = value;
    }

    /**
     * Gets the value of the credentialSuffix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the credentialSuffix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCredentialSuffix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeEntryInputType }
     * 
     * 
     */
    public List<CodeEntryInputType> getCredentialSuffix() {
        if (credentialSuffix == null) {
            credentialSuffix = new ArrayList<CodeEntryInputType>();
        }
        return this.credentialSuffix;
    }

}
