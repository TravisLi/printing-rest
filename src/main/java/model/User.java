package model;

public class User {

	private String id;
	private String username;
	private String email;
	private String pwd;
	private String role;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User(String id, String username, String email, String pwd, String role) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.pwd = pwd;
		this.role = role;
	}
	
}
