
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
 *         &lt;element name="passengerProfileDeleteRequest" type="{http://www.example.org/passengerProfile/}passengerProfileDeleteRequestType"/>
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
    "passengerProfileDeleteRequest"
})
@XmlRootElement(name = "deletePassengerProfile")
public class DeletePassengerProfile {

    @XmlElement(required = true)
    protected PassengerProfileDeleteRequestType passengerProfileDeleteRequest;

    /**
     * Gets the value of the passengerProfileDeleteRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerProfileDeleteRequestType }
     *     
     */
    public PassengerProfileDeleteRequestType getPassengerProfileDeleteRequest() {
        return passengerProfileDeleteRequest;
    }

    /**
     * Sets the value of the passengerProfileDeleteRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerProfileDeleteRequestType }
     *     
     */
    public void setPassengerProfileDeleteRequest(PassengerProfileDeleteRequestType value) {
        this.passengerProfileDeleteRequest = value;
    }

}
