package in.ashokit.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entities.Gender;

public interface GendersRepository extends JpaRepository<Gender, Serializable> {
	
	@Query("select genderName from Gender")
	public List<String> getGenderNames();

}
