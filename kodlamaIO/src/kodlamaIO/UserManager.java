package kodlamaIO;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getId() + " numaralý kullanýcý sisteme giriþ yaptý.");
	}

	public void logOut(User user) {
		System.out.println(user.getId() + " numaralý kullanýcý sistemden çýkýþ yaptý.");
	}

	public void signUp(User user) {
		System.out.println(user.getId() + " numaralý kullanýcý sisteme kaydoldu.");
	}

}
