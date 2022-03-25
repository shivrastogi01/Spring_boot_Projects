package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.UserEntity;
import in.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);
		
		UserEntity entity1 = repository.findByEmail("raju@gmail.com");
		System.out.println(entity1);
		
		UserEntity entity2 = repository.findByUname("Rani");
		System.out.println(entity2);
		
		List<UserEntity> users = repository.findByAge(25);
		users.forEach(user -> System.out.println(user));
	}
}
