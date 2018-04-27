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
		return "Welcome to Customer Home Page. This is the Best Movie Recommendation System that you can find"
				+ "We have thousands of movies, ratings in all languages and generes"
				+ "Specially curated movie List, according to your preferances. Join Now!!!";
	}

	@Override 
	@RequestMapping(method=RequestMethod.GET, value="/getAccountPage/{customerId}")
	public Customer getUserAccountPage(@PathVariable String customerId) {
		return adminService.displayCustomerDetails(customerId);
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
