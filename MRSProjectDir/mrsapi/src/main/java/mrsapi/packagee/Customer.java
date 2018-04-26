package mrsapi.packagee;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Customer extends User {

	private String name;
	private String phoneNum;
	private int cutomerType;		// 0: Premium, 1: Normal
	private List<Recommend> recmdMovieList;
	
	public Customer() {
		super();
		cutomerType = 1;
	}
	
	public Customer(String name, String phoneNum, int cutomerType, List<Recommend> recmdMovieList) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.cutomerType = cutomerType;
		this.recmdMovieList = recmdMovieList;
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
		return cutomerType;
	}

	public void setCutomerType(int cutomerType) {
		this.cutomerType = cutomerType;
	}

	public List<Recommend> getRecmdMovieList() {
		return recmdMovieList;
	}

	public void setRecmdMovieList(List<Recommend> recmdMovieList) {
		this.recmdMovieList = recmdMovieList;
	}
	
}
