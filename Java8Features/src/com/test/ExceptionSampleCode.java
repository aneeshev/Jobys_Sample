package com.test;

import java.util.Scanner;

/**
 * 
 * @author aneesh.vijayan
 * 
 *         1.5
 * 
 *         Object -> Throwable -> Exception
 * 
 *         Runtime Exception - File/Format/ Checked exception - syntax
 * 
 *         finally -> close the connection throw -> is to create an exception
 *         and throw. throws -> it will throw the exception from sub methods to
 *         main methods, checked exception.
 * 
 *         custom exception.
 * 
 *         1.7
 * 
 *         1. try with resource. 2. closable. 3. multiple exception in same
 *         catch. | 4.
 */
public class ExceptionSampleCode {

	public static void main(String []args) {

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter an amount :");
			System.out.println("Have Result: " + scan.hasNext());
			System.out.println("String: " + Integer.parseInt(scan.nextLine()));
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException.");
		} finally {
			// scan.close();
		}
		//
		try (Scanner s = new Scanner(System.in);) {
			System.out.println("Enter an amount :");
			System.out.println("Have Result: " + s.hasNext());
			System.out.println("String: " + Integer.parseInt(s.nextLine()));
		} catch (NullPointerException | NumberFormatException ex) {
			System.out.println("NumberFormatException." + ex.getCause());
		}

	}
}
