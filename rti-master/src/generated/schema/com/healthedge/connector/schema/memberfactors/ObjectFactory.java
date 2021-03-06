//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 09:19:38 AM EST 
//


package com.healthedge.connector.schema.memberfactors;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.healthedge.connector.schema.memberfactors package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MemberFactorsResponse_QNAME = new QName("http://www.healthedge.com/connector/schema/memberfactors", "memberFactorsResponse");
    private final static QName _MemberFactors_QNAME = new QName("http://www.healthedge.com/connector/schema/memberfactors", "memberFactors");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.healthedge.connector.schema.memberfactors
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MemberFactorsType }
     * 
     */
    public MemberFactorsType createMemberFactorsType() {
        return new MemberFactorsType();
    }

    /**
     * Create an instance of {@link MemberFactorsResponseType }
     * 
     */
    public MemberFactorsResponseType createMemberFactorsResponseType() {
        return new MemberFactorsResponseType();
    }

    /**
     * Create an instance of {@link MemberFactorSetType }
     * 
     */
    public MemberFactorSetType createMemberFactorSetType() {
        return new MemberFactorSetType();
    }

    /**
     * Create an instance of {@link MemberFactorDateRangeType }
     * 
     */
    public MemberFactorDateRangeType createMemberFactorDateRangeType() {
        return new MemberFactorDateRangeType();
    }

    /**
     * Create an instance of {@link MemberFactorsCoreType }
     * 
     */
    public MemberFactorsCoreType createMemberFactorsCoreType() {
        return new MemberFactorsCoreType();
    }

    /**
     * Create an instance of {@link MemberFactorType }
     * 
     */
    public MemberFactorType createMemberFactorType() {
        return new MemberFactorType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberFactorsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.healthedge.com/connector/schema/memberfactors", name = "memberFactorsResponse")
    public JAXBElement<MemberFactorsResponseType> createMemberFactorsResponse(MemberFactorsResponseType value) {
        return new JAXBElement<MemberFactorsResponseType>(_MemberFactorsResponse_QNAME, MemberFactorsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberFactorsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.healthedge.com/connector/schema/memberfactors", name = "memberFactors")
    public JAXBElement<MemberFactorsType> createMemberFactors(MemberFactorsType value) {
        return new JAXBElement<MemberFactorsType>(_MemberFactors_QNAME, MemberFactorsType.class, null, value);
    }

}
