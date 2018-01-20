package dto;

public class Login {
	private String adminName;
	private String adminPass;
	
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPass() {
		return adminPass;
	}
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	@Override
	public String toString() {
		return "Login [adminName=" + adminName + ", adminPass=" + adminPass + "]";
	}
	
}