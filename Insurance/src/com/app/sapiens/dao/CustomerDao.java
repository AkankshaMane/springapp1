package com.app.sapiens.dao;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import org.sunbeam.dac.pojo.Movies;

import com.app.sapiens.utils.DBUtils;


public class CustomerDao implements Closeable{
	
	private PreparedStatement statselect,stmtInsert ;
	public CustomerDao() throws Exception {
		Connection connection = DBUtils.getConnection();
		this.statselect = connection.prepareStatement("select * from Movies");
		this.stmtInsert = connection.prepareStatement("insert into Customer(name,age,city,role,) values(?,?,?,?)");
} 
	
	public int insert( Movies movie)throws Exception
	{
		stmtInsert.setString(1, movie.getTitle());
		stmtInsert.setString(2, movie.getDescription());
		stmtInsert.setString(3, movie.getGenre());
		stmtInsert.setInt(4, movie.getRating());
		return stmtInsert.executeUpdate();
	}
	@Override
	public void close() throws IOException {
		try {
			//	connection.close();
			//	ststatselect.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
}
