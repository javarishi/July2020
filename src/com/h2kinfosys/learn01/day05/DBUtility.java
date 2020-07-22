package com.h2kinfosys.learn01.day05;

public class DBUtility {

	String connectionURL;
	String userName;
	String password;
	
	public DBUtility() {
		this("java:com:Db:Mysql:3306/sakila", "root", "password");
		System.out.println("making a connection");
	}
	
	public DBUtility(String connString) {
		this(connString, "root", "password");
		System.out.println("making a connection");
	}
	
	public DBUtility(String connectionURL,String userName, String password) {
		if(connectionURL == null) {
			connectionURL = "java:com:Db:Mysql:3306/sakila";
		}
		System.out.println("Connection Logic with User Name and Password");
		System.out.println("Create a Connection with ConnectionURL");
	}
}
