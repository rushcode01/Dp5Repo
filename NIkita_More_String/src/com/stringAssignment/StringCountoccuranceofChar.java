//Write a Java program to count occurrences of a character in given string. 
package com.stringAssignment;

public class StringCountoccuranceofChar {

	public static void findcountOccurenceOfChar(String str) {
		int i, j, len = str.length(), count = 0;
		char ch;
		for (i = 0; i < len; i++) {
			boolean isVisited = false;
			ch = str.charAt(i);
			count = 1;

			for (j = i + 1; j < len; j++) {

				if (ch == str.charAt(j)) {
					count++;
				}
			}
			for (int k = 0; k < i; k++) {
				if (ch == str.charAt(k)) {
					isVisited = true;
				}
			}
			if (!isVisited) {
				System.out.println(ch + " = " + count);
			}
		}
	}

	public static void main(String[] args) {

		String s = "java developer";
		System.out.println("---------GivenString----------\n"+s+"\n----------------------------");
		findcountOccurenceOfChar(s);

	}
}
