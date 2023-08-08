//Write a Java program to find first occurrence of a character in a given string
package com.stringAssignment;

public class StringFindFirstOccerance {

	public static void findFirstOccurenceChar(String str) {
		
		int index = str.indexOf('L');
		System.out.println("1st Occurance of char 'L' is " + index);

	}

	public static void main(String[] args) {
		String s = "I Love Coding, Love Gaming";

		findFirstOccurenceChar(s);

	}
}
