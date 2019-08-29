package org.concurrency;

public class ThreadTester {
	public static void main(String[] args) {
		Drop drop = new Drop();
		
		Producer producer = new Producer(drop);
		producer.start();
		
		Consumer consumer = new Consumer(drop);
		consumer.start();
	}
}
