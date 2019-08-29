package org.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutor {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10); //create thread pool
		for(int i=0; i<100; i++) {
			service.execute(new Task());
		}
	}
}

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread name = "+Thread.currentThread().getName());
	}
}
