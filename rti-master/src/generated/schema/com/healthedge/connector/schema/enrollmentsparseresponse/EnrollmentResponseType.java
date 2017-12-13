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
import javax.xml.bind.annotation.XmlType;
import com.healthedge.connector.schema.basetypes.ErrorsType;
import com.healthedge.connector.schema.basetypes.ServiceStatusType;
import com.healthedge.connector.schema.basetypes.TransactionInformationType;
import com.healthedge.connector.schema.cobpolicy.COBPolicyResponseType;
import com.healthedge.connector.schema.medicarehicn.MedicareHICNInfoResponseType;
import com.healthedge.connector.schema.memberfactors.MemberFactorsResponseType;
import com.healthedge.connector.schema.subsidy.SubscriptionSubsidyResponseType;


/**
 * <p>Java class for EnrollmentResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnrollmentResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionId" type="{http://www.healthedge.com/connector/schema/basetypes}String60Type" minOccurs="0"/>
 *         &lt;element name="subscriptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informationSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.healthedge.com/connector/schema/basetypes}ServiceStatusType" minOccurs="0"/>
 *         &lt;element name="enrollmentType" type="{http://www.healthedge.com/connector/schema/enrollmentsparseresponse}EnrollmentTransactionType" minOccurs="0"/>
 *         &lt;element name="accountChangeStatus" type="{http://www.healthedge.com/connector/schema/basetypes}ServiceStatusType" minOccurs="0"/>
 *         &lt;element name="binderPaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionInformation" type="{http://www.healthedge.com/connector/schema/basetypes}TransactionInformationType" minOccurs="0"/>
 *         &lt;element name="member" type="{http://www.healthedge.com/connector/schema/enrollmentsparseresponse}MemberResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reportingCategory" type="{http://www.healthedge.com/connector/schema/enrollmentsparseresponse}ReportingCategoryResponseType" minOccurs="0"/>
 *         &lt;element name="errors" type="{http://www.healthedge.com/connector/schema/basetypes}ErrorsType" minOccurs="0"/>
 *         &lt;element name="subsidyResponse" type="{http://www.healthedge.com/connector/schema/subsidy}SubscriptionSubsidyResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cobPolicyResponse" type="{http://www.healthedge.com/connector/schema/cobpolicy}COBPolicyResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="medicareHICNResponse" type="{http://www.healthedge.com/connector/schema/medicarehicn}MedicareHICNInfoResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="memberFactorsResponse" type="{http://www.healthedge.com/connector/schema/memberfactors}MemberFactorsResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnrollmentResponseType", propOrder = {
    "transactionId",
    "subscriptionId",
    "subscriberId",
    "informationSource",
    "status",
    "enrollmentType",
    "accountChangeStatus",
    "binderPaymentStatus",
    "transactionInformation",
    "member",
    "reportingCategory",
    "errors",
    "subsidyResponse",
    "cobPolicyResponse",
    "medicareHICNResponse",
    "memberFactorsResponse"
})
public class EnrollmentResponseType {

    protected String transactionId;
    protected String subscriptionId;
    protected String subscriberId;
    protected String informationSource;
    protected ServiceStatusType status;
    protected EnrollmentTransactionType enrollmentType;
    protected ServiceStatusType accountChangeStatus;
    protected String binderPaymentStatus;
    protected TransactionInformationType transactionInformation;
    protected List<MemberResponseType> member;
    protected ReportingCategoryResponseType reportingCategory;
    protected ErrorsType errors;
    protected List<SubscriptionSubsidyResponseType> subsidyResponse;
    protected List<COBPolicyResponseType> cobPolicyResponse;
    protected List<MedicareHICNInfoResponseType> medicareHICNResponse;
    protected List<MemberFactorsResponseType> memberFactorsResponse;

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the subscriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Sets the value of the subscriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionId(String value) {
        this.subscriptionId = value;
    }

    /**
     * Gets the value of the subscriberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

    /**
     * Gets the value of the informationSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationSource() {
        return informationSource;
    }

    /**
     * Sets the value of the informationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationSource(String value) {
        this.informationSource = value;
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
     * Gets the value of the enrollmentType property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentTransactionType }
     *     
     */
    public EnrollmentTransactionType getEnrollmentType() {
        return enrollmentType;
    }

    /**
     * Sets the value of the enrollmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentTransactionType }
     *     
     */
    public void setEnrollmentType(EnrollmentTransactionType value) {
        this.enrollmentType = value;
    }

    /**
     * Gets the value of the accountChangeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatusType }
     *     
     */
    public ServiceStatusType getAccountChangeStatus() {
        return accountChangeStatus;
    }

    /**
     * Sets the value of the accountChangeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatusType }
     *     
     */
    public void setAccountChangeStatus(ServiceStatusType value) {
        this.accountChangeStatus = value;
    }

    /**
     * Gets the value of the binderPaymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinderPaymentStatus() {
        return binderPaymentStatus;
    }

    /**
     * Sets the value of the binderPaymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinderPaymentStatus(String value) {
        this.binderPaymentStatus = value;
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
     * Gets the value of the member property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the member property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberResponseType }
     * 
     * 
     */
    public List<MemberResponseType> getMember() {
        if (member == null) {
            member = new ArrayList<MemberResponseType>();
        }
        return this.member;
    }

    /**
     * Gets the value of the reportingCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingCategoryResponseType }
     *     
     */
    public ReportingCategoryResponseType getReportingCategory() {
        return reportingCategory;
    }

    /**
     * Sets the value of the reportingCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingCategoryResponseType }
     *     
     */
    public void setReportingCategory(ReportingCategoryResponseType value) {
        this.reportingCategory = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorsType }
     *     
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorsType }
     *     
     */
    public void setErrors(ErrorsType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the subsidyResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsidyResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsidyResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionSubsidyResponseType }
     * 
     * 
     */
    public List<SubscriptionSubsidyResponseType> getSubsidyResponse() {
        if (subsidyResponse == null) {
            subsidyResponse = new ArrayList<SubscriptionSubsidyResponseType>();
        }
        return this.subsidyResponse;
    }

    /**
     * Gets the value of the cobPolicyResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cobPolicyResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCobPolicyResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COBPolicyResponseType }
     * 
     * 
     */
    public List<COBPolicyResponseType> getCobPolicyResponse() {
        if (cobPolicyResponse == null) {
            cobPolicyResponse = new ArrayList<COBPolicyResponseType>();
        }
        return this.cobPolicyResponse;
    }

    /**
     * Gets the value of the medicareHICNResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicareHICNResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicareHICNResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicareHICNInfoResponseType }
     * 
     * 
     */
    public List<MedicareHICNInfoResponseType> getMedicareHICNResponse() {
        if (medicareHICNResponse == null) {
            medicareHICNResponse = new ArrayList<MedicareHICNInfoResponseType>();
        }
        return this.medicareHICNResponse;
    }

    /**
     * Gets the value of the memberFactorsResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberFactorsResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberFactorsResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberFactorsResponseType }
     * 
     * 
     */
    public List<MemberFactorsResponseType> getMemberFactorsResponse() {
        if (memberFactorsResponse == null) {
            memberFactorsResponse = new ArrayList<MemberFactorsResponseType>();
        }
        return this.memberFactorsResponse;
    }

}