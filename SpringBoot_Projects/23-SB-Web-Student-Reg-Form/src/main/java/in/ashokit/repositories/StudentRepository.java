package in.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Serializable> {

}
