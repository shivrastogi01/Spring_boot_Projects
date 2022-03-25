package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;

@Service
public class TicketBookingService {

	public Ticket bookTicket(Passenger passenger) {
		System.out.println(passenger);
		// logic to book ticket

		Ticket t = new Ticket();
		t.setPnr("977997979");
		t.setTicketStatus("CONFIRMED");
		t.setTicketPrice("780.00 INR");

		return t;
	}
}
