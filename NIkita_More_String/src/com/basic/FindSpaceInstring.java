package com.basic;

public class FindSpaceInstring {

	public static void main(String[] args) {
		String s = "i love my india";

		int i, len = s.length(), count = 0;
		char ch = ' ';
		for (i = 0; i < len; i++) {
			if (ch == s.charAt(i)) {
				count++;
			}
		}
		System.out.println("Space in given String is " + count);
	}
}
