package in.ashokit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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

		// System.out.println(repository.getClass().getName());

		/*UserEntity entity = new UserEntity();
		entity.setUserId(101);
		entity.setUname("Ashok");
		entity.setEmail("ashok@gmail.com");
		entity.setAge(28);

		repository.save(entity);*/
		
		UserEntity entity1 = new UserEntity();
		entity1.setUserId(101);
		entity1.setUname("Raju");
		entity1.setEmail("raju@gmail.com");
		entity1.setAge(28);
		
		UserEntity entity2 = new UserEntity();
		entity2.setUserId(102);
		entity2.setUname("Rani");
		entity2.setEmail("rani@gmail.com");
		entity2.setAge(25);
		
		UserEntity entity3 = new UserEntity();
		entity3.setUserId(103);
		entity3.setUname("Mahesh");
		entity3.setEmail("mahesh@gmail.com");
		entity3.setAge(25);
		
		List<UserEntity> entities = new ArrayList<>();
		entities.add(entity1);
		entities.add(entity2);
		entities.add(entity3);
		
		repository.saveAll(entities);
		
		/*Optional<UserEntity> findById = repository.findById(102);
		if(findById.isPresent()) {
			UserEntity userEntity = findById.get();
			System.out.println(userEntity);
		}*/
		
		/*List<Serializable> userIds = Arrays.asList(101,102);
		Iterable<UserEntity> findAllById = repository.findAllById(userIds);
		findAllById.forEach(entity -> {
			System.out.println(entity);
		});*/
		
		/*Iterable<UserEntity> findAll = repository.findAll();
		findAll.forEach(entity -> {
			System.out.println(entity);
		});*/
		
		/*boolean existsById = repository.existsById(102);
		System.out.println("Is Record Present With PK as 102 ?? :: " + existsById);*/
		
		/*long count = repository.count();
		System.out.println("Total Records Count ::: " + count);*/
		
		//repository.deleteById(103);
		
	}
}
