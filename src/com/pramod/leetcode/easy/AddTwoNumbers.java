package com.pramod.leetcode.easy;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class AddTwoNumbers {

	static ListNode resultNode = new ListNode();
	static ListNode tempNode = resultNode;

	static int carry;

	public static void main(String[] args) {

		// List 1
		ListNode lx1 = new ListNode(9);
		ListNode lx2 = new ListNode(9, lx1);
		ListNode l3 = new ListNode(9, lx2);
		ListNode l4 = new ListNode(9, l3);
		ListNode l5 = new ListNode(9, l4);
		ListNode l6 = new ListNode(9, l5);
		ListNode l7 = new ListNode(9, l6);
//		System.out.println(getListNodesAsString(l7));

		// List 2
		ListNode lxx2 = new ListNode(9);
		ListNode xx2 = new ListNode(9, lxx2);
		ListNode x3 = new ListNode(9, xx2);
		ListNode x4 = new ListNode(9, x3);
//		System.out.println(getListNodesAsString(l7));

//		getSumList(l6, x4, resultNode);
		System.out.println(resultNode);
	}

//	public static void getSumList(ListNode l1, ListNode l2, ListNode node) {
//		int sum = 0;
//		if (l1 != null || l2 != null || carry > 0) {
//			tempNode = new ListNode();
//			sum = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0);
//			sum = sum%10;
//			node.val = sum + carry;
//			tempNode.val = sum + carry;
//			carry = 0;
//			carry = sum/10;
//			node.next = tempNode;
//			l1 = l1 == null ? null : l1.next;
//			l2 = l2 == null ? null : l2.next;
//			getSumList(l1, l2, tempNode);
//		}
//
//	}

	  public static ListNode getSumList(ListNode l1, ListNode l2, ListNode node) {
			if (l1 != null || l2 != null ||carry > 0) {
				ListNode tempNode = new ListNode();
	           
				int value = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0) + carry;
				node.val = value;
				if (value >= 10) {
					node.val = Integer.parseInt(String.valueOf(value).substring(1));
					holdCarryValue(value);
				}
				if(carry > 0 && (l1 != null && l1.next != null) || (l2 != null && l2.next != null)) {
	            node.next = tempNode;
				}
				carry = 0;
				if ((l1 != null && l1.next != null) || (l2 != null && l2.next != null)) {
					
				}
				l1 = l1 == null ? null : l1.next;
				l2 = l2 == null ? null : l2.next;
				getSumList(l1, l2, tempNode);
			}
	            return node;
		}

	static StringBuilder sb = new StringBuilder();
	
	void getReversedListNodes(ListNode nodes){
		
	}

	public static int getListNodesAsString(ListNode nodes) {
		if (nodes != null) {
			sb.append(nodes.val);
			if (nodes.next != null) {
				nodes = nodes.next;
				getListNodesAsString(nodes);
			}
		}
		return Integer.parseInt(sb.toString());
	}

	public static void holdCarryValue(int val) {
		carry = Integer.valueOf(String.valueOf(String.valueOf(val).charAt(0)));
	}
}

