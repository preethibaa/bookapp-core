package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bookapp.connectionutil.ConnectionUtil;
import com.bookapp.model.User;

public class UserDAO {
	public void register(User user) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pst = connection
				.prepareStatement("INSERT INTO user1 (NAME,email,PASSWORD) VALUES (?,?,?)");
		pst.setString(1, user.getName());
		pst.setString(2, user.getEmailId());
		pst.setString(3, user.getPassword());
		pst.executeUpdate();

	}

	public boolean login(User user) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pst = connection.prepareStatement("SELECT NAME FROM user1 WHERE email=? AND PASSWORD=?");

		pst.setString(1, user.getEmailId());
		pst.setString(2, user.getPassword());
		ResultSet rs = pst.executeQuery();

		boolean flag = false;

		if (rs.next()) {
			flag = true;
		}
		return flag;
	}

	public void update(User user) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pst = connection.prepareStatement("INSERT INTO book (NAME,price) VALUES(?,?)");
		pst.setString(1, user.getName());
		pst.setInt(2, user.getPrice());
		pst.executeUpdate();
	}

	public void updateprice(User user) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pst = connection.prepareStatement("UPDATE book SET price=800 WHERE NAME=?");
		
		pst.executeUpdate();

	}

	public void delete(User user) throws Exception {

		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pst = connection.prepareStatement("DELETE FROM book WHERE NAME=?");
 
		pst.setString(1, user.getName());
		pst.executeUpdate();

	}

	public List<User> findAll() throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pst = connection.prepareStatement("select name,price from books");
		ResultSet rs = pst.executeQuery();

		List<User> users = new ArrayList<>();
		while (rs.next()) {

			User user = new User();
			user.setName(rs.getString(1));
			user.setPrice(rs.getInt(2));
			users.add(user);

		}
		return users;

	}

	public List<User> findByName() throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pst = connection.prepareStatement("SELECT NAME,price FROM book WHERE NAME=?");
		ResultSet rs = pst.executeQuery();

		List<User> users = new ArrayList<>();
		while (rs.next()) {

			User user = new User();
			user.setName(rs.getString(1));
			user.setPrice(rs.getInt(2));
            users.add(user);
		}
		return users;
		

	}
}
