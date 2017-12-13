//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 09:19:38 AM EST 
//


package com.healthedge.connector.schema.medicarehicn;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.healthedge.connector.schema.basetypes.ErrorsType;
import com.healthedge.connector.schema.basetypes.HealthRulesResourceType;
import com.healthedge.connector.schema.basetypes.ServiceStatusType;


/**
 * <p>Java class for MedicareHICNLookupResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicareHICNLookupResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.healthedge.com/connector/schema/basetypes}HealthRulesResourceType">
 *       &lt;sequence>
 *         &lt;element name="memberHccID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medicareHICNs" type="{http://www.healthedge.com/connector/schema/medicarehicn}MedicareHICNsType" minOccurs="0"/>
 *         &lt;group ref="{http://www.healthedge.com/connector/schema/basetypes}ErrorStatusGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicareHICNLookupResponseType", propOrder = {
    "memberHccID",
    "asOfDate",
    "medicareHICNs",
    "status",
    "errors"
})
public class MedicareHICNLookupResponseType
    extends HealthRulesResourceType
{

    protected String memberHccID;
    protected String asOfDate;
    protected MedicareHICNsType medicareHICNs;
    @XmlElement(required = true)
    protected ServiceStatusType status;
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
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsOfDate(String value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the medicareHICNs property.
     * 
     * @return
     *     possible object is
     *     {@link MedicareHICNsType }
     *     
     */
    public MedicareHICNsType getMedicareHICNs() {
        return medicareHICNs;
    }

    /**
     * Sets the value of the medicareHICNs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicareHICNsType }
     *     
     */
    public void setMedicareHICNs(MedicareHICNsType value) {
        this.medicareHICNs = value;
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

}
