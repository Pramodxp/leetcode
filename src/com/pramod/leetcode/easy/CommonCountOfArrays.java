package com.pramod.leetcode.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pramodr
 *
 */
public class CommonCountOfArrays {
	public static void main(String[] args) {
		int[] a = new int[] { 89, 2, 10, 20 };
		int[] b = new int[] { 5, 89, 6, 20 };

		List<Integer> alist = Arrays.stream(a).boxed().collect(Collectors.toList());
		List<Integer> blist = Arrays.stream(b).boxed().collect(Collectors.toList());

		alist.retainAll(blist);
		System.out.println(alist.size());

		System.out.println("a:" + alist + "b:" + blist);
	}
}
