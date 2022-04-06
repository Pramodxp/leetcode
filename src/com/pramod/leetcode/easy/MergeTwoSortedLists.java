package com.pramod.leetcode.easy;

/*You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 
Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.*/

class MergeTwoSortedLists {

	public static void main(String[] args) {
		// List 1
				ListNode lx1 = new ListNode(1);
				ListNode lx2 = new ListNode(9, lx1);
				ListNode l3 = new ListNode(5, lx2);
				ListNode l4 = new ListNode(9, l3);
				ListNode l5 = new ListNode(7, l4);
				ListNode l6 = new ListNode(10, l5);
				ListNode l7 = new ListNode(2, l6);
//				System.out.println(getListNodesAsString(l7));

				// List 2
				ListNode lxx2 = new ListNode(1);
				ListNode xx2 = new ListNode(4, lxx2);
				ListNode x3 = new ListNode(0, xx2);
				ListNode x4 = new ListNode(6, x3);
//				System.out.println(getListNodesAsString(l7));

//				getSumList(l6, x4, resultNode);
				mergeTwoLists(l7, x4);
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		} else if (list2 == null) {
			return list1;
		} else if (list1.val < list2.val) {
			list1.next = mergeTwoLists(list1.next, list2);
			return list1;
		} else {
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		}
	}

}