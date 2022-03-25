package in.ashokit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "GENDERS")
@Data
public class Gender {

	@Id
	@Column(name = "GENDER_ID")
	private Integer genderId;

	@Column(name = "GENDER_NAME")
	private String genderName;

}
