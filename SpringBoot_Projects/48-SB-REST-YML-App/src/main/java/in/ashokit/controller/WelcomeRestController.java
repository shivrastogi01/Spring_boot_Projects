package in.ashokit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.props.AppProperties;

@RestController
public class WelcomeRestController {

	@Autowired
	private AppProperties properties;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		Map<String, String> messages = properties.getMessages();
		String msg = messages.get("welcomeMsg");
		return msg;
	}

	@GetMapping("/greet")
	public String getGreetMsg() {
		Map<String, String> messages = properties.getMessages();
		String msg = messages.get("greetMsg");
		return msg;
	}
}
