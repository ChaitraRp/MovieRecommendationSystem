package moviePackage;

import java.util.List;

public class RecommendationController {
	private RecommendationService recmdService = new RecommendationService();
	
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
		recmdService.updateMovieRating(movieID, rating, custID);
	}
	
	public void downloadRecmdedMovieList(String custId) {
		recmdService.downloadRecmdedMovieList(custId);
	}
}