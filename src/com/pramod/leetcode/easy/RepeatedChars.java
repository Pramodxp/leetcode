package com.pramod.leetcode.easy;

public class RepeatedChars {

	static String[] strs = new String[] { "flwixx", "flwixxx", "flew" };
	static String result;

	public static void main(String[] args) {
		for (int i = 0; i < strs.length; i++) {
			if (i == 0) {
				result = checkCharsRepeated(strs[i], strs[i + 1]);
			} else {
				result = checkCharsRepeated(result, strs[i]);
			}
		}
		System.out.println(result);
	}

	public static String checkCharsRepeated(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		char[] s1chars = s1.toCharArray();
		char[] s2chars = s2.toCharArray();

		if (s1chars.length > s2chars.length) {
			s1chars = s2.toCharArray();
			s2chars = s1.toCharArray();
		}

		for (int i = 0; i < s1chars.length; i++) {
			if (s1chars[i] == s2chars[i]) {
				sb.append(s1chars[i]);
			} else {
				return sb.toString();
			}
		}

		return sb.toString();
	}
}
