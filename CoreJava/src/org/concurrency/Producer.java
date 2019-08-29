package org.concurrency;

public class Producer extends Thread {
	Drop drop;

	public Producer(Drop drop) {
		this.drop = drop;
	}

	@Override
	public void run() {
		String[] products = { "Laptop", "Music Player", "Fitness Band" };
		for (String product : products) {
			drop.putProduct(product);
		}
	}
}
