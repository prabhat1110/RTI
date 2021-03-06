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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.healthedge.connector.schema.basetypes.CodeEntryInputType;
import com.healthedge.connector.schema.basetypes.ReferenceType;


/**
 * <p>Java class for MembershipDateRangesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MembershipDateRangesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/enrollmenttypes}MembershipDateRangesGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MembershipDateRangesType", propOrder = {
    "startDate",
    "endDate",
    "coverage",
    "claimHistoryFromOtherPlans",
    "status",
    "enrollmentInfoGroup",
    "benefitNetworkReference",
    "memberTerminateReasonCode"
})
public class MembershipDateRangesType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true)
    protected String coverage;
    @XmlElement(required = true)
    protected String claimHistoryFromOtherPlans;
    @XmlElement(required = true)
    protected PlanSelectionStatus status;
    @XmlElement(name = "EnrollmentInfoGroup")
    protected EnrollmentInformationType enrollmentInfoGroup;
    protected List<ReferenceType> benefitNetworkReference;
    protected CodeEntryInputType memberTerminateReasonCode;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverage() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverage(String value) {
        this.coverage = value;
    }

    /**
     * Gets the value of the claimHistoryFromOtherPlans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimHistoryFromOtherPlans() {
        return claimHistoryFromOtherPlans;
    }

    /**
     * Sets the value of the claimHistoryFromOtherPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimHistoryFromOtherPlans(String value) {
        this.claimHistoryFromOtherPlans = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PlanSelectionStatus }
     *     
     */
    public PlanSelectionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanSelectionStatus }
     *     
     */
    public void setStatus(PlanSelectionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the enrollmentInfoGroup property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentInformationType }
     *     
     */
    public EnrollmentInformationType getEnrollmentInfoGroup() {
        return enrollmentInfoGroup;
    }

    /**
     * Sets the value of the enrollmentInfoGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentInformationType }
     *     
     */
    public void setEnrollmentInfoGroup(EnrollmentInformationType value) {
        this.enrollmentInfoGroup = value;
    }

    /**
     * Gets the value of the benefitNetworkReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the benefitNetworkReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBenefitNetworkReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getBenefitNetworkReference() {
        if (benefitNetworkReference == null) {
            benefitNetworkReference = new ArrayList<ReferenceType>();
        }
        return this.benefitNetworkReference;
    }

    /**
     * Gets the value of the memberTerminateReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeEntryInputType }
     *     
     */
    public CodeEntryInputType getMemberTerminateReasonCode() {
        return memberTerminateReasonCode;
    }

    /**
     * Sets the value of the memberTerminateReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeEntryInputType }
     *     
     */
    public void setMemberTerminateReasonCode(CodeEntryInputType value) {
        this.memberTerminateReasonCode = value;
    }

}
