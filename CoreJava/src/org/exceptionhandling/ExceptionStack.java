package org.exceptionhandling;

import java.io.FileNotFoundException;

public class ExceptionStack {
	public static void main(String[] args) {
		try {
			m1();
		} catch (FileNotFoundException | NullPointerException e) {
			System.out.println("Exception handled !");
		} catch (Exception ex) {
			
		}
	}

	public static void m1() throws FileNotFoundException {
		m2();
	}

	public static void m2() throws FileNotFoundException {
		m3();
	}

	public static void m3() throws FileNotFoundException {

		throw new FileNotFoundException();

	}
}
