package in.ashokit.converters;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import in.ashokit.bindings.Address;
import in.ashokit.bindings.Student;

public class Marshalling {

	public static void main(String[] args) throws Exception {
		Address addr = new Address("Hyd","TG","India");
		Student student = new Student();
		student.setStudentId(101);
		student.setStudentName("Ashok");
		student.setStudentAge(20);
		student.setStudentRank(5);
		student.setAddress(addr);

		JAXBContext context = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(student, System.out);
	}
}
