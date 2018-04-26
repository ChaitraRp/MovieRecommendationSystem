package mrsapi.packagee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/AdminController")
public class AdminController extends UserController {

	@Autowired
	private CustomerService adminService;// = (CustomerService) UserServiceFactory.getUserService(2);
	
	@Autowired
	private MovieService movieService;
	
	@Override
	@RequestMapping("/getHomePage")
	String getHomePage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(method=RequestMethod.POST, value="/getAccountPage")
	String getUserAccountPage(@RequestBody Customer customer) {
		//Create a new admin?
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/getCustDetails")
	public void getCustomerDetails(@RequestBody Customer customer) {
		adminService.displayCustomerDetails(customer.getUserId());
	}
	
	@RequestMapping("/getMovie/{movieId}")
	public Movie getMovieDetails(@PathVariable String movieId) {
		return movieService.getMovieDetails(movieId);
	}
}
