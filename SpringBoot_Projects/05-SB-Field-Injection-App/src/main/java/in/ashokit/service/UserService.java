package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userdao;

	public void save() {
		boolean isSaved = userdao.saveUser();
		boolean isCreate = userdao.createUser();
		System.out.println("Is Record Saved ?? :: " + isSaved);
		System.out.println("User Created " + isCreate);
	}
}
