package mrsapi.packagee;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecommendationService {
	
	@Autowired
	public CustomerRepository customerRepository;
	
	@Autowired
	private MovieService movieService;
	
	public Boolean updateCsmtPrefnce(Recommend rec) {
		
		try {
			Customer customer = customerRepository.findOne(rec.getCustomerId());
			
			if (customer != null) {
				String newGenrePreferance = mergeTwoItems(rec.getGenrePrfnce(), customer.getGenrePrfnce());
				customer.setGenrePrfnce(newGenrePreferance);
				
				String newLanguagePreferance = mergeTwoItems(customer.getLanguagePrfnce(), rec.getLanguagePrfrnce());
				customer.setLanguagePrfnce(newLanguagePreferance);
				
				String newYearPreferance = mergeTwoItems(customer.getYearPrfnce(), rec.getYearPrfrnce());
				customer.setYearPrfnce(newYearPreferance);
				
				customerRepository.save(customer);
				return true;
			}
			return false;
		} catch(Exception e) {
			System.out.println("Error while updating customer preferance: " + e.getMessage());
			return false;
		}
	}
	
	public Boolean updateRecmdnList(String custID) {
		/*
		 * make database connection.
		 * after updating customer preference, a new recommendation list has to be generated 
		 * display this new list to the customer
		 * if update was successful, return true, else return false
		 */
		return null;
	}
	
	public Boolean updateWatchedMovieList(String watchedList, String custID) {
		try {
			Customer customer = customerRepository.findOne(custID);
			if (customer != null) {
				String movies = customer.getWatchedList();
				String updateMovieList = mergeTwoItems(movies, watchedList);
				
				System.out.println("Old Movie list: " + movies);
				System.out.println("New Movie list: " + watchedList);
				System.out.println("Final Movie list: " + updateMovieList);
				
				customer.setWatchedList(updateMovieList);
				customerRepository.save(customer);
				return true;
			}
			return false;
		} catch(Exception e) {
			System.out.println("Error while updating customer preferance: " + e.getMessage());
			return false;
		}
	}	
	
	private String mergeTwoItems(String str, String str1) {
		List<String> itemList = null;
		if (str != null && str.length() > 0) {
			String[] items = str.split(",");
			itemList = Arrays.asList(items);
		}
		return mergeTwoItems(str1, itemList);
	}
	
	private String mergeTwoItems(String str, List<String> list) {
		
		String[] items = str.split(",");
		List<String> itemList = Arrays.asList(items);
		Set<String> set = new HashSet<>();
		set.addAll(itemList);
		
		StringBuilder strb = new StringBuilder();
		
		if (list != null) {
			for (String item : list) {
				set.add(item);
			}
		}
		
		for (String item: set) {
			strb.append(item).append(",");
		}
		strb.deleteCharAt(strb.length() -1);
		return strb.toString();
		
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
	
	private void getNotWatchedList(List<Movie> movies, List<String> watchedList) {
		for (int i = 0; i < movies.size(); i++) {
			if (watchedList.contains(movies.get(i).getId())) {
				movies.remove(i);
			}
		}
	}
	
	public List<Movie> getRecmdMovies(String customerId) {
		List<Movie> recommendedMovie = null;
		List<Movie> movieList = null;
		try {
			Customer customer = customerRepository.findOne(customerId);
			movieList = movieService.showAllMovies();
			
			if (customer != null) {
				String yearPreferanceStr = customer.getYearPrfnce();
				String languagePreferanceStr = customer.getLanguagePrfnce();
				String genrePreferanceStr = customer.getGenrePrfnce();
				String watchedListStr = customer.getWatchedList();
				
				List<String> yearPreferance = Arrays.asList(yearPreferanceStr.split(","));
				List<String> languagePreferance = Arrays.asList(languagePreferanceStr.split(","));
				List<String> genrePreferance = Arrays.asList(genrePreferanceStr.split(","));
				List<String> watchedList = Arrays.asList(watchedListStr.split(","));
				
				getNotWatchedList(movieList, watchedList);
				
				for (int i= 0; i < movieList.size(); i++) {
					Movie movie = movieList.get(i);
					if ( (!genrePreferance.contains(movie.getGenre())) && 
							(!languagePreferance.contains(movie.getLanguage())) && 
							(!yearPreferance.contains(movie.getYyear()))) {
						movieList.remove(i);
					}
				}
				return movieList;
			}
			return recommendedMovie;
		} catch(Exception e) {
			System.out.println("Error while recommending movies to customer: " + e.getMessage());
			return recommendedMovie;
		}
	}
}