package com.h2kinfosys.learn01.day06;

// 100% abstract contracts
public interface Contactable {
	
	// Variable - contractPeriodInMonths 
	/*
	 *  public - accessible to everyone
	 *  static - no instance so accessible with InterfaceName
	 *  final - value cannot be changed 
	 */
	int contractPeriodInMonths = 18;
	
	// String signConsent(boolean isSigned)
	// methods = public abstract (default)
	public String signConsent(boolean isSigned);

	public default void showContract(boolean isSigned) {
		if(isSigned) {
			System.out.println("Customer Signed the Contract for 18 months. Please add in GetResponse");
		}
		System.out.println("Customer Did not Signed the COntract. Please remove from GetResponse");
	}
	
	public static void anotherMethod() {
		System.out.println("Implementation for another method");
	}
}
