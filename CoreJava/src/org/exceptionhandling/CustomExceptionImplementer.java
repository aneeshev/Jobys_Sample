package org.exceptionhandling;

public class CustomExceptionImplementer {
	public static void main(String[] args) {
		try {
			throw new CustomExcepion();
		} catch (CustomExcepion ce) {
			ce.printStackTrace();
		}
	}
}

class CustomExcepion extends Exception {
	public CustomExcepion() {
		super("This is a custom exception !");
	}
}
