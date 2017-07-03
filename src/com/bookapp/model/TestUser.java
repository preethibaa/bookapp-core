package com.bookapp.model;

public class TestUser {

	public static void main(String[] args) {
		User user= new User();
		user.setId(1);
		System.out.println(user.getId());
		user.setName("preethi");
		System.out.println(user.getName());
		user.setEmailId("preethi@gmail.com");
		System.out.println(user.getEmailId());
		user.setPassword("pass");
		System.out.println(user.getPassword());
		user.setActive(1);
		System.out.println(user.getActive());
		user.setPrice(100);
		System.out.println(user.getPrice());

		

	}

}
