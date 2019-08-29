package org.exceptionhandling;

import java.util.Scanner;

public class ReadInputException {

	public static void main(String[] args) throws ArithmeticException {
		Scanner reader = null;
		try {
			reader = new Scanner(System.in); // Reading from System.in
			System.out.println("Enter a number: ");
			reader.nextInt();
			
		} catch (NullPointerException e) {
			System.out.println("Exception occured ");
		} finally { // once finished
			reader.close();
		}
	}
}
