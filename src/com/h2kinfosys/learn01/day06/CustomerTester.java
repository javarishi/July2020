package com.h2kinfosys.learn01.day06;

public class CustomerTester {

	public static void main(String[] args) {
		//Customer cust = new Customer();

		//cust.validateAddress(address);
		PreferredCustomer pCust = new PreferredCustomer("1293218937","Neil");
		pCust.validateAddress("3375 Spring Hill Pwky");
		pCust.sendDiscountCodes("rishi.h2kinfosys@gmail.com");
		PreferredCustomer.customerStatic(); // method hiding
	}

}
