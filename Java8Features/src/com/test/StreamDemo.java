package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * @author aneesh.vijayan
 *
 *Types:-
 *	stream() - sequential order.
 * 	parallelStream() - Like Thread.
 *
 *Operations:-
 * 	Create :- 
 * 	Process :- 
 * 		Aggregate operations: filter, map, limit, reduce, find, match.
 * 		Pipelining : 
 * 		Automatic iteration : forEach.
 * 
 * 	Consume :- consume something.
 * 	Supplier :- 
 * 	Predicate :- 
 * 	Function :- convert the result
 * 
 *
 */
public class StreamDemo {
	/**
	 * 
	 * @param args
	 */
	public static void main(String []args) {
		
		List<Integer> number = Arrays.asList(2,3,4,5,3);
//		number.stream().map(x->x*x).forEach(y->System.out.println(y));
		number = number.stream().map(x->x*x).distinct().collect(Collectors.toList());
		number.stream().forEach(y->System.out.println("out :"+y));
		
		int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println("Even :"+even);
		
		Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println("square"+square);
		// Sijo's
		int [] num = {1,4,0,1,13};
		IntStream.of(num).distinct().sorted().limit(3).forEach(n -> System.out.println("item :"+n));
		// filter
		List<String> strings = Arrays.asList("abc", "", "bcd");
		long count = strings.stream().filter(s -> s.isEmpty()).count();
		System.out.println("Count :"+count);
		//	stream -> distinct -> sort -> limit -> sum.
		long sum = IntStream.of(num).distinct().sorted().limit(3).sum();
		System.out.println("Sum :"+sum);
		// parallel stream.
		count = strings.parallelStream().filter(s -> s.isEmpty()).count();
		System.out.println("parallelStream(), Count :"+count);

	}
}
