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
@RequestMapping("/CustomerController")
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
	@RequestMapping(method=RequestMethod.POST, value="/getAccountPage")
	public Customer getUserAccountPage(@RequestBody Customer customer) {
		return customerService.displayCustomerDetails(customer.getId());
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
	
	@RequestMapping("/addMovies")
	public String AddAllMovieList() throws IOException {
		return customerService.doWrok();
		//movieService.showAllMovies();
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
