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
		return customer;
	}

	public Boolean isLoggedIn(String customerID) {
		Customer customer = null;
		customer = customerRepository.findOne(customerID);
		if (customer.getAccountAlive() == 1) {
			return true;
		}
		return false;
	}

	public Boolean updatePassword(Customer customer, String newPassword) {
		Customer customerExist = null;
		try {
			customerExist = customerRepository.findOne(customer.getCustomerId());
			if (customerExist != null) {
				customerExist.setPassword(newPassword);
				customerRepository.save(customerExist);
				return true;
			}
		} catch (Exception e) {
			System.out.println("Error while updating the password" + e.getMessage());
		}
		return false;
	}
}
