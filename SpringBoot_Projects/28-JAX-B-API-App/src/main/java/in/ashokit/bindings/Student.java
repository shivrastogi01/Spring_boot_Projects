package in.ashokit.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

	@XmlAttribute(name="id")
	private Integer studentId;

	@XmlElement(name = "name")
	private String studentName;

	@XmlElement(name = "age")
	private Integer studentAge;

	@XmlElement(name = "rank")
	private Integer studentRank;

	private Address address;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	public Integer getStudentRank() {
		return studentRank;
	}

	public void setStudentRank(Integer studentRank) {
		this.studentRank = studentRank;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentRank=" + studentRank + ", address=" + address + "]";
	}

}
