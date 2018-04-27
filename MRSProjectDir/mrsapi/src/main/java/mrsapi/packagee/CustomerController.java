package mrsapi.packagee;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CustomerController extends UserController {

	@Autowired
	private CustomerService customerService;// = (CustomerService) UserServiceFactory.getUserService(1);
	
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
	@RequestMapping("/getAccountPage/{customerId}")
	public Customer getUserAccountPage(@PathVariable String customerId) {
		return customerService.displayCustomerDetails(customerId);
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
	
	@RequestMapping("/loadAllData")
	public String loadData() throws IOException {
		return customerService.doWork();
	}
	
	@RequestMapping("/getAllMovieDetails")
	public List<Movie> viewAllMovieList() throws IOException {
		return movieService.showAllMovies();
	}
	
	@RequestMapping("/getMovieDetails/{movieId}")
	public Movie viewAllMovieList(@PathVariable String movieId) throws IOException {
		return movieService.getMovieDetails(movieId);
	}
}
