package moviePackage;

public class MovieService {
	public void addMovieDetails(Movie mov) {
		/*
		 * make database connection.
		 * fetch all details from the Movie class and add this to the database
		 */
	}
	
	public Boolean updateMovieDetails(Movie mov) {
		/*
		 * make database connection.
		 * take movieid from Movie and update that particular row in database
		 * if update is successful, return true, else return false
		 */
		return null;
	}
	
	public Boolean updateMovieRating(String movieID, int rating) {
		/*
		 * make database connection
		 * movieRatingMap has movie id and rating
		 * the database should be updated with new rating for the movieid
		 * if update was successful, return true, else return false
		 */
		return null;
	}

	public void showAllMovies() {
		/*
		 * make database connection
		 * select all movies from movie table
		 * display the list.
		 */
	}
}