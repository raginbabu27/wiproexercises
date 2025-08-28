package com.wipro.clienttest;

import com.wipro.thread.Counter;
import com.wipro.thread.CounterThread;

public class CounterThreadTesting {

	public static void main(String[] args) 
	{
			Counter counter = new Counter();
	        CounterThread t1 = new CounterThread(counter);
	        CounterThread t2 = new CounterThread(counter);
	        t1.start();
	        t2.start();
	        try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println(counter.getCount());
	}

}
