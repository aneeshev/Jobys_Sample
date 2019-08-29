package org.concurrency;
/* This file doesn't have full implementation. Assume 2 threads run concurrently on this class object and one thread increments & other
 * thread decrements the value and it will cause unexpected results because of the thread interference. 
 * We apply synchronization to avoid this scenario */
public class ThreadInterference {
	
	private int c = 0;

	public void increment() {
		c++;
	}

	public void decrement() {
		c--;
	}

	public int value() {
		return c;
	}
}
