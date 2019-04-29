
package com.adyen.model.nexo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageClassType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Device"/>
 *     &lt;enumeration value="Event"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "MessageClassType")
@XmlEnum
public enum MessageClassType {


    /**
     * A transaction messageType pair initiated by the Sale System, and requested to the POI System.
     *
     */
    @XmlEnumValue("Service")
    SERVICE("Service"),

    /**
     * A device messageType pair either: Inside a Service request and response. This device messageType pair is initiated by the POI System, and sent to Sale System,
     *
     */
    @XmlEnumValue("Device")
    DEVICE("Device"),

    /**
     * An unsolicited event notification by the POI System to the Sale System.
     *
     */
    @XmlEnumValue("Event")
    EVENT("Event");
    private final String value;

    MessageClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageClassType fromValue(String v) {
        for (MessageClassType c: MessageClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}