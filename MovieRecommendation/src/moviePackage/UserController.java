package moviePackage;

public abstract class UserController {
	
	public Customer logic(String username, String password) {
		return UserService.validateUser(username, password);
	}
	public Boolean isLoggedIn(int customerID) {
		return UserService.isLoggedIn(customerID);
	}
	
	public Boolean signUp(Customer customer) {
		CustomerService customerService = (CustomerService) UserServiceFactory.getUserService(customer.getUserType());
		return customerService.signUpUser(customer);
	}
	
	public boolean updatePassword(String username, String oldPassword, String newPassword) {
		Customer validUser = UserService.validateUser(username, oldPassword);
		if (validUser != null) {
			return UserService.updatePassword(username, newPassword);
		}
		return false;
	}
	
	abstract String getHomePage();
	abstract String getCustomerAccountPage();
}
