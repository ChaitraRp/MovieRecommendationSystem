package mrsapi.packagee;

import javax.persistence.Id;


public abstract class User {
	
	@Id
	protected String userId;
	protected String username;		//Email id of user.
	protected String password;
	protected Boolean accountAlive;
	protected int userType;
	
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Boolean getAccountAlive() {
		return accountAlive;
	}
	public void setAccountAlive(Boolean accountAlive) {
		this.accountAlive = accountAlive;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}

	
}
