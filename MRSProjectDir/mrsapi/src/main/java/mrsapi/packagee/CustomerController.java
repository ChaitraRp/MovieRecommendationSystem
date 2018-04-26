package mrsapi.packagee;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/CustomerController")
public class CustomerController extends UserController {

	@Autowired
	private CustomerService customerService;// = (CustomerService) UserServiceFactory.getUserService(1);
	
	@Autowired
	MovieService movieService;
	
	@Override
	@RequestMapping("/getHomePage")
	String getHomePage() {
		// TODO Auto-generated method stub
		return "Welcome to Customer Home Page";
	}

	@Override 
	@RequestMapping(method=RequestMethod.POST, value="/getAccountPage")
	String getUserAccountPage(@RequestBody Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/deleteAccount")
	public Boolean deleteAccount(@RequestBody Customer customer) {
		customerService.deleteCustomerAccount(customer);
		return true;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/getMoviePrfcsPage")
	public Map<String, String> getMoviePrfencesPage(@RequestBody Customer customer) {
		Map<String, String> preferances = new HashMap<String, String>();
		//The function returns the preferences set by the user.
		return preferances;
	}
	
	@RequestMapping("/getMovies")
	public void viewAllMovieList() {
		movieService.showAllMovies();
	} 
}
