package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {

	@GetMapping("/course")
	public String courseDetails(@RequestParam("coursename") String cname, @RequestParam String tname, Model model) {

		String msgTxt = "";

		if (cname.equals("SBMS") && tname.equals("Ashok")) {
			msgTxt = cname + " By " + tname + " starting from 20-Aug-2021 @8:00 PM IST";
		} else {
			msgTxt = "Please visit www.ashokit.in for more details";
		}

		model.addAttribute("msg", msgTxt);

		return "index";
	}

}
