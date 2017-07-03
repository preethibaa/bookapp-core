package com.bookapp.dao;

import com.bookapp.model.User;

public class TestUserDAO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User();
		user.setName("priya");
		user.setEmailId("d@gmail.com");
		user.setPassword("asdf");
		UserDAO dao=new UserDAO();
		dao.register(user);

	}

}
