package mrsapi.packagee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recommend {
	
	@Id
	private String id;
	private String customerId;
	private String genrePrfnceList;
	private String languagePrfrnceList;
	private String yearPrfrnceList;
	private String watchedList;
	
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getGenrePrfnceList() {
		return genrePrfnceList;
	}
	public void setGenrePrfnceList(String genrePrfnceList) {
		this.genrePrfnceList = genrePrfnceList;
	}
	public String getLanguagePrfrnceList() {
		return languagePrfrnceList;
	}
	public void setLanguagePrfrnceList(String languagePrfrnceList) {
		this.languagePrfrnceList = languagePrfrnceList;
	}
	public String getYearPrfrnceList() {
		return yearPrfrnceList;
	}
	public void setYearPrfrnceList(String yearPrfrnceList) {
		this.yearPrfrnceList = yearPrfrnceList;
	}
	public String getWatchedList() {
		return watchedList;
	}
	public void setWatchedList(String watchedList) {
		this.watchedList = watchedList;
	}
	
	
}
