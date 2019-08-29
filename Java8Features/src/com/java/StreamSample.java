package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSample {

	public static void main(String args[]) {
		//sumStream()
		System.out.println(sumStream(Arrays.asList(11,2,3,4,5,61,17,8,9,10,11,12,13,14,15)));
		//findSquareOfMaxOdd()
		System.out.println(findSquareOfMaxOdd(3, 1, 2));
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(8);
		l.add(6);
		findSquareOfMaxOddUsingStreamAndLamda(l);
	}

	
	private static int sumStream(List<Integer> list) {
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	}
	
	
	private static int findSquareOfMaxOdd(Integer... numbers) {
		int max = 0;
		for (int i : numbers) {
			if (i % 2 != 0 && i > 3 && i < 11 && i > max) {
				max = i;
			}
		}
		return max * max;
	}

	/**
	 * 
	 * Above program will always run in sequential order but we can use Stream API
	 * to achieve this and get benefit of Laziness-seeking. Let’s see how we can
	 * rewrite this code in functional programming way using Stream API and lambda
	 * expressions.
	 * 
	 * If you are surprised with the double colon (::) operator, it’s introduced in
	 * Java 8 and used for method references. Java Compiler takes care of mapping
	 * the arguments to the called method. It’s short form of lambda expressions i
	 * -> isGreaterThan3(i) or i -> NumberTest.isGreaterThan3(i).
	 * 
	 * 
	 * @param numbers
	 * @return
	 */
	public static int findSquareOfMaxOddUsingStreamAndLamda(List<Integer> numbers) {
		return numbers.stream().filter(StreamSample::isOdd) // Predicate is functional interface and
				.filter(StreamSample::isGreaterThan3) // we are using lambdas to initialize it
				.filter(StreamSample::isLessThan11) // rather than anonymous inner classes
				.max(Comparator.naturalOrder()).map(i -> i * i).get();
	}

	public static boolean isOdd(int i) {
		return i % 2 != 0;
	}

	public static boolean isGreaterThan3(int i) {
		return i > 3;
	}

	public static boolean isLessThan11(int i) {
		return i < 11;
	}

}
