package com.bookapp.model;

public class User {
	private int id;
	private String name;
	private String email_id;
	private String password;
	private int active;
	private int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return email_id;
	}
	public void setEmailId(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public String toString()
	{
		return "id:"+id+"name:"+name+"email_id:"+email_id+"password"+password+"active"+active;
		
	}
	
	
		// TODO Auto-generated method stub
		
	

}
