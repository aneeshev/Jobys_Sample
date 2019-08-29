package com.java.concepts.implimantation;

public class Test {

	public static void main(String args[]) {
		//Immutable student class...
		Student s = new Student("ABC", 101);
		System.out.println(s.getName()+" : "+s.getRegNo());
		
		// Uncommenting below line causes error
		// s.regNo = 102;
		// if regNo is a private variable then even developer cann't access the variable too.
		
		Student s1 = new Student("Aneesh", 102);
		System.out.println(s1.getName()+" : "+s1.getRegNo());
		//String is a one of the immutable class. 
		String str  = new String();
		System.out.println(str);
	}
}
