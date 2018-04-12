package moviePackage;

public class CustomerController extends UserController {

	CustomerService customerService = (CustomerService) UserServiceFactory.getUserService(1);
	
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
