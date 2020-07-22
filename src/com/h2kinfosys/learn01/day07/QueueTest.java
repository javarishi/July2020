package com.h2kinfosys.learn01.day07;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queueTest = new PriorityQueue<String>(2);
		Queue<String> anotherQueue = new PriorityQueue<String>();
		
		Deque<String> testDeque = new ArrayDeque<String>();
		
		// add
		queueTest.add("David1");
		queueTest.add("David2");
		queueTest.add("David3");
		queueTest.add("David3");
		// will not throw an exception
		queueTest.offer("Paul");
		// Retrieve and remove head of queue
		//String data1 = queueTest.remove();
		//String data2 = anotherQueue.remove();
		
	//	String data1 = queueTest.element();
	//	String data2 = anotherQueue.element();
		
		String data1 = queueTest.peek();
		String data2 = anotherQueue.peek();
		System.out.println(data1 + " " + data2);
		
		data1 = queueTest.poll();
		data2 = anotherQueue.poll();
		System.out.println(data1 + " " + data2);
		
		
		
	}

}
