//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 09:19:38 AM EST 
//


package com.healthedge.connector.schema.enrollmentsparseresponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.healthedge.connector.schema.basetypes.ServiceStatusType;
import com.healthedge.connector.schema.basetypes.TransactionInformationType;


/**
 * <p>Java class for MemberResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="memberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maintenanceOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maintenanceOverrideResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endorsementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.healthedge.com/connector/schema/basetypes}ServiceStatusType" minOccurs="0"/>
 *         &lt;element name="planSelection" type="{http://www.healthedge.com/connector/schema/enrollmentsparseresponse}PlanSelectionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="providerSelection" type="{http://www.healthedge.com/connector/schema/enrollmentsparseresponse}ProviderSelectionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transactionInformation" type="{http://www.healthedge.com/connector/schema/basetypes}TransactionInformationType" minOccurs="0"/>
 *         &lt;element name="memberInputID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberResponseType", propOrder = {
    "memberId",
    "maintenanceOverride",
    "maintenanceOverrideResult",
    "lastName",
    "firstName",
    "dob",
    "endorsementDate",
    "status",
    "planSelection",
    "providerSelection",
    "transactionInformation",
    "memberInputID"
})
public class MemberResponseType {

    protected String memberId;
    @XmlElement(defaultValue = "true")
    protected Boolean maintenanceOverride;
    protected String maintenanceOverrideResult;
    protected String lastName;
    protected String firstName;
    protected String dob;
    protected String endorsementDate;
    protected ServiceStatusType status;
    protected List<PlanSelectionType> planSelection;
    protected List<ProviderSelectionType> providerSelection;
    protected TransactionInformationType transactionInformation;
    protected String memberInputID;

    /**
     * Gets the value of the memberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * Sets the value of the memberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberId(String value) {
        this.memberId = value;
    }

    /**
     * Gets the value of the maintenanceOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaintenanceOverride() {
        return maintenanceOverride;
    }

    /**
     * Sets the value of the maintenanceOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaintenanceOverride(Boolean value) {
        this.maintenanceOverride = value;
    }

    /**
     * Gets the value of the maintenanceOverrideResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintenanceOverrideResult() {
        return maintenanceOverrideResult;
    }

    /**
     * Sets the value of the maintenanceOverrideResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintenanceOverrideResult(String value) {
        this.maintenanceOverrideResult = value;
    }

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
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDob(String value) {
        this.dob = value;
    }

    /**
     * Gets the value of the endorsementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsementDate() {
        return endorsementDate;
    }

    /**
     * Sets the value of the endorsementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsementDate(String value) {
        this.endorsementDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatusType }
     *     
     */
    public ServiceStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatusType }
     *     
     */
    public void setStatus(ServiceStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the planSelection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planSelection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanSelectionType }
     * 
     * 
     */
    public List<PlanSelectionType> getPlanSelection() {
        if (planSelection == null) {
            planSelection = new ArrayList<PlanSelectionType>();
        }
        return this.planSelection;
    }

    /**
     * Gets the value of the providerSelection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerSelection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderSelectionType }
     * 
     * 
     */
    public List<ProviderSelectionType> getProviderSelection() {
        if (providerSelection == null) {
            providerSelection = new ArrayList<ProviderSelectionType>();
        }
        return this.providerSelection;
    }

    /**
     * Gets the value of the transactionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInformationType }
     *     
     */
    public TransactionInformationType getTransactionInformation() {
        return transactionInformation;
    }

    /**
     * Sets the value of the transactionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInformationType }
     *     
     */
    public void setTransactionInformation(TransactionInformationType value) {
        this.transactionInformation = value;
    }

    /**
     * Gets the value of the memberInputID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberInputID() {
        return memberInputID;
    }

    /**
     * Sets the value of the memberInputID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberInputID(String value) {
        this.memberInputID = value;
    }

}
