package org.streamapi;

import java.util.stream.IntStream;

public class CreateProcessConsume {

	public static void main(String[] args) {
		int[] numbers = { 1, 4, 0, 1, 13 };
		IntStream.of(numbers).summaryStatistics().getMin();
	}

}
