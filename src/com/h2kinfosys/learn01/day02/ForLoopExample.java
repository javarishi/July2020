package com.h2kinfosys.learn01.day02;

public class ForLoopExample {

	public static void main(String[] args) {
		// for(int i = 0; i <= 100; i = i + 10)
		int total = 0;
		for(int i=10; i<=100; i=i+10) {
			total = total + i;
			//System.out.println("Value of i :: " + i);
		}
		//System.out.println("Total :: " + total);
		
		
		// for each - advance for loop
		// Arrays and collections
		String certificate1 = "Java";
		String certificate2 = "Python";
		String certificate3 = "Camel";
		String certificate4 = "aws";
		
		// Object[] --> represents array 
		String[] certificates = {"Java", "Python", "Camel", "aws"};
		System.out.println(certificates);
		/*
		//length - number of items = 4
		//Index starts from 0 ; max_index = length - 1
		for(int index = 0; index < certificates.length; index++) {
			System.out.println(certificates[index]);
		} */
	
		for(String eachCertificate : certificates) {
			System.out.println(eachCertificate);
		}
	}

}
