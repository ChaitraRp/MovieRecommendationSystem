package mrsapi.packagee;

import java.util.List;

public class Recommend {
	
	private String customerId;
	private List<String> genrePrfnceList;
	private List<String> languagePrfrnceList;
	private List<Integer> yearPrfrnceList;
	private List<String> watchedList;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public List<String> getGenrePrfnceList() {
		return genrePrfnceList;
	}
	public void setGenrePrfnceList(List<String> genrePrfnceList) {
		this.genrePrfnceList = genrePrfnceList;
	}
	public List<String> getLanguagePrfrnceList() {
		return languagePrfrnceList;
	}
	public void setLanguagePrfrnceList(List<String> languagePrfrnceList) {
		this.languagePrfrnceList = languagePrfrnceList;
	}
	public List<Integer> getYearPrfrnceList() {
		return yearPrfrnceList;
	}
	public void setYearPrfrnceList(List<Integer> yearPrfrnceList) {
		this.yearPrfrnceList = yearPrfrnceList;
	}
	public List<String> getWatchedList() {
		return watchedList;
	}
	public void setWatchedList(List<String> watchedList) {
		this.watchedList = watchedList;
	}
	
	public List<Movie> getRecmdMovies(String customerId) {
		//TODO
		return null;
	}
	
}
