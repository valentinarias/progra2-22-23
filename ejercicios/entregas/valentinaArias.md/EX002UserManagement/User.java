public class User {

	private boolean login;
	private String password;
	private String name;

	public User(boolean login,String password,String name) {
		this.login = login;
		this.name=name;
		this.password = password;
	}
	public boolean getLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
