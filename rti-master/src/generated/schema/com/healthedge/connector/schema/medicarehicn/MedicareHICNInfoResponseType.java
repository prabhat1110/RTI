//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 09:19:38 AM EST 
//


package com.healthedge.connector.schema.medicarehicn;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.healthedge.connector.schema.basetypes.CodeEntryInputType;
import com.healthedge.connector.schema.basetypes.ErrorsType;
import com.healthedge.connector.schema.basetypes.HealthRulesResourceType;
import com.healthedge.connector.schema.basetypes.ServiceStatusType;
import com.healthedge.connector.schema.basetypes.TransactionType;


/**
 * <p>Java class for MedicareHICNInfoResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicareHICNInfoResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.healthedge.com/connector/schema/basetypes}HealthRulesResourceType">
 *       &lt;sequence>
 *         &lt;element name="memberHccID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.healthedge.com/connector/schema/basetypes}ServiceStatusType"/>
 *         &lt;element name="medicareHICNInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hicn" type="{http://www.healthedge.com/connector/schema/basetypes}String50Type" minOccurs="0"/>
 *                   &lt;element name="transactionType" type="{http://www.healthedge.com/connector/schema/basetypes}TransactionType" minOccurs="0"/>
 *                   &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="medicareEligibilityReasonCode" type="{http://www.healthedge.com/connector/schema/basetypes}CodeEntryInputType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="errors" type="{http://www.healthedge.com/connector/schema/basetypes}ErrorsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicareHICNInfoResponseType", propOrder = {
    "memberHccID",
    "status",
    "medicareHICNInfo",
    "errors"
})
public class MedicareHICNInfoResponseType
    extends HealthRulesResourceType
{

    protected String memberHccID;
    @XmlElement(required = true)
    protected ServiceStatusType status;
    protected List<MedicareHICNInfoResponseType.MedicareHICNInfo> medicareHICNInfo;
    protected ErrorsType errors;

    /**
     * Gets the value of the memberHccID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberHccID() {
        return memberHccID;
    }

    /**
     * Sets the value of the memberHccID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberHccID(String value) {
        this.memberHccID = value;
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
     * Gets the value of the medicareHICNInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicareHICNInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicareHICNInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicareHICNInfoResponseType.MedicareHICNInfo }
     * 
     * 
     */
    public List<MedicareHICNInfoResponseType.MedicareHICNInfo> getMedicareHICNInfo() {
        if (medicareHICNInfo == null) {
            medicareHICNInfo = new ArrayList<MedicareHICNInfoResponseType.MedicareHICNInfo>();
        }
        return this.medicareHICNInfo;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="hicn" type="{http://www.healthedge.com/connector/schema/basetypes}String50Type" minOccurs="0"/>
     *         &lt;element name="transactionType" type="{http://www.healthedge.com/connector/schema/basetypes}TransactionType" minOccurs="0"/>
     *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="medicareEligibilityReasonCode" type="{http://www.healthedge.com/connector/schema/basetypes}CodeEntryInputType" minOccurs="0"/>
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
        "hicn",
        "transactionType",
        "effectiveDate",
        "expirationDate",
        "entryDate",
        "medicareEligibilityReasonCode"
    })
    public static class MedicareHICNInfo {

        protected String hicn;
        protected TransactionType transactionType;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expirationDate;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar entryDate;
        protected CodeEntryInputType medicareEligibilityReasonCode;

        /**
         * Gets the value of the hicn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHicn() {
            return hicn;
        }

        /**
         * Sets the value of the hicn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHicn(String value) {
            this.hicn = value;
        }

        /**
         * Gets the value of the transactionType property.
         * 
         * @return
         *     possible object is
         *     {@link TransactionType }
         *     
         */
        public TransactionType getTransactionType() {
            return transactionType;
        }

        /**
         * Sets the value of the transactionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransactionType }
         *     
         */
        public void setTransactionType(TransactionType value) {
            this.transactionType = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpirationDate() {
            return expirationDate;
        }

        /**
         * Sets the value of the expirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpirationDate(XMLGregorianCalendar value) {
            this.expirationDate = value;
        }

        /**
         * Gets the value of the entryDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEntryDate() {
            return entryDate;
        }

        /**
         * Sets the value of the entryDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEntryDate(XMLGregorianCalendar value) {
            this.entryDate = value;
        }

        /**
         * Gets the value of the medicareEligibilityReasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link CodeEntryInputType }
         *     
         */
        public CodeEntryInputType getMedicareEligibilityReasonCode() {
            return medicareEligibilityReasonCode;
        }

        /**
         * Sets the value of the medicareEligibilityReasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeEntryInputType }
         *     
         */
        public void setMedicareEligibilityReasonCode(CodeEntryInputType value) {
            this.medicareEligibilityReasonCode = value;
        }

    }

}