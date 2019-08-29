package org.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TryCatchException {

	public static void main(String[] args) {
		Scanner in = null;
		String outString = null;
		try {
			in = new Scanner(new FileReader("C:\\Users\\guest\\Documents\\hello.txt"));
			StringBuilder sb = new StringBuilder();
			while (in.hasNext()) {
				sb.append(in.next());
			}
			outString = sb.toString();
			System.out.println("outString = " + outString);
		} catch (FileNotFoundException fne) {
			System.out.println("File cannot be found !");
		} catch (Exception e) {
			System.out.println("Exception occured !");
		} finally {
			try {
				in.close();
			} catch (Exception ioe) {
				System.out.println("An IOException was caught!");
			}
		}
	}
}
