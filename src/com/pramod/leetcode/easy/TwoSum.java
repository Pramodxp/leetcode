package com.pramod.leetcode.easy;

class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		main: for (int i = 0; i <= nums.length - 1; i++) {
			for (int j = i + 1; j <= nums.length - 1; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					break main;
				}
			}
		}

		return result;
	}
	
	public static void main(String[] args) {
		int[] twoSum = twoSum(new int[] {2,7,11,15}, 9);
		System.out.println(twoSum);
	}
}