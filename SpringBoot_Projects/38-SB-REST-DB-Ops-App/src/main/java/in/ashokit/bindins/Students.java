package in.ashokit.bindins;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import in.ashokit.entity.Student;
import lombok.Data;

@Data
@XmlRootElement
public class Students {
	private List<Student> student;

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
}