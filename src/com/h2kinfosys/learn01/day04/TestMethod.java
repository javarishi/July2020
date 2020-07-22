package com.h2kinfosys.learn01.day04;

import java.util.Date;

public class TestMethod {
	
	public static void main(String[] args) {
		
		if(args != null && args.length > 0) {
			for (String eachArg : args) {
				System.out.println(eachArg);
			}
		}
		
		TestMethod test = new TestMethod();
		test.validateAddress("40405");
		
		dateValidation(new Date());
	}

	public static String dateValidation(Date date) {
		System.out.println(date);
		return null;
	}
	
	/*
	 * Method - block of code - reusable 
	 * 1. access modifier
	 * 2. return type - output (object, primitive, void) - return statement
	 * 3. method name - camelCase - logical 
	 * 4. () with input 
	 * 5. Method body - with return statement {}
	 * 6. Exception 
	 */
	public String validateAddress(String address) {
		String result = null;
		if(address != null && address.length() > 0) {
			result = "Address is Valid";
		}
		return result;
	}
	

	public String validateAddress(int zipCode) {
		String result = null;
		// String.valueOf - converts any primitive to String
		if(zipCode > 0 && (String.valueOf(zipCode)).length() == 5) {
			result = "Address is Valid";
		}
		return result;
	}
	
		
	// Method overloading - validateAddress - overloaded
	// Difference in Parameters - number of parameters or type of parameter
	public String validateAddress(String address, int zipCode) {
		String result = null;
		if(address != null && address.length() > 0) {
			result = "Address is Valid";
		}
		return result;
	}
	
	
		// bill - 4 shopping cart - calculateTotal
		public float calculateTotal(float[] prices) {
			float total = 0;
			for (float eachPrice : prices) {
				total = total + eachPrice;
			}
			return total;
		}
}
