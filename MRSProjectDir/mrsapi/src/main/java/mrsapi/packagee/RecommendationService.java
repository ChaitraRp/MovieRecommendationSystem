package mrsapi.packagee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
		} catch (Exception e) {
			System.out.println("Error while updating customer preferance: " + e.getMessage());
			return false;
		}
	}

	public Boolean updateRecmdnList(String custID) {
		/*
		 * make database connection. after updating customer preference, a new
		 * recommendation list has to be generated display this new list to the customer
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
		} catch (Exception e) {
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
		return mergeTwoItems(itemList, str1);
	}

	private String mergeTwoItems(List<String> list, String str) {
		Set<String> set = new HashSet<>();
		StringBuilder strb = new StringBuilder();

		if (str != null) {
			String[] items = str.split(",");
			List<String> itemList = Arrays.asList(items);
			set.addAll(itemList);
		}

		if (list != null) {
			for (String item : list) {
				set.add(item);
			}
		}

		for (String item : set) {
			strb.append(item).append(",");
		}
		strb.deleteCharAt(strb.length() - 1);
		return strb.toString();

	}

	public List<Movie> downloadRecmdedMovieList(String customerID) {
		/*
		 * make database connection get latest recommendation list from the database add
		 * functionality to download the list obtained return this list
		 */
		return null;
	}

	private void getNotWatchedList(List<Movie> movies, List<String> watchedList) {
		if (movies != null && watchedList != null)
			for (int i = 0; i < movies.size(); i++) {
				if (watchedList.contains(movies.get(i).getId())) {
					movies.remove(i);
				}
			}
	}

	private Map<String, Movie> convertListToMap(List<Movie> movieList) {
		Map<String, Movie> movieMap = new HashMap<String, Movie>();
		
		for (Movie movie: movieList) {
			movieMap.put(movie.getId(), movie);
		}
		
		return movieMap;
	}
	
	public List<Movie> getRecmdMovies(String customerId) {
		List<Movie> movieList = null;
		Map<String, Movie> movieMap = null;
		try {
			Customer customer = customerRepository.findOne(customerId);
			movieList = movieService.showAllMovies();
			movieMap = convertListToMap(movieList);
			
			System.out.println("Total Movies in the database: " + movieList.size());

			if (customer != null) {
				String yearPreferanceStr = customer.getYearPrfnce();
				String languagePreferanceStr = customer.getLanguagePrfnce();
				String genrePreferanceStr = customer.getGenrePrfnce();
				String watchedListStr = customer.getWatchedList();
				List<String> yearPreferance = null;
				List<String> languagePreferance = null;
				List<String> genrePreferance = null;
				List<String> watchedList = null;

				if (yearPreferanceStr != null)
					yearPreferance = Arrays.asList(yearPreferanceStr.split(","));
				if (languagePreferanceStr != null)
					languagePreferance = Arrays.asList(languagePreferanceStr.split(","));

				if (genrePreferanceStr != null)
					genrePreferance = Arrays.asList(genrePreferanceStr.split(","));

				if (watchedListStr != null)
					watchedList = Arrays.asList(watchedListStr.split(","));

				getNotWatchedList(movieList, watchedList);
				System.out.println("Number of Movies after removing watched movies: "+ movieList.size());

				for (int i = 0; i < movieList.size(); i++) {
					Movie movie = movieList.get(i);

					if (yearPreferance != null) {
						if (!yearPreferance.contains(movie.getYyear())) {
							movieMap.remove(movie.getId());
							continue;
						}
					}
					List<String> movieLanguage = Arrays.asList(movie.getLanguage().split(","));

					if (languagePreferance != null) {
						if (!containsElementOfList(languagePreferance, movieLanguage)) {
							movieMap.remove(movie.getId());
							continue;
						}
					}
					
					List<String> movieGenres = Arrays.asList(movie.getGenre().split(","));

					if (genrePreferance != null) {
						if (!containsElementOfList(genrePreferance, movieGenres)) {
							movieMap.remove(movie.getId());
						}
					}
				}
				System.out.println("Number of Movies recommended: "+ movieMap.size());
				List<Movie> list = new ArrayList<Movie>(movieMap.values());
				return list;
			}
			List<Movie> list = new ArrayList<Movie>(movieMap.values());
			return list;
		} catch(Exception e)
			{
				System.out.println("Error while recommending movies to customer: " + e.getMessage());
				List<Movie> list = new ArrayList<Movie>(movieMap.values());
				return list;
			}
	}

	private boolean containsElementOfList(List<String> preferance, List<String> movieInfo) {

		for (String info : movieInfo) {
			if (preferance.contains(info)) {
				return true;
			}
		}
		return false;
	}
}