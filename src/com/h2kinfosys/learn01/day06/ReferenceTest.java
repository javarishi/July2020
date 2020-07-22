package com.h2kinfosys.learn01.day06;

public class ReferenceTest {

	public static void main(String[] args) {
		// ClassName instanceName = new Constructor()
		
		// ReferenceType instanceName = new InstanceType()
		Customer preferredCustomer = new PreferredCustomer("2123123", "RISHI");
		// 1. Visibility of members comes from reference type
		// 2. execution of methods comes from Instance Type
		System.out.println(preferredCustomer.validateAddress("Something"));
		
		// Interfaces can be used as reference type
		Contactable customer = new CreditCardCustomer("2123123", "RISHI");
		
		
	}

}
