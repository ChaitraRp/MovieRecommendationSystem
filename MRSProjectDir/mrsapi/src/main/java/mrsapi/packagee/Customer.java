package mrsapi.packagee;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Customer extends User {

	private String name;
	private String phoneNum;
	private int customerType;		// 0: Premium, 1: Normal
	int planId;		//{0: NormalCustomer, 3: 3months, 6: 6months, 9: 9months, 1:1year}
	private List<Recommend> recmdMovieList;
	
	public Customer() {
		super();
		customerType = 1;
		planId = 0;
	}
	
	public Customer(String name, String phoneNum, int customerType, int planId, List<Recommend> recmdMovieList) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.customerType = customerType;
		this.planId = planId;
		this.recmdMovieList = recmdMovieList;
	}

	public int getCustomerType() {
		return customerType;
	}

	public void setCustomerType(int customerType) {
		this.customerType = customerType;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getName() {
		return name;
	}

	public String getCustomerId() {
		return getUserId();
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

	public int getCutomerType() {
		return customerType;
	}

	public void setCutomerType(int cutomerType) {
		this.customerType = cutomerType;
	}

	public List<Recommend> getRecmdMovieList() {
		return recmdMovieList;
	}

	public void setRecmdMovieList(List<Recommend> recmdMovieList) {
		this.recmdMovieList = recmdMovieList;
	}
	
}
