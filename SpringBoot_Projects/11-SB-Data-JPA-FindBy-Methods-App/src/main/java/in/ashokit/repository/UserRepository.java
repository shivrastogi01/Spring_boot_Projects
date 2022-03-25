package in.ashokit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Serializable> {

	public UserEntity findByEmail(String email);

	public UserEntity findByUname(String name);

	public List<UserEntity> findByAge(Integer age);

	public UserEntity findByEmailAndUname(String email, String name);

	public UserEntity findByAgeGreaterThan(Integer age);

}
