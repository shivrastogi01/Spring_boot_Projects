package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Address;

public interface AddresRepository extends JpaRepository<Address, Serializable> {

}
