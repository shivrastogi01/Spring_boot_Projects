package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Student;
import in.ashokit.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/student")
	public String loadForm(Model model) {

		model.addAttribute("genders", service.getGenders());
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("timings", service.getTimings());

		model.addAttribute("student", new Student());

		return "studentReg";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(Student student, Model model) {
		System.out.println(student);
		
		service.saveStudent(student);
		
		return "regSuccess";
	}

}
