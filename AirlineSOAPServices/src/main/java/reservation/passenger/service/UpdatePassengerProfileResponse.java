
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
 *         &lt;element name="passengerProfileUpdateResponse" type="{http://www.example.org/passengerProfile/}passengerProfileUpdateResponseType"/>
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
    "passengerProfileUpdateResponse"
})
@XmlRootElement(name = "updatePassengerProfileResponse")
public class UpdatePassengerProfileResponse {

    @XmlElement(required = true)
    protected PassengerProfileUpdateResponseType passengerProfileUpdateResponse;

    /**
     * Gets the value of the passengerProfileUpdateResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerProfileUpdateResponseType }
     *     
     */
    public PassengerProfileUpdateResponseType getPassengerProfileUpdateResponse() {
        return passengerProfileUpdateResponse;
    }

    /**
     * Sets the value of the passengerProfileUpdateResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerProfileUpdateResponseType }
     *     
     */
    public void setPassengerProfileUpdateResponse(PassengerProfileUpdateResponseType value) {
        this.passengerProfileUpdateResponse = value;
    }

}
