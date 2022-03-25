package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.response.QuoteResponse;

@Service
public class QuoteClientService {
	
	public QuoteResponse invokeRandomQuoteApi() {
		RestTemplate rt = new RestTemplate();

		String url = "https://quoters.apps.pcfone.io/api/random";

		/*ResponseEntity<String> responseEntity = rt.getForEntity(url, String.class);
		String body = responseEntity.getBody();
		System.out.println(body);*/
		
		ResponseEntity<QuoteResponse> forEntity = rt.getForEntity(url, QuoteResponse.class);
		QuoteResponse body = forEntity.getBody();
		
		return body;
	}

}
