package loginSystem.dataAccess.abstracts;

import java.util.List;

import loginSystem.entities.concretes.User;

public interface UserRepository {
	void add(User user);

	void update(User user);

	void delete(User user);

	User get(int id);

	List<User> getAll();

}
