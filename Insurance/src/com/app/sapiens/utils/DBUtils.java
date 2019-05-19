package com.app.sapiens.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {

	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/DAC1?useSSL=false";
	public static final String USER = "akanksha";
	public static final String PASSWORD = "akanksha";
	
	private static Connection connection;
	public static Connection getConnection()throws Exception
	{
		Class.forName(DRIVER);
		connection = DriverManager.getConnection(URL, USER, PASSWORD);
		return connection;
	}
	public static void closeConnection( )throws Exception
	{
		if(connection != null )
			connection.close();
	}
}
