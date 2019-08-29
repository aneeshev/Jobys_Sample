package org.methodoverriding;

public class Cat extends Animal {
	public static void testClassMethod() {
		System.out.println("The static method in Cat");
	}

	public void testInstanceMethod() {
		System.out.println("The instance method in Cat");
	}

	public static void main(String[] args) {
		Animal myAnimal = new Cat();
		myAnimal.testClassMethod();
		myAnimal.testInstanceMethod();

		// Animal.testClassMethod();
		// Cat.testClassMethod();
	}
}

class Animal {
	public static void testClassMethod() {
		System.out.println("The static method in Animal");
	}

	public void testInstanceMethod() {
		System.out.println("The instance method in Animal");
	}
}
