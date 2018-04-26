package mrsapi.packagee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository movieRepository;
	
	public void addMovieDetails(Movie mov) {
		try {
			movieRepository.save(mov);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public Boolean updateMovieDetails(Movie mov) {
		try {
			movieRepository.save(mov);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}
		return true;
	}
	
	public Boolean updateMovieRating(String movieID, int rating) {
		try {
			Movie movie = movieRepository.findOne(movieID);
			movie.setRating(rating);
			movieRepository.save(movie);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}
		return true;
	}

	public List<Movie> showAllMovies() {
		List<Movie> movieList = new ArrayList<Movie>();
		
		movieRepository.findAll()
		.forEach(movieList::add);
		
		return movieList;
	}
	
	public Movie getMovieDetails(String movieId) {
		return movieRepository.findOne(movieId);
	}
}