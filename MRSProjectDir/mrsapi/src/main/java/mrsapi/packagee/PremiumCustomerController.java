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
	String getUserAccountPage(@RequestBody Customer customer) {
		// TODO Auto-generated method stub
		// This menu should also have "Update to Premium" with options of 1/3/6/9/12 months
		return null;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/updateToPremium/{planId}")
	public boolean updateToPremium(@RequestBody Customer customer,@PathVariable int planId) {
		return paymentController.buyPlan(customer, planId) ;
	}

}
