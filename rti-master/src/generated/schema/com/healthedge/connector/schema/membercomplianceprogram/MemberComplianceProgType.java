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
import javax.xml.bind.annotation.XmlType;
import com.healthedge.connector.schema.basetypes.HealthRulesResourceType;


/**
 * <p>Java class for MemberComplianceProgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberComplianceProgType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.healthedge.com/connector/schema/basetypes}HealthRulesResourceType">
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/membercomplianceprogram}MembershipComplianceProgramSelectionsGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberComplianceProgType", propOrder = {
    "complianceProgramSelections"
})
public class MemberComplianceProgType
    extends HealthRulesResourceType
{

    protected MemberComplianceProgType.ComplianceProgramSelections complianceProgramSelections;

    /**
     * Gets the value of the complianceProgramSelections property.
     * 
     * @return
     *     possible object is
     *     {@link MemberComplianceProgType.ComplianceProgramSelections }
     *     
     */
    public MemberComplianceProgType.ComplianceProgramSelections getComplianceProgramSelections() {
        return complianceProgramSelections;
    }

    /**
     * Sets the value of the complianceProgramSelections property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberComplianceProgType.ComplianceProgramSelections }
     *     
     */
    public void setComplianceProgramSelections(MemberComplianceProgType.ComplianceProgramSelections value) {
        this.complianceProgramSelections = value;
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
     *         &lt;element name="updateMode" type="{http://www.healthedge.com/connector/schema/membercomplianceprogram}UpdateModeType" minOccurs="0"/>
     *         &lt;element name="complianceProgramSelection" type="{http://www.healthedge.com/connector/schema/membercomplianceprogram}ComplianceProgramSelectionType" maxOccurs="unbounded" minOccurs="0"/>
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
        "updateMode",
        "complianceProgramSelection"
    })
    public static class ComplianceProgramSelections {

        protected UpdateModeType updateMode;
        protected List<ComplianceProgramSelectionType> complianceProgramSelection;

        /**
         * Gets the value of the updateMode property.
         * 
         * @return
         *     possible object is
         *     {@link UpdateModeType }
         *     
         */
        public UpdateModeType getUpdateMode() {
            return updateMode;
        }

        /**
         * Sets the value of the updateMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpdateModeType }
         *     
         */
        public void setUpdateMode(UpdateModeType value) {
            this.updateMode = value;
        }

        /**
         * Gets the value of the complianceProgramSelection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the complianceProgramSelection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComplianceProgramSelection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ComplianceProgramSelectionType }
         * 
         * 
         */
        public List<ComplianceProgramSelectionType> getComplianceProgramSelection() {
            if (complianceProgramSelection == null) {
                complianceProgramSelection = new ArrayList<ComplianceProgramSelectionType>();
            }
            return this.complianceProgramSelection;
        }

    }

}
