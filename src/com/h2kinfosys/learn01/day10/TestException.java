package com.h2kinfosys.learn01.day10;

public class TestException {

	// Runtime Exceptions - Compiler cannot predict
	// Compile time - checked exceptions = 
	public static void main(String[] args) {
		int first = 100;
		int second = 1;
		float division = 0f;
		try {
			division = first/second;
			String[] items = {"milk", "potatos", "Sugar"};
			System.out.println(items[0]);
			System.out.println(items[1]);
			System.out.println(items[2]);
		//	System.out.println(items[3]);
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException arrayEx) {
			System.out.println(arrayEx.getMessage());
		}catch(RuntimeException ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("Executed Regardless of Exception");
		}
		
		
		System.out.println(division);
	
			
		// Checked Exception
		try {
			Thread.sleep(1000);
		}catch(InterruptedException iEx) {
			iEx.printStackTrace();
		}
		
		// try { risky code } catch(Exception ex)
		
		
	}

}
