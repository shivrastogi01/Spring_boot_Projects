package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_TBL")
public class Employee {

	public Employee() {
	}

	public Employee(Integer empId, String empName, Double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	@Id
	@Column(name = "EMP_ID")
	private Integer empId;

	@Column(name = "EMP_NAME")
	private String empName;

	@Column(name = "EMP_SAL")
	private Double empSal;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}
