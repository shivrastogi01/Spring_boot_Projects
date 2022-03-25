package in.ashokit.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.response.QuoteResponse;

@Service
public class QuoteService {

	public void getQuoteSync() {
		String url = "https://quoters.apps.pcfone.io/api/random";

		WebClient webClient = WebClient.create();
		QuoteResponse block =  webClient.get()
								 .uri(url)
								 .accept(MediaType.APPLICATION_JSON)
								 .retrieve()
								 .bodyToMono(QuoteResponse.class)
								 .block();
		System.out.println(block);
	}
	
	public void getQuoteAsync() {
		String url = "https://quoters.apps.pcfone.io/api/random";

		WebClient webClient = WebClient.create();
		
		webClient.get()
				 .uri(url)
				 .accept(MediaType.APPLICATION_JSON)
				 .retrieve()
				 .bodyToMono(QuoteResponse.class)
				 .subscribe(System.out::println);
		
		System.out.println("Request sent......");
	}
}
