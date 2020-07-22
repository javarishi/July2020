package com.h2kinfosys.learn01.day06;

import java.io.Serializable;

public abstract class Customer 
			extends Person
			implements Contactable, Comparable<Customer>, Serializable{
	

	public Customer(String ssn, String firstName) {
		super(ssn);
		System.out.println("Customer Constructor :: " + firstName);
		this.firstName = firstName;
	}
	// Properties
	protected String firstName;
	protected String lastName;
	protected String address;
	
	// methods
	boolean validateAddress(String address) {
		if(address != null && address.length() > 0) {
			return true;
		}
		return false;
	}
	
	public static void customerStatic() {
		System.out.println("Customer Static Method");
	}
	
	
	/*
	 * 1. abstract - I will enforce first non-abstract child to give implementation 
	 * 2. abstract method will not have method body
	 * 3. abstract methdos will be defined in abstract classes only
	 */
	public abstract void sendDiscountCodes(String emailAddress);
	
	
	
	
	
	
	
	
	
}
