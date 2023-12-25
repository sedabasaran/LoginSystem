package loginSystem.core.concretes;

import loginSystem.core.abstracts.UserAccountService;

public class GoogleAccountManager implements UserAccountService {

	@Override
	public void signUpToSystem(String message) {
		System.out.println("Google hesabı ile kaydedildi: " + message);

	}

	@Override
	public void loginToSytem(String message) {
		System.out.println("Google hesabı ile giriş yapıldı: " + message);

	}

}
