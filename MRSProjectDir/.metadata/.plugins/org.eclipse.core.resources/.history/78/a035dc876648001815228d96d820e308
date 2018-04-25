package moviePackage;

import java.util.ArrayList;
import java.util.List;

public class CustomerController extends UserController {

	private CustomerService customerService = (CustomerService) UserServiceFactory.getUserService(1);
	
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
	
	public Boolean deleteAccount(Customer customer) {
		customerService.deleteCustomerAccount(customer);
		return true;
	}
	
	public void getMoviePrfencesPage(Customer customer) {
		int updatePreferances = 0;
		/*
		 * Prompt user with the different genres of movies that we have.
		 * Then ask him if he would like to update his preferences
		 */
		
		if (updatePreferances == 1) {
			List<String> genreList = new ArrayList<String>();
			List<String> languageList = new ArrayList<String>();
			List<Integer> yearList = new ArrayList<Integer>();
			/*
			 * Prompt him to select the genre List
			 * Prompt him to select the language List
			 * Prompt him to select the year List
			 */
			RecommendationController rcmdationController = new RecommendationController();
			rcmdationController.updatePreferences(genreList, languageList, yearList, customer.getUserId());
		}
	}
	
	public void viewAllMovieList() {
		MovieService movieService = new MovieService();
		movieService.showAllMovies();
	} 
	
}
