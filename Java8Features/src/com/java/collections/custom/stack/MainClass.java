package com.java.collections.custom.stack;

public class MainClass {

	
	public static void main(String args[]) {
		System.out.println("Stack using Array");
	        System.out.println("----------------------------");
	        // Stack is defined to hold only String values
		Stack<String> arrayStack = new Stack<String>();
		
		System.out.println("Initial Stack size : "+arrayStack.size());
		arrayStack.push("Element One");
		arrayStack.push("Element Two");
		arrayStack.push("Element Three");
		System.out.println("Stack size after push : "+arrayStack.size());
		
		System.out.println("Pop Top most element : "+arrayStack.pop());
		
		System.out.println("Stack size after pop : "+arrayStack.size());
	   }
	
}
