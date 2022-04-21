class SearchInsertPosition {

	public static void main(String[] args) {
		searchInsert(new int[] { 1, 3, 5, 6 }, 7);
	}

	public static int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			} else if (nums.length-1 == i && target > nums[i]) {
				return i + 1;
			} else if (target > nums[i] && target < nums[i + 1]) {
				return i + 1;
			}
		}
		return 0;
	}
}