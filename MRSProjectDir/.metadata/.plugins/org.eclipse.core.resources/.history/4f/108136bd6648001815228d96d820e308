package moviePackage;

public class CustomerControllerFactory {
	
	public static UserController getUserController(int userType) {
		UserController userController = null;
		
		if (userType == 0) {
			userController = new PremiumCustomerController();
		} else if (userType == 1) {
			userController = new CustomerController();
		} else if (userType == 2) {
			userController = new AdminController();
		}
		return userController;
	}
}
