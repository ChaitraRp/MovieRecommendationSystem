package moviePackage;

public class Admin extends User {
	
	private int role;

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
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
