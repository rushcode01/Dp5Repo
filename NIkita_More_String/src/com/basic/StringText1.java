package com.basic;

public class StringText1 {
	public static void main(String[] args) {

		String s1 = "i love my india";

		int i, len = s1.length();
		for (i = 0; i < len; i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println("\n-----------Print in Upper case-----------");
		s1 = s1.toUpperCase();
		for (i = 0; i < len; i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println("\n-------------print in lower case-------------");
		for (i = 0; i < len; i++) {
			System.out.print(s1.toLowerCase().charAt(i));
		}
		
		// ptint ascii valu of every char
		System.out.println("\n-----------print Ascii value-----------");
		char ch;
		for(i = 0; i< len; i++) {
			ch = s1.charAt(i);
			System.out
			.println(ch + " = "+ (int)ch);
		}
	}
}
