package org.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterMethod {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		//new ArrayList();

		// get count of empty string
		long count = strings.stream().filter(string -> string.startsWith("b")).count();
		System.out.println(count);

		// The ‘filter’ method is used to eliminate elements based on a criteria.
	}

}
