package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class WelcomeRestController {

	@ApiOperation(
			value = "This operation is used to generate welcome msg", 
			response = String.class
	)
	@GetMapping("/welcome/{name}")
	public String welcomeMsg(@ApiParam("Name to wish") @PathVariable String name) {
		String msg = name + ", Good Morning..!!";
		return msg;
	}
}