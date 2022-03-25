package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private UserDao userdao;

	public UserService() {
		System.out.println("UserService:: Constructor (0-Param)");
	}

	@Autowired
	public UserService(UserDao userdao) {
		System.out.println("UserService::Constructor (Param)");
		this.userdao = userdao;
	}

	public void insertUserData() {
		boolean isSaved = userdao.saveUser();
		if (isSaved) {
			System.out.println("Record Inserted Into DB.....");
		} else {
			System.out.println("Failed To Insert Record Into DB....");
		}
	}

}
