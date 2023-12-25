package loginSystem.entities.concretes;

public class User {
	public int id;
	public String userName;
	public String userLastName;
	public String email;
	public String password;
	
	public User() {
		
	}

	public User(int id, String userName, String userLastName, String email, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.userLastName = userLastName;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
