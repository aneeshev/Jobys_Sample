package org.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TryCatchWithResources {

	public static void main(String[] args) {
		String outString = null;
		try (Scanner in = new Scanner(new FileReader("C:\\Users\\guest\\Documents\\hello.txt"));) {  // JDK 1.7 Feature
			StringBuilder sb = new StringBuilder();
			while (in.hasNext()) {
				sb.append(in.next());
			}
			outString = sb.toString();
			System.out.println("outString = " + outString);
		} catch (FileNotFoundException | NullPointerException e) { // handle multiple exception types in single catch block (JDK 1.7 Feature)
			System.out.println("Exception occured !");
		}
	}

}
