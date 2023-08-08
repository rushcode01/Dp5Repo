//Write a Java program to count total number of words in a string. 
package com.stringAssignment;

public class String_CountnoOfwords {

	public static void main(String[] args) {
		String s = "i love my india";
		int count = 1;
		s = s.trim();
		int len = s.length();
		char ch1, ch2;
		for (int i = 0; i < len - 1; i++) {
			ch1 = s.charAt(i);
			ch2 = s.charAt(i + 1);
			if (ch1 == ' ' && ch2 != ' ') {
				count++;
			}
		}
		System.out.println("NO of Words is : " + count);
	}
}
