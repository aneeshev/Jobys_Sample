package org.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		// get list of unique squares
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		squaresList.forEach(square -> System.out.println(square));
		
		// The ‘map’ method is used to map each element to its corresponding result. 
	}

}
