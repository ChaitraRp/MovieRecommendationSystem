package moviePackage;

import java.util.List;

public class Customer extends User{

	private String name;
	private String phoneNum;
	private boolean isPremiumCustomer;
	private List<Recommend> recmdMovieList;
	
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

	public boolean isPremiumCustomer() {
		return isPremiumCustomer;
	}

	public void setPremiumCustomer(boolean isPremiumCustomer) {
		this.isPremiumCustomer = isPremiumCustomer;
	}

	public List<Recommend> getRecmdMovieList() {
		return recmdMovieList;
	}

	public void setRecmdMovieList(List<Recommend> recmdMovieList) {
		this.recmdMovieList = recmdMovieList;
	}

	@Override
	public boolean updatePassword(String pwd) {
		// TODO 
		return false;
	}

	@Override
	public boolean isValidUser() {
		// TODO 
		return false;
	}
	
}
