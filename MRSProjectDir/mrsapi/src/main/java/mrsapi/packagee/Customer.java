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
	
	
	//private List<Recommend> recmdMovieList;
	
	public Customer() {
		super();
		planId = 0;
	}
	
	public Customer(String name, String phoneNum, int planId) {//, List<Recommend> recmdMovieList) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.planId = planId;
		//this.recmdMovieList = recmdMovieList;
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
