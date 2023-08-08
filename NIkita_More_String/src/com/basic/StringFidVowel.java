// print vowel from given string
package com.basic;

public class StringFidVowel {

	public static void testAlltheVowels(String s) {
		int i, len = s.length();
		char ch;
		for (i = 0; i < len; i++) {
			ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch + " is vowel");
			} else {
				System.out.println(ch + " is not vowel");
			}
		}
	}

	public static void printAllvowel(String s) {
		int i, len = s.length();
		char ch;
		for (i = 0; i < len; i++) {
			ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch);
			}
		}
	}

	public static void main(String[] args) {

		String s1 = "welcome";
		testAlltheVowels(s1);
		System.out.println("-------------------");
		printAllvowel(s1);
	}
}
