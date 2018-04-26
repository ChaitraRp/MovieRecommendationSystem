package mrsapi.packagee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends UserService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Boolean signUpUser(Customer customer) {
		try {
			customerRepository.save(customer);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}
		return true;
	}
	
	public Boolean deleteCustomerAccount(Customer customer) {
		try {
			customerRepository.delete(customer);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}
		return true;
	}
	
	public void updateCustomerPlan(Customer customer) {
		customerRepository.save(customer);
	}
	

	public Customer displayCustomerDetails(String custID) {
		return customerRepository.findOne(custID);
	}
}