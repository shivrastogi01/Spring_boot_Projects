package in.ashokit.service;

import java.util.stream.Stream;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.response.Covid19Response;

@Service
public class Covid19Service {
	
	public void getCovid19Data() {
		String endpointUrl = "https://covid-19-data.p.rapidapi.com/country/code?code=IN";
		
		WebClient webClient = WebClient.create();
		Covid19Response[] response = webClient.get()
									 .uri(endpointUrl)
									 .header("x-rapidapi-host", "covid-19-data.p.rapidapi.com")
									 .header("x-rapidapi-key", "52a8dadb63msh063233193bbc910p155eecjsn94ccbf422f55")
									 .retrieve()
									 .bodyToMono(Covid19Response[].class)
									 .block();
		 Stream.of(response).forEach(System.out::println);
	}
}
