package org.streamapi;

import java.util.stream.IntStream;

public class ForEachMethod {

	public static void main(String[] args) {
		IntStream.range(1, 11).forEach(num -> System.out.println(num));
		// Stream has provided a new method ‘forEach’ to iterate each element of the stream. 
	}

}
