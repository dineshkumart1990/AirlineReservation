
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
 *         &lt;element name="passengerProfileDeleteResponse" type="{http://www.example.org/passengerProfile/}passengerProfileDeleteResponseType"/>
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
    "passengerProfileDeleteResponse"
})
@XmlRootElement(name = "deletePassengerProfileResponse")
public class DeletePassengerProfileResponse {

    @XmlElement(required = true)
    protected PassengerProfileDeleteResponseType passengerProfileDeleteResponse;

    /**
     * Gets the value of the passengerProfileDeleteResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerProfileDeleteResponseType }
     *     
     */
    public PassengerProfileDeleteResponseType getPassengerProfileDeleteResponse() {
        return passengerProfileDeleteResponse;
    }

    /**
     * Sets the value of the passengerProfileDeleteResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerProfileDeleteResponseType }
     *     
     */
    public void setPassengerProfileDeleteResponse(PassengerProfileDeleteResponseType value) {
        this.passengerProfileDeleteResponse = value;
    }

}
