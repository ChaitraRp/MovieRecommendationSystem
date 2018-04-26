package mrsapi.packagee;

import javax.persistence.Id;


public abstract class User {
	
	@Id
	protected String userId;
	protected String username;			//Email id of user.
	protected String password;
	protected Integer accountAlive; 	//0: dead, 1:alive
	protected Integer userType;			// 0: Premium, 1: Normal
	
	public User() {
		accountAlive = 1;
		userType = 1;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAccountAlive() {
		return accountAlive;
	}
	public void setAccountAlive(Integer accountAlive) {
		this.accountAlive = accountAlive;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	
	
}
