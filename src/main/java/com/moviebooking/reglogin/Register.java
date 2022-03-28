package com.moviebooking.reglogin;

public class Register {
	
	private String name;
	private String email;
	private String phoneNo;
	private String password;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.isEmpty()||name.isBlank()) {
			System.out.println("Invalid Name");
		}
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email==null||!email.contains("@gmail.com")){
			System.out.println("Invalid Email");
		}
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		if (phoneNo==null||phoneNo.length()!=10)
			System.out.println("Invalid PhoneNumber");
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password==null||password.length()!=8) {
			System.out.println("Invalid password");
		}
		this.password = password;
	}
	@Override
	public String toString() {
		return "User Registration Detail \nname= "+name +" \nemail= "+email+ "\nphoneNo=" +phoneNo+ "\npassword= "+password +"]";
	}
}
	
	
	


