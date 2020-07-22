package com.h2kinfosys.learn01.day03;

public class Tester {

	public static void main(String[] args) {
		
		int total = 0; // Local Variable
		System.out.println(total);
		// Cumberland Prky - 121
		// ClassName instanceName = new ClassName();
		Store store121 = new Store();
		Store.companyName = "The Home Depot Inc";
		
		store121.storeName = "Cumberland Store";
		store121.storeNumber = 121;
		store121.capabilities = "Truck Rental";
		// store121.legalRegistrationNumber = "324234234"; - private variable
		
		// Spring Hill Pwky - 111
		Store store111 = new Store();
		store111.storeName = "Spring Hill Store";
		store111.storeNumber = 111;
		
		System.out.println(store121.capabilities + " " + store121.companyName);
		System.out.println(store111.capabilities+ " " + store111.companyName);
		
	}

}
