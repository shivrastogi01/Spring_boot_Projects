package in.ashokit.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.User;

@Controller
public class UserController {

	@GetMapping("/user-form")
	public String loadUserForm(Model model) {

		User userObj = new User();
		model.addAttribute("user", userObj);

		return "index";
	}

	@PostMapping("/saveUser")
	public String saveUser(@Valid User user, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "index";
		}

		System.out.println(user);
		model.addAttribute("msg", "User saved successfully");
		return "dashboard";
	}

}
