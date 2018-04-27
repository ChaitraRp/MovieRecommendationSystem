package mrsapi.packagee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public abstract class UserController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	UserService userService;
	
	@RequestMapping(method=RequestMethod.POST, value="/login")
	public Customer login(@RequestBody User user) {
		return userService.validateUser(user.getUsername(), user.getPassword());
	}
	
	@RequestMapping("/isLoggedIn/{custID}")
	public Boolean isLoggedIn(@PathVariable String custID) {
		return userService.isLoggedIn(custID);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/signup")
	public Boolean signUp(@RequestBody Customer customer) {
		//CustomerService customerService = (CustomerService) UserServiceFactory.getUserService(customer.getUserType());
		return customerService.signUpUser(customer);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updatePassword/{newPassword}")
	public boolean updatePassword(@RequestBody Customer customer, @PathVariable String newPassword) {
		System.out.println("In update Password");
		Customer validUser = userService.validateUser(customer.getUsername(), customer.getPassword());
		if (validUser != null) {
			System.out.println("Found the user. User is valid");
			return userService.updatePassword(customer, newPassword);
		}
		return false;
	}
	
	abstract String getHomePage();
	abstract Customer getUserAccountPage(String customerId);
}
