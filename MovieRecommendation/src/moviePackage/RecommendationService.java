package moviePackage;

import java.util.List;
import java.util.Map;

public class RecommendationService {
	public boolean updateCsmtPrefnce(Recommend rec, String custID) {
		/*
		 * make database connection.
		 * take values from the rec which is of type Recommend
		 * update these values into the database
		 * if update was successful, return true, else return false
		 */
		return true;
	}
	
	public boolean updateRecmdnList(String custID) {
		/*
		 * make database connection.
		 * after updating customer preference, a new recommendation list has to be generated 
		 * display this new list to the customer
		 * if update was successful, return true, else return false
		 */
		return true;
	}
	
	public boolean updateWatchedMovieList(List<String> watchedList, String custID) {
		/* make database connection
		 * watchedList contains all the movies that the customer has watched so far
		 * take this list and update it into the database
		 * if update was successful, return true, else return false
		 */
		return true;
	}	
	
	public List<Movie> downloadRecmdedMovieList(String customerID) {
		/*
		 * make database connection
		 * get latest recommendation list from the database
		 * add functionality to download the list obtained
		 * return this list
		 */
		return null;
	}
	
	public boolean updateMovieRating(String movieID, int rating, String custID) {
		/*
		 * make database connection
		 * movieRatingMap has movie id and rating
		 * the database should be updated with new rating for the movieid
		 * if update was successful, return true, else return false
		 */
		return true;
	}
}