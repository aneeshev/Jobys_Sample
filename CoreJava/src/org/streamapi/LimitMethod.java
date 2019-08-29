package org.streamapi;

import java.util.stream.IntStream;

public class LimitMethod {

	public static void main(String[] args) {
		int[] numbers = { 1, 4, 0, 1, 13 };

		IntStream.of(numbers).skip(2).forEach(num -> System.out.println(num)); // get first two
		// The ‘limit’ method is used to reduce the size of the stream.

	}

}
