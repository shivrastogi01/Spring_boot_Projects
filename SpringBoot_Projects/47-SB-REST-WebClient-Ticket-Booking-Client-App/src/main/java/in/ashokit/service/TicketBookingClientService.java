package in.ashokit.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.request.PassengerRequest;
import in.ashokit.response.TicketResponse;

@Service
public class TicketBookingClientService {

	public void invokeTicketBookingApi() {

		String endpointUrl = "http://localhost:9090/bookTicket";

		PassengerRequest requestData = new PassengerRequest("Ashok", "Kumar", "Hyd", "Bang", "20-Oct-2021");
		
		WebClient webClient = WebClient.create();
							
		TicketResponse responseData =   webClient.post()
												 .uri(endpointUrl)
												 .body(BodyInserters.fromValue(requestData))
												 .accept(MediaType.APPLICATION_JSON)
												 .retrieve()
												 .bodyToMono(TicketResponse.class)
												 .block();
		System.out.println(responseData);
	}
}
