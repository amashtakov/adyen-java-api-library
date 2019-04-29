
package com.adyen.model.nexo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationSupportType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentificationSupportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoCard"/>
 *     &lt;enumeration value="LoyaltyCard"/>
 *     &lt;enumeration value="HybridCard"/>
 *     &lt;enumeration value="LinkedCard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "IdentificationSupportType")
@XmlEnum
public enum IdentificationSupportType {


    /**
     * The identification is not found on a card
     *
     */
    @XmlEnumValue("NoCard")
    NO_CARD("NoCard"),

    /**
     * The identification is on a card dedicated to this loyalty brand.
     *
     */
    @XmlEnumValue("LoyaltyCard")
    LOYALTY_CARD("LoyaltyCard"),

    /**
     * The identification is on a card which might be used both for the loyalty and the payment.
     *
     */
    @XmlEnumValue("HybridCard")
    HYBRID_CARD("HybridCard"),

    /**
     * The loyalty account is implicitly attached to the payment card. This is usually detected by the loyalty Acquirer.
     *
     */
    @XmlEnumValue("LinkedCard")
    LINKED_CARD("LinkedCard");
    private final String value;

    IdentificationSupportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdentificationSupportType fromValue(String v) {
        for (IdentificationSupportType c: IdentificationSupportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}