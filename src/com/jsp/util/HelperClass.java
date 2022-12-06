package com.jsp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass {

	String url="jdbc:mysql://localhost:3306/aniketdb";
	String username= "root";
	String password= "root";
	
	public Connection getConnection() {
		Connection connection=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		connection=DriverManager.getConnection(url, username , password);
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return connection;
	}
}
