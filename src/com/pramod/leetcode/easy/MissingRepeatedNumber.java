package com.pramod.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class MissingRepeatedNumber {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 2, 2 };

		findRepeatedNumber(arr);

//		Stream.of(arr).forEach(System.out::println);
	}

	static void findRepeatedNumber(int[] arr) {

		Set<Integer> list = new HashSet<>();
		int j=0;
		for (int i =j+1; i <arr.length; i++) {
			if (list.add(arr[i]) == false) {
				System.out.println(arr[i]);
				list.add(arr[i]);
			} else if (!list.contains(i)) {
				System.out.println(i);
			}
		}
	}
}
