package mrsapi.packagee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableJpaRepositories
@RestController
@RequestMapping("/")
public class ApplicationStartup {

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
	
	
	public static void main(String[] args) {
		loadGenres();
		loadYears();
		loadLanguage();
		SpringApplication.run(CustomerController.class, args);
	}
}
