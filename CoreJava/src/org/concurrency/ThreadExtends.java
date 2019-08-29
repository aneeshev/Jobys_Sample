package org.concurrency;

public class ThreadExtends extends Thread {

	public static void main(String[] args) {
		ThreadExtends t1 = new ThreadExtends();
		t1.start();
	}

	public void run() {
		System.out.println("Hello from a thread !" + Thread.currentThread().getName());
	}

}
