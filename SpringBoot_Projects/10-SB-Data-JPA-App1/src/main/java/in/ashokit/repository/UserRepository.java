package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.UserEntity;

//@Repository
public interface UserRepository extends CrudRepository<UserEntity, Serializable> {

}
