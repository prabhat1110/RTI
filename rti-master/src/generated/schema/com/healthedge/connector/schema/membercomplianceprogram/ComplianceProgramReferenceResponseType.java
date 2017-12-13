//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 09:19:38 AM EST 
//


package com.healthedge.connector.schema.membercomplianceprogram;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.healthedge.connector.schema.basetypes.ErrorsType;
import com.healthedge.connector.schema.basetypes.HealthRulesResourceType;
import com.healthedge.connector.schema.basetypes.ServiceStatusType;


/**
 * <p>Java class for ComplianceProgramReferenceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplianceProgramReferenceResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.healthedge.com/connector/schema/basetypes}HealthRulesResourceType">
 *       &lt;sequence>
 *         &lt;element name="complianceProgramReference" type="{http://www.healthedge.com/connector/schema/membercomplianceprogram}ComplianceProgramReferenceType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ComplianceProgramReferenceResponseType", propOrder = {
    "complianceProgramReference",
    "status",
    "errors"
})
public class ComplianceProgramReferenceResponseType
    extends HealthRulesResourceType
{

    protected List<ComplianceProgramReferenceType> complianceProgramReference;
    @XmlElement(required = true)
    protected ServiceStatusType status;
    protected ErrorsType errors;

    /**
     * Gets the value of the complianceProgramReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complianceProgramReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplianceProgramReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplianceProgramReferenceType }
     * 
     * 
     */
    public List<ComplianceProgramReferenceType> getComplianceProgramReference() {
        if (complianceProgramReference == null) {
            complianceProgramReference = new ArrayList<ComplianceProgramReferenceType>();
        }
        return this.complianceProgramReference;
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
