package com.pramod.leetcode.easy;

public class SwappingNodeLinkedList {

	public static void main(String[] args) {
		
		 public ListNode swapNodes(ListNode head, int k) {
			 
			 int i = 0;
			 ListNode tempNode = new ListNode();
			 while(head.next != null) {
				 ListNode currNode = new ListNode();
				 ListNode nextNode = new ListNode();
				 currNode.val = head.val;
				 node.next = head;
				 if(i>=k && head.next != null) {
					 currNode = head.next;
					 nextNode = head; 	
				 }else {
					 currNode = head;
					 nextNode = head.next;
				 }
				 i++;
			 }
		 }

	}

}
