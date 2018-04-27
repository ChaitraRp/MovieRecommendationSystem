package mrsapi.packagee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {
	
	@Autowired
	private RecommendationService recmdService;
	
	
	@RequestMapping(method=RequestMethod.POST, value="/updatePreferences")
	public String updatePreferences(@RequestBody Recommend recommend) {
		if (recmdService.updateCsmtPrefnce(recommend)) {
			return "Customer Preferances Updated";
		}
		return "Failed to update Customer Preferances";
	}
	
	@RequestMapping("/updateWatchedMovieList/{watchedMovieList}/{custID}")
	public String  updateWatchedMovieList(@PathVariable String watchedMovieList, @PathVariable  String custID) {
		if (recmdService.updateWatchedMovieList(watchedMovieList, custID)) {
			return "Sucessfully Updated Watched Movie List";
		}
		return "Failed to update Watched Movie List";
	}

	@RequestMapping("/getRecommendedMovies/{custID}")
	public List<Movie> getRecommendedMovies(@PathVariable String custID) {
		return recmdService.getRecmdMovies(custID);
	}
	
	
	public void updateMovieRating(String movieID, int rating, String custID) {
		//TODO
	}
	
	public void downloadRecmdedMovieList(String custId) {
		//TODO
	}
}