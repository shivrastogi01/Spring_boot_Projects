package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	@GetMapping("/course/{name}")
	public ResponseEntity<String> getCourseInfo(@PathVariable String name) {

		System.out.println("getCourseInfo( ) called");

		String msg = null;
		if ("SBMS".equals(name)) {
			msg = name + " will start in Oct 3rd week";
		} else if ("JRTP".equals(name)) {
			msg = name + " will start in Oct 2nd week";
		} else {
			msg = "Please contact Ashok IT admin for more detaisl on " + name;
		}
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@GetMapping("/course/{name}/{mode}")
	public ResponseEntity<String> getCourseDtls(@PathVariable String name, @PathVariable String mode) {
		String msg = null;
		if ("SBMS".equals(name) && "Online".equals(mode)) {
			msg = name + " will start in Oct 3rd week";
		} else if ("JRTP".equals(name)) {
			msg = name + " will start in Oct 2nd week";
		} else {
			msg = "Please contact Ashok IT admin for more detaisl on " + name;
		}
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
