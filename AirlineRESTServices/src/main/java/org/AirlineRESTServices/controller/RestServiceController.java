package org.AirlineRESTServices.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import trng.imcs.restwebservices.beans.passengerInformation;
import trng.imcs.restwebservices.services.passengerService;

@RestController
@RequestMapping("/passenger")
public class RestServiceController {

	@Autowired
	PassengerService passengerService;

	@RequestMapping(value = "/{passengerID}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_HTML_VALUE })
	public ResponseEntity<?> getEmployee(@PathVariable String passengerID) {

		PassengerProfile passengerInfo = passengerService.getpassengerInfo(Integer.parseInt(passengerID));
		if (passengerInfo == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(passengerInfo, HttpStatus.ACCEPTED);
		}
	}

	@RequestMapping(method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_HTML_VALUE })
	public ResponseEntity<?> createEmployee(@RequestBody PassengerProfile passengerInfo) {

		PassengerProfile newpassengerInfo = passengerService.savepassengerDetails(passengerInfo);
		return new ResponseEntity<>(newpassengerInfo, HttpStatus.CREATED);
	}

	
}
