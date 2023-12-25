package loginSystem.core.concretes;

import loginSystem.core.abstracts.UserAccountService;

public class GoogleUserAccountAdapter implements UserAccountService {

	@Override
	public void signUpToSystem(String message) {
		GoogleAccountManager googleAccountManager = new GoogleAccountManager();
		googleAccountManager.signUpToSystem(message);

	}

	@Override
	public void loginToSytem(String message) {
		GoogleAccountManager googleAccountManager = new GoogleAccountManager();
		googleAccountManager.loginToSytem(message);

	}

}
