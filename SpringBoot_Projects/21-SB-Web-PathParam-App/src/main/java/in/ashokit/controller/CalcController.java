package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CalcController {

	@GetMapping("/add/{a}/{b}")
	public String add(@PathVariable Integer a, @PathVariable Integer b, Model model) {

		Integer result = a + b;

		String msgTxt = "Sum of " + a + " & " + b + " is :: " + result;

		model.addAttribute("msg", msgTxt);

		return "index";
	}

}
