package kodlamaIO;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getId() + " numaral� kullan�c� sisteme giri� yapt�.");
	}

	public void logOut(User user) {
		System.out.println(user.getId() + " numaral� kullan�c� sistemden ��k�� yapt�.");
	}

	public void signUp(User user) {
		System.out.println(user.getId() + " numaral� kullan�c� sisteme kaydoldu.");
	}

}
