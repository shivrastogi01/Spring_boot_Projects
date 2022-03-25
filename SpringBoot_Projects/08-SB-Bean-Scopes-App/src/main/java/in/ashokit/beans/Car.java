package in.ashokit.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Car {

	public Car() {
		System.out.println("****** Car :: Constructor *******");
	}
}
