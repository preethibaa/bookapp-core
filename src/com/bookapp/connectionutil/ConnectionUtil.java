package com.bookapp.connectionutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

public static Connection getConnection() throws Exception {
	// TODO Auto-generated method stub
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookapp2", "root", "root");
    return connection;
}
}

