package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Serializable>{

}
