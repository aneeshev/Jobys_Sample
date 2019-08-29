package org.concurrency;

class ThreadPriority extends Thread {
	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();

		System.out.println(t1.getName() + " thread priority : " + t1.getPriority()); // Default 5
		System.out.println(t2.getName() + " thread priority : " + t2.getPriority()); // Default 5
		System.out.println(t3.getName() + " thread priority : " + t3.getPriority()); // Default 5

		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(Thread.MAX_PRIORITY);

		System.out.println(t1.getName() + " thread priority : " + t1.getPriority()); // 1
		System.out.println(t2.getName() + " thread priority : " + t2.getPriority()); // 5
		System.out.println(t3.getName() + " thread priority : " + t3.getPriority()); // 10
	}
}
