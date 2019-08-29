package com.test;

public class ConditionalProgram {

	public static void main(String args[]){
		int a=0,b=0;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[2]);
		
		switch (args[1]!=null?args[1]:"") {
		case "+":
			System.out.println("Sum :"+(a+b));
			break;
		case "-":
			System.out.println("Sum :"+(a+b));
			break;
		case "/":
			System.out.println("Sum :"+(a+b));
			break;
		default:
			System.out.println("Operater is empty.");
			break;
		}
	}
}
