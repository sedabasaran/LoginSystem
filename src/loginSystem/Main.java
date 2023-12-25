package loginSystem;

import loginSystem.business.abstracts.UserService;
import loginSystem.business.concretes.UserCheckManager;
import loginSystem.business.concretes.UserManager;
import loginSystem.core.concretes.GoogleUserAccountAdapter;
import loginSystem.dataAccess.concretes.HibernateUserRepository;
import loginSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1,"Seda","Basaran","seda@gmail.com","123456");
		UserService userService = new UserManager(new HibernateUserRepository(), new GoogleUserAccountAdapter(), new UserCheckManager());
				
//		userService.add(user);
//		userService.delete(user);
		userService.login(user);
		
	}

}
