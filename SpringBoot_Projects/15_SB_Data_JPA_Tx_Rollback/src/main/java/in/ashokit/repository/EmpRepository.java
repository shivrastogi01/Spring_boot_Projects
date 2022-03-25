package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Serializable> {

}
