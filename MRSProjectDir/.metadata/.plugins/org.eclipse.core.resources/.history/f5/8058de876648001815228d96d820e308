package moviePackage;

public class UserServiceFactory {

	public static UserService getUserService(int userType) {
		
		UserService userService = null;
		
		if (userType == 0 || userType == 1) {
			userService = new CustomerService();
		} else if (userType == 2) {
			userService = new AdminService();
		}

		return userService;
	}
}
