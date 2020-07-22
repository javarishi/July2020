package com.h2kinfosys.learn01.day07;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class MapTest {

	public static void main(String[] args) {
		
		
		//HashMap<Integer, String> customerInfo = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> customerInfo = new LinkedHashMap<Integer, String>();
		
		// add
		customerInfo.put(101, "Niel Armstrong");
		customerInfo.put(102, "David Nix");
		customerInfo.put(1000, "Brian Bulson");
		// get
		System.out.println(customerInfo.get(1000));
		// change - replace
		customerInfo.put(1000, "Paul Bulson");
		System.out.println(customerInfo.get(1000));

		// contains
		if(customerInfo.containsKey(101)) {
			System.out.println("101 is present");
		}
		if(customerInfo.containsValue("David Nix")) {
			System.out.println("Yes \"David Nix\" is a customer");
		}
		// Iteration
		Set<Integer> keySet = customerInfo.keySet();
		for(int eachKey : keySet) {
			System.out.println(eachKey + " Value :: " + customerInfo.get(eachKey));
		}
		
		Collection<String> values= customerInfo.values();
		for(String eachValue : values) {
			System.out.println(eachValue);
		}
		
		Set<Map.Entry<Integer, String>> entries = customerInfo.entrySet();
		for(Map.Entry<Integer, String> eachEntry : entries) {
			System.out.println(eachEntry.getKey() + "  " + eachEntry.getValue());
		}
		
		customerInfo.remove(101);
		System.out.println(customerInfo);
		System.out.println(customerInfo.size());
		customerInfo.clear();
		System.out.println(customerInfo.size());
	}

}
