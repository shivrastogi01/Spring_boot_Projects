package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import in.ashokit.entity.UserEntity;
import in.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);

		// List<UserEntity> findAll = repository.findAll();
		
		// List<UserEntity> findAll = repository.findAll(Sort.by("uname").descending());

		/*UserEntity entity = new UserEntity();
		entity.setAge(25);

		Example<UserEntity> of = Example.of(entity);
		List<UserEntity> findAll = repository.findAll(of);*/
		
		PageRequest pageRequest = PageRequest.of(0, 3);
		Page<UserEntity> findAll = repository.findAll(pageRequest);

		findAll.forEach(user -> {
			System.out.println(user);
		});

	}
}
