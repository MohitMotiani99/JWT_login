package io.springsecurityjwt;

public class ReturnObject {
	private String username;
	private String pass;
	private String jToken;
	private boolean success;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getjToken() {
		return jToken;
	}
	public void setjToken(String jToken) {
		this.jToken = jToken;
	}
	
	
	
}
