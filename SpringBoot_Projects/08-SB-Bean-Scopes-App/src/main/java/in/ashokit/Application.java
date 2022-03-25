package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import in.ashokit.beans.Car;
import in.ashokit.beans.Engine;

@SpringBootApplication
public class Application {

	@Bean
	@Scope(value = "prototype")
	public Engine getEngine() {
		Engine eng = new Engine();
		return eng;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		Car car1 = context.getBean(Car.class);
		System.out.println(car1.hashCode());

		Car car2 = context.getBean(Car.class);
		System.out.println(car2.hashCode());

		Car car3 = context.getBean(Car.class);
		System.out.println(car3.hashCode());

		System.out.println("********************Engine bean hascodes*****************");

		Engine eng1 = context.getBean(Engine.class);
		System.out.println(eng1.hashCode());

		Engine eng2 = context.getBean(Engine.class);
		System.out.println(eng2.hashCode());

	}
}
