package com.h2kinfosys.learn01.day08;

public class ThreadTester {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadTask task = new ThreadTask();
		// new state
		Thread threadone = new Thread(task);
		threadone.setPriority(Thread.MAX_PRIORITY);
		threadone.setName("threadone");
		
		Thread threadtwo = new Thread(task);
		threadtwo.setPriority(Thread.MIN_PRIORITY);
		threadtwo.setName("threadtwo");
		
		
		Thread threadthree = new Thread(task);
		threadthree.setPriority(Thread.NORM_PRIORITY);
		threadthree.setName("threadthree");
		
		Thread daemon = new Thread(task);
		daemon.setDaemon(true);
		daemon.setName("daemon");
		// runnable
		threadone.start();
		threadtwo.start();
		threadthree.start();
		daemon.start();
		
		threadone.join();
		threadtwo.join();
		threadthree.join();
		daemon.join();
		
		System.out.println("Send 'Task Complete' Email ");
	}

}
