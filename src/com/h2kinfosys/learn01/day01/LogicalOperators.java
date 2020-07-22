package com.h2kinfosys.learn01.day01;

public class LogicalOperators {

	public static void main(String[] args) {
		int firstData = 100;
		int secondData = 20;
		int thirdData = 300;
		
		boolean firstCheck = firstData > secondData;
		boolean secondCheck = firstData > thirdData;
		
		// Mathematical AND &&
		/*
		 * S1	S2	S1&S2
		 * T	T	T
		 * T	F	F
		 * F	T	F
		 * F	F	F
		 */
		boolean result = firstCheck && secondCheck;
		System.out.println(firstCheck + " && " + secondCheck + " is " + result);

		// Mathematical OR
		/*
		 * S1	S2	S1 || S2
		 * T	T		T
		 * T	F		T
		 * F	T		T
		 * F	F		F
		 */
		boolean orResult = firstCheck || secondCheck;
		System.out.println(firstCheck + " || " + secondCheck + " is " + orResult);
		
		// Mathematical NOT
		System.out.println("NOT orResult " + !false);
	}

}
