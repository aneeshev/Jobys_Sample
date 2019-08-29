package com.test;

public class MinAndMax {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 7, 8, 4, 5, 6 };
		int min, max;
		max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("MAX VALUE:" + max);
		min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("MIN VALUE:" + min);
	}
}
