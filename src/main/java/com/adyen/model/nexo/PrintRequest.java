
package com.adyen.model.nexo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition: Content of the Print Request messageType. -- Usage: It conveys the data to print and the way to process the print. It contains the complete content to print.
 *
 * <p>Java class for PrintRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PrintRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrintOutput" type="{}PrintOutput"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintRequest", propOrder = {
    "printOutput"
})
public class PrintRequest {

    @XmlElement(name = "PrintOutput", required = true)
    protected PrintOutput printOutput;

    /**
     * Gets the value of the printOutput property.
     *
     * @return
     *     possible object is
     *     {@link PrintOutput }
     *
     */
    public PrintOutput getPrintOutput() {
        return printOutput;
    }

    /**
     * Sets the value of the printOutput property.
     *
     * @param value
     *     allowed object is
     *     {@link PrintOutput }
     *
     */
    public void setPrintOutput(PrintOutput value) {
        this.printOutput = value;
    }

}