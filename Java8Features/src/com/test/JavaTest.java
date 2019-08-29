package com.test;

import java.util.Scanner;

public class JavaTest {

	public static void main(String... args) {
//		int a=0,b=0;
//		if(args.length > 0){
//			a = Integer.parseInt(args[0]);
//			b = Integer.parseInt(args[1]);
//		} else {
//			System.out.println("Parameters are empty.");
//		}
//		System.out.println("Sum :"+(a+b));
//		System.out.println("Sum :"+(a-b));
//		System.out.println("Sum :"+(a/b));
		
		//Exception.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter an amount :");
//		System.out.println("Have Result: " + scan.hasNext());
//	    //Print the string  
//		try{
//			System.out.println("String: " +Integer.parseInt(scan.nextLine()));
//		} catch(NumberFormatException e){
//			System.out.println("NumberFormatException.");
//		}finally{
//			scan.close();
//		}
		Scanner scan = null;
		try{
			 scan = new Scanner(System.in);
			System.out.println("Enter an amount :");
			System.out.println("Have Result: " + scan.hasNext());
			System.out.println("String: " +Integer.parseInt(scan.nextLine()));
		} catch(NumberFormatException e){
			System.out.println("NumberFormatException.");
		}finally{
			scan.close();
		}
		
		try(Scanner s = new Scanner(System.in);){
			System.out.println("Enter an amount :");
			System.out.println("Have Result: " + s.hasNext());
			System.out.println("String: " +Integer.parseInt(s.nextLine()));
		} catch(NullPointerException | NumberFormatException ex){
			System.out.println("NumberFormatException."+ex.getClass());
			System.out.println("NumberFormatException.");
		}
	    
	    
	}
}
