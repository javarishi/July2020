package com.h2kinfosys.learn01.day10;

public class Walgreens {

	public static void main(String[] args) {
		Walgreens store = new Walgreens();
		try {
			store.validateAge(21);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public boolean validateAge(int age) throws InsufficientAgeExecption {
		boolean result = false;
		if(age > 18) {
			System.out.println("Purchase Alcohol is Valid");
			result = true;
		}else {
			throw new InsufficientAgeExecption("Insufficient Age Execption");
		}
		return result;
	}
}
