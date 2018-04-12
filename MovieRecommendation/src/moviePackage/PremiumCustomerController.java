package moviePackage;

public class PremiumCustomerController extends UserController {

	CustomerService premiumCustomerService = (CustomerService) UserServiceFactory.getUserService(0);
	
	@Override
	String getHomePage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String getCustomerAccountPage() {
		// TODO Auto-generated method stub
		return null;
	}

}
