package com.h2kinfosys.learn01.day06;

public class PreferredCustomer extends Customer{
	
	public PreferredCustomer(String ssn, String firstName) {
		super(ssn, firstName);
		System.out.println("PreferredCustomer Constructor");
		// contractPeriodInMonths = 24;
		System.out.println("Contract for Months :: " + contractPeriodInMonths);
	}

	String customerNumber;
	String emailAddress;
	
	public void validateEmailAddress(String email) {
		if(	email != null 
				&& email.length() > 0
				&& email.indexOf("@") != -1
				&& email.indexOf(".com") != -1
				) {
			System.out.println("Valid Email Provided");
		}else {
			System.out.println("Invalid Email - Plz Call Customer");
		}
	}
	
	public static void customerStatic() {
		System.out.println("PreferredCustomer Static Method");

	}
	
	// if method is final  - no overriding
	public final void onlyForPreferredCustomerOffers() {
		System.out.println("Offer of 5% discount");
	}
	
	
	
	/* Overriding  - same method name - change business logic */
	/**
	 * 1. Access Modifier  - cannot be limiting than Superclass - enhance visibility
	 * 2. Return type - either same - or co-variant
	 * 3. Method name - exactly the same
	 * 4. Parameters - either exactly same - or co-variant
	 * 5. Method body - should be changed - can call - parent's logic
	 * 6. Exception - co-variant
	 */
	@Override
	public boolean validateAddress(String address) {
		if(super.validateAddress(address)) {
			System.out.println("PreferredCustomer :: Google Map Address Validation");
			return true;
		}
		return false;
		
	}


	@Override
	public void sendDiscountCodes(String emailAddress) {
		this.validateEmailAddress(emailAddress);
		System.out.println("Send email ");
		
	}


	@Override
	public String signConsent(boolean isSigned) {
		if(isSigned) {
			return "Customer Signed the Consent. Please add in GetResponse";
		}
		return "Customer Did not Signed the Consent. Please remove from GetResponse";
	}

	@Override
	public void showContract(boolean isSigned) {
		// TODO Auto-generated method stub
		super.showContract(isSigned);
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
