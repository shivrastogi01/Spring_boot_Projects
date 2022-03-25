package in.ashokit.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Student {

	private Integer studentId;
	private String studentName;
	private String studentEmail;

}
