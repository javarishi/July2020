package com.h2kinfosys.learn01.day07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		LinkedList<String> certifications = new LinkedList<String>();
		// ArrayList<String> certifications = new ArrayList<String>();
		
		certifications.add("JAVA"); // 0
		certifications.add("AWS"); // 1
		certifications.add("Python"); // 2
		certifications.add(3, "CSM"); // add - index
		certifications.add("PMP");
		certifications.add("SixSigma");
		System.out.println(certifications);
		System.out.println(certifications.get(2));
		
		// Add Contains
		
		// Add Loop Example
		
		
		List<String> technical =  certifications.subList(0, 3);
		System.out.println(technical);
	}

}
