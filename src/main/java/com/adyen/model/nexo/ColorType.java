
package com.adyen.model.nexo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColorType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ColorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="White"/>
 *     &lt;enumeration value="Black"/>
 *     &lt;enumeration value="Red"/>
 *     &lt;enumeration value="Green"/>
 *     &lt;enumeration value="Blue"/>
 *     &lt;enumeration value="Yellow"/>
 *     &lt;enumeration value="Magenta"/>
 *     &lt;enumeration value="Cyan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ColorType")
@XmlEnum
public enum ColorType {

    @XmlEnumValue("White")
    WHITE("White"),
    @XmlEnumValue("Black")
    BLACK("Black"),
    @XmlEnumValue("Red")
    RED("Red"),
    @XmlEnumValue("Green")
    GREEN("Green"),
    @XmlEnumValue("Blue")
    BLUE("Blue"),
    @XmlEnumValue("Yellow")
    YELLOW("Yellow"),
    @XmlEnumValue("Magenta")
    MAGENTA("Magenta"),
    @XmlEnumValue("Cyan")
    CYAN("Cyan");
    private final String value;

    ColorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ColorType fromValue(String v) {
        for (ColorType c: ColorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}