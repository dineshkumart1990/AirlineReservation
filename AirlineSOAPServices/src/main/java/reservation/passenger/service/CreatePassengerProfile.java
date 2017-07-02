
package reservation.passenger.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="passengerProfileCreateRequest" type="{http://www.example.org/passengerProfile/}passengerProfileCreateRequestType"/>
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
    "passengerProfileCreateRequest"
})
@XmlRootElement(name = "createPassengerProfile")
public class CreatePassengerProfile {

    @XmlElement(required = true)
    protected PassengerProfileCreateRequestType passengerProfileCreateRequest;

    /**
     * Gets the value of the passengerProfileCreateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerProfileCreateRequestType }
     *     
     */
    public PassengerProfileCreateRequestType getPassengerProfileCreateRequest() {
        return passengerProfileCreateRequest;
    }

    /**
     * Sets the value of the passengerProfileCreateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerProfileCreateRequestType }
     *     
     */
    public void setPassengerProfileCreateRequest(PassengerProfileCreateRequestType value) {
        this.passengerProfileCreateRequest = value;
    }

}
