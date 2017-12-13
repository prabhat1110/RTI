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
 * <p>Java class for PlanSelectionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanSelectionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/enrollmenttypes}PlanSelectionsGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanSelectionsType", propOrder = {
    "dateRangesGroup",
    "inactiveDataRangesGroup",
    "benefitPlanReference"
})
public class PlanSelectionsType {

    @XmlElement(name = "DateRangesGroup")
    protected List<DateRangesType> dateRangesGroup;
    @XmlElement(name = "InactiveDataRangesGroup")
    protected List<InactiveDateRangesType> inactiveDataRangesGroup;
    protected ReferenceType benefitPlanReference;

    /**
     * Gets the value of the dateRangesGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateRangesGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateRangesGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateRangesType }
     * 
     * 
     */
    public List<DateRangesType> getDateRangesGroup() {
        if (dateRangesGroup == null) {
            dateRangesGroup = new ArrayList<DateRangesType>();
        }
        return this.dateRangesGroup;
    }

    /**
     * Gets the value of the inactiveDataRangesGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inactiveDataRangesGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInactiveDataRangesGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InactiveDateRangesType }
     * 
     * 
     */
    public List<InactiveDateRangesType> getInactiveDataRangesGroup() {
        if (inactiveDataRangesGroup == null) {
            inactiveDataRangesGroup = new ArrayList<InactiveDateRangesType>();
        }
        return this.inactiveDataRangesGroup;
    }

    /**
     * Gets the value of the benefitPlanReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getBenefitPlanReference() {
        return benefitPlanReference;
    }

    /**
     * Sets the value of the benefitPlanReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setBenefitPlanReference(ReferenceType value) {
        this.benefitPlanReference = value;
    }

}
