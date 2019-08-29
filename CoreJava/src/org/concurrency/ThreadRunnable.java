package org.concurrency;

public class ThreadRunnable implements Runnable {

	public void run() {
		System.out.println("Hello from a thread !");
	}

	public static void main(String args[]) {
		ThreadRunnable tr=new ThreadRunnable();
		Thread t1 = new Thread(tr);
		t1.start();
	}

}
