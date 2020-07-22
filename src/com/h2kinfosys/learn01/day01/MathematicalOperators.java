package com.h2kinfosys.learn01.day01;

public class MathematicalOperators {

	public static void main(String[] args) {
		// + - * / %
		int firstData = 100;
		int secondData = 20;
		
		System.out.println("Addition  " + (firstData + secondData));
		System.out.println("Substraction :: " + (firstData - secondData));
		System.out.println("Multiplication :: " + (firstData * secondData));
		System.out.println("Division :: " + (firstData / secondData));
		System.out.println("Modulus :: " + (firstData % secondData));
		
		// increment ++ 
		System.out.println(firstData++); // use the existing value then increase the value by 1 
		System.out.println(firstData);
		
		// ++
		System.out.println(++secondData);  // increase the value and use
	}

}
