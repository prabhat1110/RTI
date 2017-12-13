//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 09:19:38 AM EST 
//


package com.healthedge.connector.schema.memberfactors;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.healthedge.connector.schema.basetypes.HealthRulesResourceType;
import com.healthedge.connector.schema.matchinput.MemberMatchInputType;


/**
 * <p>Java class for MemberFactorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberFactorsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.healthedge.com/connector/schema/basetypes}HealthRulesResourceType">
 *       &lt;group ref="{http://www.healthedge.com/connector/schema/memberfactors}MemberFactorsGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberFactorsType", propOrder = {
    "membershipIdentifier",
    "memberMatchData",
    "memberFactorCore"
})
public class MemberFactorsType
    extends HealthRulesResourceType
{

    protected Long membershipIdentifier;
    protected MemberMatchInputType memberMatchData;
    protected MemberFactorsCoreType memberFactorCore;

    /**
     * Gets the value of the membershipIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMembershipIdentifier() {
        return membershipIdentifier;
    }

    /**
     * Sets the value of the membershipIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMembershipIdentifier(Long value) {
        this.membershipIdentifier = value;
    }

    /**
     * Gets the value of the memberMatchData property.
     * 
     * @return
     *     possible object is
     *     {@link MemberMatchInputType }
     *     
     */
    public MemberMatchInputType getMemberMatchData() {
        return memberMatchData;
    }

    /**
     * Sets the value of the memberMatchData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberMatchInputType }
     *     
     */
    public void setMemberMatchData(MemberMatchInputType value) {
        this.memberMatchData = value;
    }

    /**
     * Gets the value of the memberFactorCore property.
     * 
     * @return
     *     possible object is
     *     {@link MemberFactorsCoreType }
     *     
     */
    public MemberFactorsCoreType getMemberFactorCore() {
        return memberFactorCore;
    }

    /**
     * Sets the value of the memberFactorCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberFactorsCoreType }
     *     
     */
    public void setMemberFactorCore(MemberFactorsCoreType value) {
        this.memberFactorCore = value;
    }

}
