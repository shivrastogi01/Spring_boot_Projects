package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeResource {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeMsg() {
		String reponseMsg = "Welcome to Ashok IT";
		return new ResponseEntity<>(reponseMsg, HttpStatus.OK);
	}
}
