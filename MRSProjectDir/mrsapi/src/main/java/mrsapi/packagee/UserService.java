package mrsapi.packagee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	public CustomerRepository customerRepository;

	@Autowired
	MovieService movieService;

	public Customer validateUser(String username, String password) {
		Customer customer = null;
		customer = customerRepository.findByUsername(username);
		System.out.println("sent username: " + username);
		System.out.println("sent password: " + password);
		
		if (customer == null) {
			System.out.println("Customer doesn't exist");
		} else {
			System.out.println("Username found, password is: " + customer.getPassword());
		}
		
		if (customer != null && customer.getPassword().equals(password)) {
			return customer;
		}
		return null;
	}

	public Boolean isLoggedIn(String customerID) {
		Customer customer = null;
		customer = customerRepository.findOne(customerID);
		if (customer != null && customer.getAccountAlive() == 1) {
			return true;
		}
		return false;
	}

	public Boolean updatePassword(Customer customer, String newPassword) {
		try {
			if (customer != null) {
				customer.setPassword(newPassword);
				customerRepository.save(customer);
				return true;
			}
		} catch (Exception e) {
			System.out.println("Error while updating the password" + e.getMessage());
		}
		return false;
	}
}
