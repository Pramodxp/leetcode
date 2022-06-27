package com.pramod.leetcode.easy;

public class Nodes {
	public static void main(String[] args) {
		char[] brackets = new char[] { '[', '[', '[', '[', '[', ']', ']', '[', '[', ']', ']', ']', ']', '[', ']', ']' };

		System.out.println("nodes : " + (brackets.length) / 2);

		int openCount = 0;
		int closeCount = 0;

		int node = 0;

		char prev = ' ';
		int prevCount = 0;
		int inConCount = 0;

		for (int i = 0; i < brackets.length; i++) {
			if (brackets[i] == '[') {
				inConCount = 0;
				openCount++;
			} else if (brackets[i] == ']') {
				closeCount++;
			}

			if (i != 0 && (prev == '[' || brackets[prevCount] == '[') && brackets[i] == ']') {
				inConCount++;
				prevCount = i - inConCount;
				node++;
			}

			if (openCount == closeCount) {
				System.out.println("parent tree completed");
				System.out.println("nodes found" + node);
			}

			prev = brackets[i];

		}
	}
}
