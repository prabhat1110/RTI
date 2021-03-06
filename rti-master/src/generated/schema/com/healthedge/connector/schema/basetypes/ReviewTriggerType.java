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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReviewTriggerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviewTriggerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/basetypes}ReviewTriggerGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviewTriggerType", propOrder = {
    "creationDate",
    "isApproved",
    "doNotPreserveReviewDecision",
    "reviewMessageCode",
    "elementPathGroup"
})
public class ReviewTriggerType {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected Boolean isApproved;
    protected Boolean doNotPreserveReviewDecision;
    @XmlElement(required = true)
    protected MessageCodeType reviewMessageCode;
    @XmlElement(name = "elementLocatorText")
    protected List<String> elementPathGroup;

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the isApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsApproved() {
        return isApproved;
    }

    /**
     * Sets the value of the isApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsApproved(Boolean value) {
        this.isApproved = value;
    }

    /**
     * Gets the value of the doNotPreserveReviewDecision property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoNotPreserveReviewDecision() {
        return doNotPreserveReviewDecision;
    }

    /**
     * Sets the value of the doNotPreserveReviewDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoNotPreserveReviewDecision(Boolean value) {
        this.doNotPreserveReviewDecision = value;
    }

    /**
     * Gets the value of the reviewMessageCode property.
     * 
     * @return
     *     possible object is
     *     {@link MessageCodeType }
     *     
     */
    public MessageCodeType getReviewMessageCode() {
        return reviewMessageCode;
    }

    /**
     * Sets the value of the reviewMessageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageCodeType }
     *     
     */
    public void setReviewMessageCode(MessageCodeType value) {
        this.reviewMessageCode = value;
    }

    /**
     * Gets the value of the elementPathGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementPathGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementPathGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getElementPathGroup() {
        if (elementPathGroup == null) {
            elementPathGroup = new ArrayList<String>();
        }
        return this.elementPathGroup;
    }

}
