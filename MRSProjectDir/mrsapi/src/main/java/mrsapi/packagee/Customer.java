package mrsapi.packagee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer extends User {

	
	@Id
	protected String id;
	private String name;
	private String phoneNum;
	int planId;		//{0: NormalCustomer, 3: 3months, 6: 6months, 9: 9months, 1:1year}
	String languagePrfnce;
	String yearPrfnce;
	String genrePrfnce;
	
	
	public Customer() {
		super();
		planId = 0;
	}
	
	public Customer(String customerId, String username, String password, String name, String phoneNum) {
		super(username, password);
		this.name = name;
		this.phoneNum = phoneNum;
		setCustomerId(customerId);
	}
	
	public String getLanguagePrfnce() {
		return languagePrfnce;
	}

	public void setLanguagePrfnce(String languagePrfnce) {
		this.languagePrfnce = languagePrfnce;
	}

	public String getYearPrfnce() {
		return yearPrfnce;
	}

	public void setYearPrfnce(String yearPrfnce) {
		this.yearPrfnce = yearPrfnce;
	}

	public String getGenrePrfnce() {
		return genrePrfnce;
	}

	public void setGenrePrfnce(String genrePrfnce) {
		this.genrePrfnce = genrePrfnce;
	}

	private void setCustomerId(String customerId) {
		setUserId(customerId);
		this.id = customerId;
	}

	public String getCustomerId() {
		return getUserId();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}
}
