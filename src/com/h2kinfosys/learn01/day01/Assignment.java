package com.h2kinfosys.learn01.day01;

public class Assignment {

	public static void main(String[] args) {
		int firstData = 1000;
		int secondData = 200;
		int thirdData = 300;
		int forthdata = 4000;
		
		// Compare three variables and find biggest number
		if((firstData > secondData) && (firstData > thirdData)) {
			System.out.println("First Number is Biggest :: " + firstData);
		}else if(secondData > thirdData) {
			System.out.println("Second Number is Biggest :: " + secondData);
		}else {
			System.out.println("Third Number is Biggest :: " + thirdData);
		}

	}

}
