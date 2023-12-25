package loginSystem.business.abstracts;

import java.util.List;

import loginSystem.entities.concretes.User;

public interface UserService {
	void add(User user);
	
	void login(User user);
	
	void delete(User user);
	
	List<User>getAll();

}
