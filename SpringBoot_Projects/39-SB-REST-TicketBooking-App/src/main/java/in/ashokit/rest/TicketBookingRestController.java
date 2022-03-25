package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;
import in.ashokit.service.TicketBookingService;

@RestController
public class TicketBookingRestController {

	@Autowired
	private TicketBookingService service;

	@PostMapping(
			value = "/bookTicket",
			consumes = {"application/json", "application/xml" },
			produces = {"application/json", "application/xml" }
	)
	public ResponseEntity<Ticket> book(@RequestBody Passenger passenger) {
		Ticket ticket = service.bookTicket(passenger);
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}
}
