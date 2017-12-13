//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.28 at 09:19:38 AM EST 
//


package com.healthedge.connector.schema.basetypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PHIAuthorizationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PHIAuthorizationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Use"/>
 *     &lt;enumeration value="Disclose"/>
 *     &lt;enumeration value="Use and Disclose"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PHIAuthorizationType")
@XmlEnum
public enum PHIAuthorizationType {

    @XmlEnumValue("Use")
    USE("Use"),
    @XmlEnumValue("Disclose")
    DISCLOSE("Disclose"),
    @XmlEnumValue("Use and Disclose")
    USE_AND_DISCLOSE("Use and Disclose");
    private final String value;

    PHIAuthorizationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PHIAuthorizationType fromValue(String v) {
        for (PHIAuthorizationType c: PHIAuthorizationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
