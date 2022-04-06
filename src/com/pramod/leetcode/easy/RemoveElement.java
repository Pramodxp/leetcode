package com.pramod.leetcode.easy;

class RemoveElement {
	public static void main(String[] args) {
		removeElement(new int[] { 3, 2, 3, 3, 3, 2, 3 }, 3);
	}

	public static int removeElement(int[] nums, int val) {
		int i = 0, j = 0;
		while (j < nums.length) {
			if (nums[j] == val) {
				j++;
			} else {
				nums[i++] = nums[j++];
			}
		}
		return i;
	}
}