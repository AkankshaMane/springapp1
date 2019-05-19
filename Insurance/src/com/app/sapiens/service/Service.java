package com.app.sapiens.service;

import java.util.Scanner;

import org.sunbeam.dac.Dao.MovieDao;

import com.app.sapiens.dao.CustomerDao;

public class Service implements ServiceInt{

	
	static Customer customer = new Customer();
	static Scanner sc = new Scanner(System.in);


	
	
	@Override
	public void acceptRecord() {
		System.out.println("Enter name");
	    customer.setName(sc.next());
		System.out.println("Age");
		customer.setAge(sc.next());
		System.out.println("City");
		customer.setCity(sc.next());
		System.out.println("Role");
		customer.setAge(sc.next());
		System.out.println("Mobno.");
		customer.setMobNo(sc.next());
		
		try( CustomerDao dao = new CustomerDao())
		{
			dao.insert(customer);
			
		}
		catch( Exception ex )
		{
			ex.printStackTrace();
		}
		
	}
	

	
}
