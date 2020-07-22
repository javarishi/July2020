package com.h2kinfosys.learn01.day09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectHandling {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setCustomerId(100);
		customer.setFirstName("David");
		customer.setLastName("Nix");
		try {
			FileOutputStream fos = new FileOutputStream("/RISHI/H2K/FileIO/cust.tmp");
			ObjectOutputStream objos = new ObjectOutputStream(fos);
			objos.writeObject(customer);
			objos.close();
			
			FileInputStream fis = new FileInputStream("/RISHI/H2K/FileIO/cust.tmp");
			ObjectInputStream objis = new ObjectInputStream(fis);
			Customer custTwo = (Customer) objis.readObject();
			
			System.out.println(custTwo.getCustomerId() + " " + custTwo.getFirstName() + " " + customer.getLastName());
			
			objis.close();
		}catch(IOException ioEx) {
			ioEx.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
