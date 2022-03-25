package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.InsurancePlan;

public interface InsurancePlanRepository extends JpaRepository<InsurancePlan, Serializable> {

}
