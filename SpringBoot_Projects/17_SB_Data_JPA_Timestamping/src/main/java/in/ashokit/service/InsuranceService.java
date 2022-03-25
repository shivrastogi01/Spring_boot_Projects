package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.InsurancePlan;
import in.ashokit.repository.InsurancePlanRepository;

@Service
public class InsuranceService {

	@Autowired
	private InsurancePlanRepository planRepo;

	public void savePlan() {
		InsurancePlan plan = new InsurancePlan();
		plan.setPlanName("SNAP");
		plan.setPlanStatus("DN");
		
		planRepo.save(plan);
	}

}
