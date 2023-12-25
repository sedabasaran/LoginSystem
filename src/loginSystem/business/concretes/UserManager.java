package loginSystem.business.concretes;

import java.util.List;

import loginSystem.business.abstracts.UserService;
import loginSystem.core.abstracts.UserAccountService;
import loginSystem.dataAccess.abstracts.UserRepository;
import loginSystem.entities.concretes.User;

public class UserManager implements UserService {

	private UserRepository userRepository;
	private UserAccountService accountService;
	private UserCheckManager userCheckManager;

	public UserManager(UserRepository userRepository, UserAccountService accountService,
			UserCheckManager userCheckManager) {
		super();
		this.userRepository = userRepository;
		this.accountService = accountService;
		this.userCheckManager = userCheckManager;
	}

	@Override
	public void add(User user) {

		if (this.userCheckManager.emailRegexCheck(user) && this.userCheckManager.passwordCheck(user)
				&& this.userCheckManager.nameCheck(user)) {
			this.userCheckManager.clickToValidate(user);
			System.out.println("Email doğrulandı : " + user.getUserName() + user.getUserLastName());
			this.userRepository.add(user);
			this.accountService.signUpToSystem(user.getEmail());
		} else {
			System.out.println("Başarısız deneme,Kullanıcı adı veya şifreniz uygun değildir.Tekrar deneyiniz");
		}
	}

	@Override
	public void login(User user) {
		if (this.userCheckManager.emailRegexCheck(user) && this.userCheckManager.loginEmailPasswordCheck(user)) {
			System.out.println("Sisteme giriş yapıldı: " + user.getUserName() + user.getUserLastName());
			this.userRepository.add(user);
			this.accountService.loginToSytem(user.getEmail());
		} else {
			System.out.println("Başarısız deneme sisteme giriş yapılamadı.Tekrar deneyiniz");
		}

	}

	@Override
	public void delete(User user) {
		if (this.userCheckManager.emailRegexCheck(user) && this.userCheckManager.loginEmailPasswordCheck(user)) {
			System.out.println("Hesabınız silindi: " + user.getEmail());
		} else {
			System.out.println("Başarısız deneme sisteme giriş yapılamadı.Tekrar deneyiniz");
		}

	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
