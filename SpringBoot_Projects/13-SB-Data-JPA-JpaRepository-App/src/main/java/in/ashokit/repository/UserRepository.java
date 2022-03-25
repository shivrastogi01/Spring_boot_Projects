package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Serializable> {

}
