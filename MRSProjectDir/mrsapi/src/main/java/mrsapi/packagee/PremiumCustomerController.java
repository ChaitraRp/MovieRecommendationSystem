package mrsapi.packagee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PremiumController")
public class PremiumCustomerController extends UserController {

	@Autowired
	private CustomerService premiumCustomerService; //= (CustomerService) UserServiceFactory.getUserService(0);
	
	@Autowired
	PaymentController paymentController;
	
	
	@Override
	@RequestMapping("/getHomePage")
	public String getHomePage() {
		return "Welcome to Customer Home Page. This is the Best Movie Recommendation System that you can find"
				+ "We have thousands of movies, ratings in all languages and generes"
				+ "Specially curated movie List, according to your preferances. Join Now!!!";

	}

	@Override 
	@RequestMapping(method=RequestMethod.GET, value="/getAccountPage/{customerId}")
	public Customer getUserAccountPage(@PathVariable String customerId) {
		return premiumCustomerService.displayCustomerDetails(customerId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updateToPremiumCustomer/{userAnswer}")
	public String updateToPremium(@RequestBody Customer customer,@PathVariable String userAnswer) {
		return paymentController.buyPlan(customer, userAnswer);
	}

}
