package in.ashokit.converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import in.ashokit.bindings.Student;

public class UnMarshalling {

	public static void main(String[] args) throws Exception {

		JAXBContext context = JAXBContext.newInstance(Student.class);

		Unmarshaller unmarshaller = context.createUnmarshaller();

		Student student = (Student) unmarshaller.unmarshal(new File("student.xml"));

		System.out.println(student);

	}
}
