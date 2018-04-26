package mrsapi.packagee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RcmdController")
public class RecommendationController {
	
	@Autowired
	private RecommendationService recmdService;
	
	
	public void updatePreferences(List<String> genreList, List<String> languageList, List<Integer> yearList, String custID) {
		Recommend rec = new Recommend();
		rec.setGenrePrfnceList(genreList);
		rec.setLanguagePrfrnceList(languageList);
		rec.setYearPrfrnceList(yearList);
		recmdService.updateCsmtPrefnce(rec, custID);
	}
	
	public void updateWatchedMovieList(List<String> watchedMovieList,  String custID) {
		recmdService.updateWatchedMovieList(watchedMovieList, custID);
	}

	public void updateMovieRating(String movieID, int rating, String custID) {
		//TODO
	}
	
	public void downloadRecmdedMovieList(String custId) {
		//TODO
	}
}