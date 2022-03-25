package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Serializable> {

	@Query("from UserEntity where email=:email")
	public UserEntity findUserByEmail(String email);

	@Query("select userId, uname from UserEntity where age=:age")
	public Object[] findUserByAge(Integer age);
	
	@Query(value="select * from user_details where user_id=:userId", nativeQuery=true)
	public UserEntity findUserById(Integer userId);

}
