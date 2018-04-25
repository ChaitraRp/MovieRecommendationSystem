package mrsapi.packagee;

public class AdminController extends UserController {

	private CustomerService adminService = (CustomerService) UserServiceFactory.getUserService(2);
	
	@Override
	String getHomePage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String getUserAccountPage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void getCustomerDetails(String custID) {
		adminService.displayCustomerDetails(custID);
	}
	
	public Movie getMovieDetails(String MovieId) {
		return adminService.getMovieDetails(MovieId);
	}
}
