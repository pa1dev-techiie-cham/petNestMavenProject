package com.dataModels;

public class Login {
	private String Email;
	private String Password;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Login() {
		super();
	}
	@Override
	public String toString() {
		return "LoginClass [Email=" + Email + ", Password=" + Password + "]";
	}
}
