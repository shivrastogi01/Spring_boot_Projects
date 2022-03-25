package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.request.Student;

@RestController
public class StudentRestController {

	@PostMapping(
			value = "/add-student", 
			consumes = { 
					"application/xml", 
					"application/json" 
			}
	)
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		System.out.println(student);
		// logic to insert into DB
		String msg = "Student Saved";
		return new ResponseEntity<>(msg, HttpStatus.CREATED);

	}
}
