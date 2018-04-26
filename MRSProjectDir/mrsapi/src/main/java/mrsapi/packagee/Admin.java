package mrsapi.packagee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin extends User {

	
	@Id
	protected String id;
	private int role;
	
	public Admin() {
		role = 0;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	
	
}
	