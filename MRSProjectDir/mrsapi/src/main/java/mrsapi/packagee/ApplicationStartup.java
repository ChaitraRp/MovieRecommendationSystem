package mrsapi.packagee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ApplicationStartup {
	
	@Autowired
	static MovieService movieService;

	public static List<String> genres = new ArrayList<String>();
	public static List<Integer> years = new ArrayList<Integer>();
	public static List<String> languages = new ArrayList<String>();
	
	private static void loadGenres() {
		genres.add("Action");
		genres.add("Adventure");
		genres.add("Animation");
		genres.add("Biography");
		genres.add("Comedy");
		genres.add("Crime");
		genres.add("Documentary");
		genres.add("Drama");
		genres.add("Family");
		genres.add("Fantasy");
		genres.add("Film Noir");
		genres.add("History");
		genres.add("Horror");
		genres.add("Music");
		genres.add("Musical");
		genres.add("Mystery");
		genres.add("Romance");
		genres.add("Sci-Fi");
		genres.add("Short");
		genres.add("Sport");
		genres.add("Superhero");
		genres.add("Thriller");
		genres.add("War");
		genres.add("Western");
	}
	
	private static void loadYears() {
		for (int i = 1925; i < 2015; i++) {
			years.add(i);
		}
	}
	
	private static void loadLanguage() {
		languages.add("English");
		languages.add("Hindi");
		languages.add("Telugu");
	}
	
	@RequestMapping("/")
	public String start() {
		return "Welcome to Movie Recommendation System";
	}
	
	public static void addMovieDetails() {
		String files = "/home/vipra/MovieRecommendationSystem/IMDB_data.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(files))) {

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				
				Movie movie = new Movie();
				movieService.addMovieDetails(movie);
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	public static void main(String[] args) {
		addMovieDetails();
		loadGenres();
		loadYears();
		loadLanguage();
		SpringApplication.run(CustomerController.class, args);
	}
}
