package org.methodoverriding;

public class Child extends Parent {
	public void printMessage() {
		System.out.println("Hello from Child printMessage !");
	}

	public static void main(String[] args) {
		Child child = new Child();
		child.printMessage();
	}
}

class Parent {
	public void printMessage() {
		System.out.println("Hello from Parent printMessage !");
	}
}
