package moviePackage;

import java.util.List;

public class CustomerService extends UserService {
	
	public Boolean signUpUser(Customer customer) {
		/* TODO
		 * Make database connection.
		 * Then insert a row in UserInfo table.
		 */
		return true;
	}
	
	public Boolean deleteCustomerAccount(Customer customer) {
		/* TODO
		 * Make database connection. Probably make a singleton class for getting te database connection object.
		 * delete the row from UserInfor table.
		 * return true if it was successful
		 */
		return true;
	}
	
	public void updateCustomerPlan(String planId, Customer customer) {
		/*
		 * TODO
		 * Make database connection. Probably make a singleton class for getting te database connection object.
		 * Update UserInfo table to the new planId for the given user ID
		 */
	}
	
	public List<Movie> viewAllMovieList() {
		/*
		 * Make database connection. Probably make a singleton class for getting te database connection object.
		 * select all movie data from Movie table.
		 * Create objects for all the selected data and return the list of these objects.
		 * 
		 */
		return null;
	}
}
