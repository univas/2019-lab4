package br.edu.univas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

	public static Connection getConnection() throws SQLException {
	
		String url = "jdbc:postgresql://localhost/lab4";
		
		Properties properties = new Properties();
		properties.setProperty("user", "postgres");
		properties.setProperty("password", "abc123");
		
		return DriverManager.getConnection(url, properties);
	}
	
}
