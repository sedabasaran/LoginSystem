package loginSystem.dataAccess.concretes;

import java.util.List;

import loginSystem.dataAccess.abstracts.UserRepository;
import loginSystem.entities.concretes.User;

public class HibernateUserRepository implements UserRepository {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println(
				"Hibernate ile kullanıcı eklendi. " +  "\n" + "kullanıcı adınız: " + user.getUserName() + "\n" +  "şifreniz :" + user.getPassword() + "\n " + "mail adresiniz: " + user.getEmail());
	}

	@Override
	public void update(User user) {
		System.out.println(
				"Hibernate kullanıcı bilgileri ile güncellendi" + " " + user.getUserName() + user.getPassword());

	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile kullanıcı silindi " + user.getUserName() + " " + user.getEmail());

	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
