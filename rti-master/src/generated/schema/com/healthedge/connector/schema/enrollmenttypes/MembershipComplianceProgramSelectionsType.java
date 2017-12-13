//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 09:19:38 AM EST 
//


package com.healthedge.connector.schema.enrollmenttypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.healthedge.connector.schema.basetypes.ReferenceType;


/**
 * <p>Java class for MembershipComplianceProgramSelectionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MembershipComplianceProgramSelectionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/enrollmenttypes}MembershipComplianceProgramSelectionsGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MembershipComplianceProgramSelectionsType", propOrder = {
    "membershipDateRangesGroup",
    "membershipInactiveDataRangesGroup",
    "complianceProgramReference"
})
public class MembershipComplianceProgramSelectionsType {

    @XmlElement(name = "MembershipDateRangesGroup")
    protected List<DateRangesType> membershipDateRangesGroup;
    @XmlElement(name = "MembershipInactiveDataRangesGroup")
    protected List<InactiveDateRangesType> membershipInactiveDataRangesGroup;
    protected ReferenceType complianceProgramReference;

    /**
     * Gets the value of the membershipDateRangesGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membershipDateRangesGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembershipDateRangesGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateRangesType }
     * 
     * 
     */
    public List<DateRangesType> getMembershipDateRangesGroup() {
        if (membershipDateRangesGroup == null) {
            membershipDateRangesGroup = new ArrayList<DateRangesType>();
        }
        return this.membershipDateRangesGroup;
    }

    /**
     * Gets the value of the membershipInactiveDataRangesGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membershipInactiveDataRangesGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembershipInactiveDataRangesGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InactiveDateRangesType }
     * 
     * 
     */
    public List<InactiveDateRangesType> getMembershipInactiveDataRangesGroup() {
        if (membershipInactiveDataRangesGroup == null) {
            membershipInactiveDataRangesGroup = new ArrayList<InactiveDateRangesType>();
        }
        return this.membershipInactiveDataRangesGroup;
    }

    /**
     * Gets the value of the complianceProgramReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getComplianceProgramReference() {
        return complianceProgramReference;
    }

    /**
     * Sets the value of the complianceProgramReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setComplianceProgramReference(ReferenceType value) {
        this.complianceProgramReference = value;
    }

}