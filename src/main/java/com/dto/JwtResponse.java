package com.dto;



public class JwtResponse {
	
	private String token;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public JwtResponse(String token, String email) {
		super();
		this.token = token;
		this.email = email;
	}
	public JwtResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
