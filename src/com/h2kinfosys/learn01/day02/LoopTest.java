package com.h2kinfosys.learn01.day02;

public class LoopTest {

	public static void main(String[] args) {
		// Two Type
		// Do not know iteration number - working on condition
		// init control
		/*
		 * while(condition){
		 * 		block executes till condition is true
		 * 		update - for condition (loop will be endless if you dont update it)
		 * }
		 */
		// Addition 10 - 100
		int total = 0;
		int counter = 10;
		while(counter <= 100) {
			total = total + counter;
			System.out.println("Counter Value :: " + counter);
			counter = counter + 10; // Update
		}
		System.out.println("while Total :: " + total);
		System.out.println("while Counter Value :: " + counter);
		
		// do - block of code 
		// while (condition)
		total = 0;
		counter = 10;
		do {
			total = total + counter;
			System.out.println("Counter Value :: " + counter);
			counter = counter + 10; // Update
		}while(counter <= 100);
		System.out.println("DoWhile Total :: " + total);
		System.out.println("DoWhile Counter Value :: " + counter);
		
		
	}

}
