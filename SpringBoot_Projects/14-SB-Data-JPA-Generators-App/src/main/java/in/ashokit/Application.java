package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		StudentRepository studentRepository = context.getBean(StudentRepository.class);

		Student student = new Student();
		student.setStudentName("Raju");
		student.setStudentEmail("raju@gmail.com");
		student.setStudentRank(30);

		studentRepository.save(student);

	}
}
