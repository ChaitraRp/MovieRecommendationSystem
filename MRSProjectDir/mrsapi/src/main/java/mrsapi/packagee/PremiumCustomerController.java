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
	String getHomePage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override 
	@RequestMapping(method=RequestMethod.POST, value="/getAccountPage")
	public Customer getUserAccountPage(@RequestBody Customer customer) {
		return premiumCustomerService.displayCustomerDetails(customer.getId());
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updateToPremium/{userAnswer}")
	public String updateToPremium(@RequestBody Customer customer,@PathVariable String userAnswer) {
		return paymentController.buyPlan(customer, userAnswer);
	}

}
