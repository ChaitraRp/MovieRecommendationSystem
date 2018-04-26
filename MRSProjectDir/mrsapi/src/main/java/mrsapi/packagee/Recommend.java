package mrsapi.packagee;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recommend {
	
	@Id
	private String id;
	private String customerId;
	private List<String> genrePrfnceList;
	private List<String> languagePrfrnceList;
	private List<Integer> yearPrfrnceList;
	private List<MoviesWatched> watchedList;
	
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
	public List<MoviesWatched> getWatchedList() {
		return watchedList;
	}
	public void setWatchedList(List<MoviesWatched> watchedList) {
		this.watchedList = watchedList;
	}
}
