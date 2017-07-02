
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
 *         &lt;element name="passengerProfileGetRequest" type="{http://www.example.org/passengerProfile/}passengerProfileGetRequestType"/>
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
    "passengerProfileGetRequest"
})
@XmlRootElement(name = "getPassengerProfile")
public class GetPassengerProfile {

    @XmlElement(required = true)
    protected PassengerProfileGetRequestType passengerProfileGetRequest;

    /**
     * Gets the value of the passengerProfileGetRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerProfileGetRequestType }
     *     
     */
    public PassengerProfileGetRequestType getPassengerProfileGetRequest() {
        return passengerProfileGetRequest;
    }

    /**
     * Sets the value of the passengerProfileGetRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerProfileGetRequestType }
     *     
     */
    public void setPassengerProfileGetRequest(PassengerProfileGetRequestType value) {
        this.passengerProfileGetRequest = value;
    }

}
