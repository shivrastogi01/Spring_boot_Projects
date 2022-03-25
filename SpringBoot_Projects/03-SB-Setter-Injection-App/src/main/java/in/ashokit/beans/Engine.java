package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine Constructor");
	}

	public int start() {
		// logic to start the engine
		return 1;
	}
}
