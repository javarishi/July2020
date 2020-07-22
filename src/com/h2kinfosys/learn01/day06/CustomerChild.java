package com.h2kinfosys.learn01.day06;

public class CustomerChild extends Customer{

	public CustomerChild(String ssn, String firstName) {
		super(ssn, firstName);
		// TODO Auto-generated constructor stub
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
