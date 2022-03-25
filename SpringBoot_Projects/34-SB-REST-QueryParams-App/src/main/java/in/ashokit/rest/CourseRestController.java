package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	@GetMapping("/course")
	public ResponseEntity<String> getCourseDtls(@RequestParam("name") String name) {

		String msg = null;

		if ("SBMS".equals(name)) {
			msg = name + " Will start in October 3rd week";
		} else if ("JRTP".equals(name)) {
			msg = name + " Will start in October 2nd week";
		} else {
			msg = "Please contact +91-6301921083 for more details On " + name;
		}
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
