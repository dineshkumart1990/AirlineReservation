package reservation.passenger.service;

public class PassengerProfileTypeImpl implements PassengerProfileType {

	public PassengerProfileCreateResponseType createPassengerProfile(
			PassengerProfileCreateRequestType passengerProfileCreateRequest) {
		PassengerProfileCreateRequestType value = new PassengerProfileCreateRequestType();
		value.setProfileId("1001");
		value.setFirstName("Dinesh");
		value.setLastName("Kumar");
		value.setAddress("TX");
		value.setEmailId("dinesh@gmail.com");
		value.setTelephoneNo("9842752121");
		PassengerProfileCreateResponseType  createPassenger = new PassengerProfileCreateResponseType();
		createPassenger.getProfileId();
		createPassenger.getFirstName();
		return createPassenger;
	}

	public PassengerProfileGetResponseType getPassengerProfile(
			PassengerProfileGetRequestType passengerProfileGetRequest) {
		PassengerProfileGetResponseType response = new PassengerProfileGetResponseType();
		response.getProfileId();
		response.getFirstName();
		response.getLastName();
		response.getEmailId();
		response.getTelephoneNo();
		response.getAddress();
		return response;
	}

	public PassengerProfileUpdateResponseType updatePassengerProfile(
			PassengerProfileUpdateRequestType passengerProfileUpdateRequest) {
		
		return null;
	}

	public PassengerProfileDeleteResponseType deletePassengerProfile(
			PassengerProfileDeleteRequestType passengerProfileDeleteRequest) {
		
		return null;
	}

}
