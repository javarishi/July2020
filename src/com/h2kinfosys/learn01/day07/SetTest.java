package com.h2kinfosys.learn01.day07;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// HashSet<String> certifications = new HashSet<String>();
		// TreeSet<String> certifications = new TreeSet<String>();
		LinkedHashSet<String> certifications = new LinkedHashSet<String>();
		certifications.add("JAVA");
		certifications.add("CSM");
		certifications.add("PMP");
		certifications.add("SixSigma");
		System.out.println(certifications);
		System.out.println("Mulesoft " + certifications.add("Mulesoft"));
		System.out.println("PMP " + certifications.add("PMP"));
		
		HashSet<String> diplomas = new HashSet<String>();
		
		if(certifications.contains("Mulesoft")) {
			System.out.println("Mulesoft is Present");
			certifications.remove("Mulesoft");
		}else {
			System.out.println("Mulesoft is  Not Present");
		}
		System.out.println(certifications);
		System.out.println(certifications.size());
		
		for(String eachCertification : certifications) {
			System.out.println("From Loop : " + eachCertification);
		}
		
		System.out.println(certifications.isEmpty());
		certifications.clear();
		System.out.println(certifications.isEmpty());
	}

}
