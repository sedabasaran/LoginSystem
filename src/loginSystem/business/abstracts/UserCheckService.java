package loginSystem.business.abstracts;

import loginSystem.entities.concretes.User;

public interface UserCheckService {

	boolean passwordCheck(User user);

	boolean emailRegexCheck(User user);

	boolean nameCheck(User user);

	void clickToValidate(User user);

	boolean loginEmailPasswordCheck(User user);

}
