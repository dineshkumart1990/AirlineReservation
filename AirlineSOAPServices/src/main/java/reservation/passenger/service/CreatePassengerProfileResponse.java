
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
 *         &lt;element name="passengerProfileCreateResponse" type="{http://www.example.org/passengerProfile/}passengerProfileCreateResponseType"/>
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
    "passengerProfileCreateResponse"
})
@XmlRootElement(name = "createPassengerProfileResponse")
public class CreatePassengerProfileResponse {

    @XmlElement(required = true)
    protected PassengerProfileCreateResponseType passengerProfileCreateResponse;

    /**
     * Gets the value of the passengerProfileCreateResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerProfileCreateResponseType }
     *     
     */
    public PassengerProfileCreateResponseType getPassengerProfileCreateResponse() {
        return passengerProfileCreateResponse;
    }

    /**
     * Sets the value of the passengerProfileCreateResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerProfileCreateResponseType }
     *     
     */
    public void setPassengerProfileCreateResponse(PassengerProfileCreateResponseType value) {
        this.passengerProfileCreateResponse = value;
    }

}
