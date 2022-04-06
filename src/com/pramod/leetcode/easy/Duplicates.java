package com.pramod.leetcode.easy;

import java.util.HashSet;

class Duplicates {

	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] { 1, 2, 3, 1 }));
	}

	public static boolean containsDuplicate(int[] nums) {
		int len1 = nums.length;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i= 0; i<= nums.length-1;i++) {
			set.add(nums[i]);
		}
		int len2 = set.size();
		if(len1==len2) {
			return false;
		}
		return true;
	}
}