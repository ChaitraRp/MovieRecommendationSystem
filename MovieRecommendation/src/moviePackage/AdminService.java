package moviePackage;

public class AdminService extends UserService {
	
	void addMovieDetails(Movie movie) {
		/*
		 * Make database connection. Probably make a singleton class for getting te database connection object.
		 * Insert the movie detail as a row in Movie table.
		 */
	}
	
	Boolean updateMovieDetails(Movie movie) {
		/*
		 * Make database connection. Probably make a singleton class for getting te database connection object.
		 * Update the movie detail in the Movie table.
		 * If update was successful, return true.
		 */
		return true;
	}
	
	void addNewCustomer(Customer customer) {
		/*
		 * Make database connection. Probably make a singleton class for getting te database connection object.
		 * Insert a row in UserInfo table.
		 * 
		 */
	}
	
	Boolean modifyCustomerDetails(Customer customer) {
		/*
		 * Make database connection. Probably make a singleton class for getting te database connection object.
		 * Update the customer detail in the UserInfo table.
		 * If update was successful, return true.
		 */
		return true;
	}
	
	Boolean updateMovieRating(String movieID, int rating) {
		/*
		 * Make database connection. Probably make a singleton class for getting te database connection object.
		 * select the current rating and number of ratings for the given movie ID.
		 * find the new movie rating, (oldRating + newRating)/ (numberOfRating + 1) 
		 * If update was successful, return true.
		 */
		return true;
	}
}
