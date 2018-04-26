package mrsapi.packagee;

import org.springframework.stereotype.Service;

@Service
public class AdminService extends UserService {
	
	public void addMovieDetails(Movie movie) {
		movieService.addMovieDetails(movie);
	}
	
	public Boolean updateMovieDetails(Movie movie) {
		return movieService.updateMovieDetails(movie);
	}
	
	public Boolean addNewCustomer(Customer customer) {
		try {
			customerRepository.save(customer);
			return true;
		} catch (Exception e) {
			System.out.println("Error in adding Customer through Admin: " + e.getMessage());
			return false;
		}
	}
	
	public Boolean modifyCustomerDetails(Customer customer) {
		try {
			customerRepository.save(customer);
			return true;
		} catch (Exception e) {
			System.out.println("Error in adding Customer through Admin: " + e.getMessage());
			return false;
		}
	}
	
	public Boolean updateMovieRating(String movieID, int rating) {
		return movieService.updateMovieRating(movieID, rating);
	}
}
