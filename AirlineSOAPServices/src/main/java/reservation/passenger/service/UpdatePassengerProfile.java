
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
 *         &lt;element name="passengerProfileUpdateRequest" type="{http://www.example.org/passengerProfile/}passengerProfileUpdateRequestType"/>
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
    "passengerProfileUpdateRequest"
})
@XmlRootElement(name = "updatePassengerProfile")
public class UpdatePassengerProfile {

    @XmlElement(required = true)
    protected PassengerProfileUpdateRequestType passengerProfileUpdateRequest;

    /**
     * Gets the value of the passengerProfileUpdateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerProfileUpdateRequestType }
     *     
     */
    public PassengerProfileUpdateRequestType getPassengerProfileUpdateRequest() {
        return passengerProfileUpdateRequest;
    }

    /**
     * Sets the value of the passengerProfileUpdateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerProfileUpdateRequestType }
     *     
     */
    public void setPassengerProfileUpdateRequest(PassengerProfileUpdateRequestType value) {
        this.passengerProfileUpdateRequest = value;
    }

}
