package loginSystem.business.concretes;

import loginSystem.business.abstracts.UserCheckService;
import loginSystem.entities.concretes.User;

public class UserCheckManager implements UserCheckService {

	public UserCheckManager() {

	}

	@Override
	public boolean passwordCheck(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Şifeniz en az 6 karakter olmalıdır");
			return false;
		} else {
			System.out.println("Sifreniz kabul edildi");
		}
		return true;
	}

	@Override
	public boolean emailRegexCheck(User user) {
		String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		if (user.getEmail().matches(emailPattern) == true) {
			return true;
		} else {
			System.out.println("E-mail adresiniz yanlıştır.Tekrar deneyiniz. " + user.getEmail());
			return false;
		}
	}

	@Override
	public boolean nameCheck(User user) {
		if (user.getUserName().length() < 2 || user.getUserLastName().length() < 2) {
			System.out.println("Kullanıcı ad ve soyadı en az 2 karakterden oluşmalıdır");
			return false;
		} else {
			System.out.println("İşleminize devam edebilirsiniz");
			return true;
		}
	}

	@Override
	public void clickToValidate(User user) {
		System.out
				.println("Doğrulama e-postası gönderilmiştir.Lütfen linki kontrol ediniz. " + user.getEmail());
	}

	@Override
	public boolean loginEmailPasswordCheck(User user) {
		if (user.getEmail() == user.getEmail() && user.getPassword() == user.getPassword()) {
			return true;
		} else {
			return false;
		}
	}

}
