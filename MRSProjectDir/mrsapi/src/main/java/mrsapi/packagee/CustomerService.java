package mrsapi.packagee;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csvreader.CsvReader;

@Service
public class CustomerService extends UserService {
	
	@Autowired
	public CustomerRepository customerRepository;
	
	public Boolean signUpUser(Customer customer) {
		try {
			customerRepository.save(customer);
		} catch (Exception e) {
			System.out.println("Error while signing up user: " + e.getMessage());
			return false;
		}
		return true;
	}
	
	public Boolean deleteCustomerAccount(Customer customer) {
		try {
			customerRepository.delete(customer);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			return false;
		}
		return true;
	}
	
	public void updateCustomerPlan(Customer customer) {
		customerRepository.save(customer);
	}
	

	public Customer displayCustomerDetails(String custID) {
		return customerRepository.findOne(custID);
	}
	
	public Movie getMovieDetails(String movieId) {
		return movieService.getMovieDetails(movieId);
	}
	
	public String doWork() throws IOException {
		try {
			loadMovieData();
			loadCustomerData();
		} catch (Exception e) {
			System.out.println("Error while loading data");
			return "Loading data failed";
		}
		
		return "Movie & Customer data loaded";
	}
	
	private void loadMovieData() throws IOException {
		String files = "/home/vipra/MovieRecommendationSystem/IMDB_data.csv";
		Movie movie = null;
        
		try {
	        CsvReader products = new CsvReader(files);
			products.readHeaders();
	
			while (products.readRecord())
			{
				String plot = products.get("Plot");
				String title = products.get("Title");
				String imdbVotes = products.get("imdbVotes");
				String imdbRating = products.get("imdbRating");
				String genre = products.get("Genre");
				String imdbID = products.get("imdbID");
				String year = products.get("Year");
				String language = products.get("Language");
				
				
				System.out.println();
				System.out.println();
				System.out.println("plot: " + plot);
				System.out.println("title: " + title);
				System.out.println("votes: " + imdbVotes);
	            System.out.println("rating: " + imdbRating);
				System.out.println("genre: " + genre);
				System.out.println("id: " + imdbID);
	            System.out.println("year: " + year);
				System.out.println("lang: " + language);
				
				System.out.println();
				System.out.println();
				
				movie = new Movie(imdbID, plot, title, imdbVotes, imdbRating, genre, year, language);
				movieService.addMovieDetails(movie);
			}
	
			products.close();
			System.out.println("Loaded Movie data");
		} catch (Exception e) {
			System.out.println("Error while loading Customer data" + e.getMessage());
		}
	}
	
	private void loadCustomerData() throws IOException {
		String files = "/home/vipra/MovieRecommendationSystem/CustomerDetails.csv";
		Customer customer = null;
       
		try {
	        CsvReader products = new CsvReader(files);
			products.readHeaders();
	
			while (products.readRecord())
			{
				String id = products.get("id");
				String username = products.get("username");
				String password = products.get("password");
				String name = products.get("name");
				String phoneNum = products.get("phoneNum");
				
				System.out.println();
				System.out.println();
				System.out.println("id: " + id);
				System.out.println("username: " + username);
				System.out.println("password: " + password);
	            System.out.println("name: " + name);
				System.out.println("phoneNum: " + phoneNum);
				
				System.out.println();
				System.out.println();
	
				customer = new Customer(id, username, password, name, phoneNum);
				signUpUser(customer);
			}
	
			products.close();
		} catch (Exception e) {
			System.out.println("Error while loading Customer data" + e.getMessage());
		}
		
		System.out.println("Loaded customer data");
	}
}