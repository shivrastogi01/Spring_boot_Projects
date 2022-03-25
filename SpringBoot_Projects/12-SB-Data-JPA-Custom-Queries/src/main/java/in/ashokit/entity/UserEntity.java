package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class UserEntity {

	@Id
	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "USER_NAME")
	private String uname;

	@Column(name = "USER_EMAIL")
	private String email;

	@Column(name = "USER_AGE")
	private Integer age;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", uname=" + uname + ", email=" + email + ", age=" + age + "]";
	}

}
