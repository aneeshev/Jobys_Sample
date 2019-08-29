package org.concurrency;

public class Consumer extends Thread {
	Drop drop;

	public Consumer(Drop drop) {
		this.drop = drop;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			drop.getProduct();
		}
	}
}
