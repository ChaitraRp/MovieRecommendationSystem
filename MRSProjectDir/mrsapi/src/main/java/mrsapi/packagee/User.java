package mrsapi.packagee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User {
	
	@Id
	protected String id;
	protected String userId;
	
	protected String username;			//Email id of user.
	protected String password;
	protected Integer accountAlive; 	//0: dead, 1:alive
	protected Integer userType;			// 0: Premium, 1: Normal  2:admin
	
	public User() {
		accountAlive = 1;
		userType = 1;
	}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
		accountAlive = 1;
		userType = 1;
	}
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		this.userId = id;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.id = userId;
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
