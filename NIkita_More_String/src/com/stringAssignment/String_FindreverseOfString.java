//Write a Java program to reverse order of words in a given string.
package com.stringAssignment;

import java.util.Scanner;

public class String_FindreverseOfString {
	public static void reverseString(String s) {
		int i, len = s.length();
        
		String s1 = "";
		for (i = len - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			s1 += ch;
		}
		System.out.println("-------reverse String----------\n" + s1);
//           System.out.println(s);
		if (s1.equals(s)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("not Palindrom");

		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = in.next();
		System.out.println("-------Original String----------\n" + str);
		reverseString(str);

	}
}
