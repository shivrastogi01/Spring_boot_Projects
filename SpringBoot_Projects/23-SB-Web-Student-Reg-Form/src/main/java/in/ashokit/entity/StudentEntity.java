package in.ashokit.entity;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "STUDENT_TBL")
public class StudentEntity {

	@Id
	@GeneratedValue
	private Integer studentId;
	private String name;
	private String email;
	private Long phno;
	private String gender;
	private String course;

	@OrderColumn
	@ElementCollection
	@CollectionTable(name = "STUDENT_COURSE_TIMINGS", joinColumns = @JoinColumn(name = "studentId"))
	private String[] timings;

}
