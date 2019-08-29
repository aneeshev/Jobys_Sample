package org.concurrency;

public class Drop {
	private String productName;
	private boolean empty = true;

	public synchronized void putProduct(String name) {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		this.productName = name;
		System.out.println("Put product = " + name);
		empty = false;
		notify();
	}

	public synchronized void getProduct() {
		while (empty) {
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		System.out.println("Get product = " + this.productName);
		empty = true;
		notify();
	}

}
