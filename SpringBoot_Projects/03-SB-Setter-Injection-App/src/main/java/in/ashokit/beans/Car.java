package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	

	private Engine eng;

	@Autowired
	public void setEng(Engine eng) {
		System.out.println("setEng() :: Method Called");
	    this.eng = eng;	
	}

	public Car() {
		System.out.println("Car::Constructor");
	}

	public void drive() {
		int status = eng.start();
		if (status == 1) {
			System.out.println("Journey Started....");
		}
	}
}
