package moviePackage;

public class UserService {

	public static Customer validateUser(String username, String password) {
		Customer customer = null;
		//TODO
		return customer;
	}
	
	public static Boolean isLoggedIn(String customerID) {
		/*
		 * 
		 * Check in database if given customerID is currently loggedIn.
		 */
		return true;
	}
	
	public static Boolean updatePassword(String username, String newPassword) {
		/* TODO
		 * Update the password of the given userId
		 */
		return true;
	}
}
