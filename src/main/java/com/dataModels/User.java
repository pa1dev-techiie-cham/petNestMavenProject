package com.dataModels;

public class User {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		return true;
	}
	private String Fullname;
	 private String Email;
	 private  String Password;
	 private  String phonenumber;
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
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
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public User(String fullname, String email, String password, String phonenumber) {
		super();
		this.Fullname = fullname;
		this.Email = email;
		this.Password = password;
		this.phonenumber = phonenumber;
	}
	public User() {
		
	}
	@Override
	public String toString() {
		return "UserRegistration [Fullname=" + Fullname + ", Email=" + Email + ", Password=" + Password
				+ ", phonenumber=" + phonenumber + "]";
	}
}
