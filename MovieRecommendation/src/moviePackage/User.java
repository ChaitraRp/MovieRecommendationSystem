package moviePackage;

public abstract class User {
	protected String username;
	protected String password;
	protected String userId;
	protected Boolean accountAlive;
	protected int userType;
	
	public abstract boolean updatePassword(String pwd);
	
	public abstract boolean isValidUser();
	
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
