package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.response.Student;
import in.ashokit.student.StudentService;

@RestController
public class StudentRestController {

	@Autowired
	private StudentService studentService;

	@GetMapping(
			value = { "/student" },
			produces = { 
						"application/json", 
						"application/xml" 
					}
			)
	public ResponseEntity<Student> getStudent() {
		Student student = studentService.getStudent();
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
}
