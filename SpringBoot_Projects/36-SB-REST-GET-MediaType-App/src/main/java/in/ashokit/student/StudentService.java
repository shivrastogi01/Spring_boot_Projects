package in.ashokit.student;

import org.springframework.stereotype.Service;

import in.ashokit.response.Student;

@Service
public class StudentService {

	public Student getStudent() {
		Student student = new Student(101, "Peter", "peter@ashokit.in");
		return student;
	}
}
