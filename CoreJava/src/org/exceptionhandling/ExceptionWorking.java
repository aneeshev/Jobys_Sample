package org.exceptionhandling;

public class ExceptionWorking {

	public static void main(String[] args) {
		m1();
		System.out.println("Execution completed !");
	}

	private static void m1() {
		System.out.println("Executing method : m1 !");
		m2();
	}

	private static void m2() {
		System.out.println("Executing method : m2 !");
		m3();
	}

	private static void m3() {
		System.out.println("Executing method : m3 !");
		throw new RuntimeException();
	}

}
