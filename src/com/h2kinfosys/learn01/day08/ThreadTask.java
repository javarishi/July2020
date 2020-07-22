package com.h2kinfosys.learn01.day08;

public class ThreadTask implements Runnable {
	
	private String taskname;
	public ThreadTask() {
		// TODO Auto-generated constructor stub
	}
	
	public ThreadTask(String threadname, int i) {
		//System.out.println(threadname + " " + i);
		this.taskname = threadname;
	}

	@Override
	public void run() {
		System.out.println(this.taskname + " Calling Run method " + Thread.currentThread().getName());
		for(int i = 1; i <=10; i++) {
			//System.out.println(Thread.currentThread().getName() + " Value  " + i);
			//createPurchaseOrder();
			
		}
	}
	
	
	public String createPurchaseOrder() {
		String poNumber = null;
		synchronized(this) {
			poNumber = "PO"+ System.currentTimeMillis();
			System.out.println(Thread.currentThread().getName() + poNumber);
		}
		
		return poNumber;
	}

}
