package com.h2kinfosys.learn01.day08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestClass {

	private static int NTHREDS = 4;
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
		for (int i = 1;i < 20; i++) {
			ThreadTask tasks = new ThreadTask("Task_" + i, i);
			executor.execute(tasks);
		}
		executor.shutdown();
	}

}
