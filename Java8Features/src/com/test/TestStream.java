package com.test;

import java.util.stream.IntStream;

/**
 * 
 * @author aneesh.vijayan
 * 
 *         1. Functional Interface 2. Lamda Expression.
 *
 *         Stream:-
 *
 *         What to do? How to do? Chain Operation ?
 *
 */
public class TestStream implements Message {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Message msg = new TestStream();
		msg.showMessage();

		Message msgs = new Message() {

			@Override
			public void showMessage() {
				System.out.println("Have A Good Day.");
			}
		};

		msgs.showMessage();
		// we can create instance of a functional interface using lambda expression
		Message message = () -> System.out.println("Good Idea.");
		message.showMessage();

		EmailMessage email = (String name) -> {
			System.out.println("Good Email to " + name);
			return "Result";
		};
		email.showMessage("Aneesh");
		// This is stream. Java 8 feature.
		IntStream.range(1, 11).forEach(num -> System.out.println("Num :" + num));
	}

	@Override
	public void showMessage() {
		System.out.println("Goood Morning.");
	}

}

@FunctionalInterface
interface Message {
	void showMessage();
}

/**
 * An interface with exactly one abstract method is called Functional
 * Interface. @FunctionalInterface annotation is added so that we can mark an
 * interface as functional interface.
 * 
 * The major benefit of java 8 functional interfaces is that we can use lambda
 * expressions to instantiate them and avoid using bulky anonymous class
 * implementation.
 * 
 * java 8 functional interfaces are Consumer, Supplier, Function and Predicate.
 * 
 * @author aneesh.vijayan
 *
 */
@FunctionalInterface
interface EmailMessage {
	String showMessage(String name);
}
