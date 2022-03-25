package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENTS_TBL")
public class Student {

	@Id
	@Column(name = "STUDENT_ID")
	@SequenceGenerator(name = "s_id_seq", sequenceName = "student_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "s_id_seq", strategy = GenerationType.SEQUENCE)
	private Integer studentId;

	@Column(name = "STUDENT_NAME")
	private String studentName;

	@Column(name = "STUDENT_EMAIL")
	private String studentEmail;

	@Column(name = "STUDENT_RANKS")
	private Integer studentRank;

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

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public Integer getStudentRank() {
		return studentRank;
	}

	public void setStudentRank(Integer studentRank) {
		this.studentRank = studentRank;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentRank=" + studentRank + "]";
	}
}
