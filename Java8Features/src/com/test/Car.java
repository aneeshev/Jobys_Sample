package com.test;
/**
 * Assignment 1:
 * 1. verify the classes of primitive data types.
 * 2. switch case. 
 */
public class Car {
	
	public static void main(String []args){

		// 1. verify the classes of primitive data types.
		boolean [] nowBoolean = new boolean [1];
		System.out.println("nowBoolean"+nowBoolean.getClass());
		byte [] nowByte = new byte [1];
		System.out.println("nowByte"+nowByte.getClass());
		int [] nowInt = new int [1];
		System.out.println("nowInt"+nowInt.getClass());
		long [] nowLong = new long [1];
		System.out.println("nowLong"+nowLong.getClass());
		short [] nowShort = new short [1];
		System.out.println("nowShort"+nowShort.getClass());
		char [] nowChar = new char [1];
		System.out.println("nowChar"+nowChar.getClass());
		double [] nowDouble = new double [1];
		System.out.println("nowDouble"+nowDouble.getClass());
		float [] nowFloat = new float [1];
		System.out.println("nowFloat"+nowFloat.getClass());

		//2. switch case in each version.
			// - long not supported in switch case.
		//2.1 switch case support with integer data type.
		switch(1){
		case 1: 
			System.out.println("one");
			break;
		}
		//2.2 switch case support with char data type.
		switch('A'){
		case 'A': 
			System.out.println("1. A");
			break;
		}
		//2.3 switch case support with String data type.
		switch("Aneesh"){
		case "Aneesh": 
			System.out.println("1. Aneesh Vijayan");
			break;
		}
		//2.4 switch case support with pattern data type?
		switch("Aneesh"){
		case "Aneesh": 
			System.out.println("1. Aneesh Vijayan");
			break;
		}
		
	}

}
