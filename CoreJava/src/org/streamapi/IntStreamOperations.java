package org.streamapi;

import java.util.stream.IntStream;

public class IntStreamOperations {
	public static void main(String[] args) {
		int[] numbers = { 1, 4, 0, 1, 13 };

		// source creation
		IntStream.range(1, 5).forEach(System.out::println);
		IntStream.rangeClosed(1, 5).forEach(System.out::println);

		// processing
		IntStream.of(numbers).distinct();
		IntStream.of(numbers).sorted();
		IntStream.of(numbers).limit(2); // get first two
		IntStream.of(numbers).skip(2); // skip first two
		IntStream.of(numbers).filter(num -> num % 2 == 0);
		IntStream.of(numbers).map(num -> num * 2);
	}
}
