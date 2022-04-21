package com.pramod.leetcode.easy;

public class MedianNumber {

	public static void main(String[] args) {

		int[] subArray = getSubArray(1, 6, new int[] { 1, 5, 7, 20, 6, 7, 8 });
		sort(subArray);
		int findMedian = findMedian(subArray);
		System.out.println(findMedian);
	}

	public static int findMedian(int nums[]) {
		int medianIndex = (nums.length) / 2;
		if (medianIndex < 0) {
			return nums[0];
		}
		return nums[medianIndex];
	}

	public static int[] getSubArray(int startIndex, int lastIndex, int nums[]) {
		int length = (lastIndex - startIndex) + 1;
		startIndex--;
		lastIndex--;
		int[] subArray = new int[length];
		int j = 0;
		for (int i = startIndex; i <= lastIndex; i++) {
			subArray[j] = nums[i];
			j++;
		}

		return subArray;
	}

	public static void sort(int nums[]) {
		int i = 0;
		int j = 0;
		int temp = nums[0];
		while (i < nums.length) {
			if (i != nums.length - 1 && nums[i] > nums[i + 1]) {
				temp = nums[i];
				nums[i] = nums[i + 1];
				nums[i + 1] = temp;
				j++;
			}
			i++;
			if (i == nums.length - 1) {
				if (j == 0) {
					return;
				}
				i = 0;
				j = 0;
			}
		}
	}

}
