package org.concurrency;

public class GetProcessorCount {
	public static void main(String[] args) {
		System.out.println("Number of processors = "+Runtime.getRuntime().availableProcessors());
	}
}
