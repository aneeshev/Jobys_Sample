package org.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcards {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(5);
		ints.add(10);

		List<Long> longs = new ArrayList<>();
		longs.add(new Long(5));
		longs.add(new Long(10));

		sum(ints);
		// sums(longs); // this will not compile since Float is not a super class of Integer
	}

	public static void sum(List<? super Integer> list) { // ? super Integer
		for (Object num : list) {
			System.out.println(num.getClass().getName());
		}
	}

}
