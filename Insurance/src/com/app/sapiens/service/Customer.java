package com.app.sapiens.service;

public class Customer {
   private  String Name;
   private  String Age;
   private  String City;
   private  String Role;
   private  String MobNo;
  
   
   
public Customer() {
	super();
}
public Customer(String name, String age, String city, String role, String mobNo) {
	super();
	Name = name;
	Age = age;
	City = city;
	Role = role;
	MobNo = mobNo;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAge() {
	return Age;
}
public void setAge(String age) {
	Age = age;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getRole() {
	return Role;
}
public void setRole(String role) {
	Role = role;
}
public String getMobNo() {
	return MobNo;
}
public void setMobNo(String mobNo) {
	MobNo = mobNo;
}
@Override
public String toString() {
	return "Customer [Name=" + Name + ", Age=" + Age + ", City=" + City + ", Role=" + Role + ", MobNo=" + MobNo + "]";
}
   
   
   
}
