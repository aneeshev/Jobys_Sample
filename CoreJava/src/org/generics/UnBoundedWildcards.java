package org.generics;

import java.util.ArrayList;
import java.util.List;

public class UnBoundedWildcards {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		
		List<Long> longs = new ArrayList<Long>();
		longs.add(new Long(1000));
		
		printData(ints);
		
		printData(longs);
		
	}
	public static void printData(List<?> list){
		for(Object obj : list){
			System.out.print(obj + "::");
		}
	}
}
