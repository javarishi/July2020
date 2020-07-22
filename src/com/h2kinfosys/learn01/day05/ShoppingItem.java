package com.h2kinfosys.learn01.day05;

public class ShoppingItem {
	
	/*
	 * Constructor - block of code - initialization code 
	 * 1. access modifier
	 * 2. Constructor name - ClassName 
	 * 3. () with input 
	 * 4. Constructor body  {}
	 * 5. Exception - Can throw 
	 */
	
	/* Default constructor - no-arg - no-parameter */
	public ShoppingItem() {
		System.out.println("ShoppingItem First no-arg Constructor");
	}
	/*
	 * Parameterized Constructor 
	 */
	public ShoppingItem(String itemName) {
		this();
		System.out.println(" itemName :: " + itemName);
		
	}
	
	public ShoppingItem(String itemName, int skuNumber) {
		this(itemName);
		System.out.println("ShoppingItem Constructor SKU :: " + skuNumber);
	}

}
