package org.exceptionhandling;

public class ThrowsException {
	public static void main(String[] args) {
		try {
			m1();
		}catch(Exception e) {
			System.out.println("Exception caught in m1's catch !");
		}
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
		// since its runtime exception it will propagate back through the call stack
		// automatically and caught in m1's catch.
		// If its checked exception then you need to use throws in method signature to
		// pass the exception back in the call stack.
	}
}
