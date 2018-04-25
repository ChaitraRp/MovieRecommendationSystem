package mrsapi.packagee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/PremiumController")
public class PremiumCustomerController extends UserController {

	@Autowired
	private CustomerService premiumCustomerService; //= (CustomerService) UserServiceFactory.getUserService(0);
	
	@Override
	@RequestMapping("/getHomePage")
	String getHomePage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping("/getAccountPage")
	String getUserAccountPage() {
		// TODO Auto-generated method stub
		// This menu should also have "Update to Premium" with options of 1/3/6/9/12 months
		return null;
	}
	
	//Check class diagram
	@RequestMapping("/updateToPremium/{custId, planId}")
	public boolean updateToPremium(String custId, int planId) {
		PaymentController paymentController = new PaymentController();
		return paymentController.buyPlan(custId, planId) ;
	}

}
