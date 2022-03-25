package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.bindings.User;

@Controller
public class UserController {

	@GetMapping("/user")
	public String loadForm() {
		return "userReg";
	}

	@PostMapping("/saveUser")
	public String userRegister(User user, Model model) {
		System.out.println(user);

		// store data into database

		model.addAttribute("uname", user.getUname());

		return "userRegSuccess";
	}

}
