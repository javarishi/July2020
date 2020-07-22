package com.h2kinfosys.learn01.day05;

import com.h2kinfosys.learn01.day06.Customer;

public class InheritanceTester extends Customer{

	public InheritanceTester(String ssn, String firstName) {
		super(ssn, firstName);
		System.out.println("Contract for Months :: " + contractPeriodInMonths);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Customer cust = new Customer();
		// cust. <-- protected variables Not accessible 
		InheritanceTester tester = new InheritanceTester("210398129038", "Rishi");
		// variables are accessible becoz they are protected
		tester.firstName = "Rishi";
	}

	@Override
	public void sendDiscountCodes(String emailAddress) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String signConsent(boolean isSigned) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
