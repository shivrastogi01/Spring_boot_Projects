package in.ashokit.rest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindins.Students;
import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@RestController
public class StudentRestController {

	@Autowired
	private StudentRepository studentRepo;

	@PostMapping(value = "/student", consumes = { "application/xml", "application/json" })
	public ResponseEntity<String> addStudent(@RequestBody Students students) {
		List<Student> studentsList = students.getStudent();
		for (Student s : studentsList) {
			studentRepo.save(s);
		}
		return new ResponseEntity<>("Success", HttpStatus.CREATED);
	}

	@GetMapping(value = "/student/{sid}", produces = { "application/xml", "application/json" })
	public ResponseEntity<Students> getStudentById(@PathVariable Integer sid) {
		Optional<Student> findById = studentRepo.findById(sid);
		if (findById.isPresent()) {
			Student student = findById.get();
			Students students = new Students();
			students.setStudent(Arrays.asList(student));
			return new ResponseEntity<>(students, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping(value = "/student", produces = { "application/xml", "application/json" })
	public ResponseEntity<List<Student>> getStudentByAge(@RequestParam Integer age) {
		List<Student> studentsList = studentRepo.findBySageGreaterThanEqual(age);

	//	Students students = new Students();
    //		students.setStudent(studentsList);

		return new ResponseEntity<>(studentsList, HttpStatus.OK);
	}
	@PutMapping("/student/{sid}")
	public ResponseEntity<String> updateCustomer(@PathVariable Integer sid) {

		// logic to update customer
		List<Student> studentsList =studentsList.stream().filter(student -> student.getSid()!=sid).collect(Collectors.toList());

		String msg = "Customer record updated successfully";

		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@DeleteMapping("/student/{sid}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer sid) {
		// logic to delete customer

		String msg = "Customer record deleted successfully";

		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

}
