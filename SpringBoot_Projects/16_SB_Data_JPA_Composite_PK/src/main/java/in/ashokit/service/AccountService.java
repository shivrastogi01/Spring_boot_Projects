package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Account;
import in.ashokit.repository.AccountRepository;

@Service
public class AccountService {

	private AccountRepository accRepo;

	public AccountService(AccountRepository accRepo) {
		this.accRepo = accRepo;
	}

	public void saveAccData() {
		Account acc = new Account();
		acc.setBranchName("Ameerpet");
		acc.setMinBal(5000.00);
		
		acc.setAccId(103);
		acc.setAccType("SAVINGS");
		acc.setHolderName("IBM");

		accRepo.save(acc);
	}
}
