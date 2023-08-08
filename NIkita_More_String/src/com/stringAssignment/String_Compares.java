
//Write a Java program to compare two strings. 
package com.stringAssignment;

public class String_Compares {

	public static void main(String[] args) {
		String s1 = "Coding";
		String s2 = "coding";
		String s3 = "Coding";
		int s = s1.compareTo(s2);
		int s4 = s1.compareTo(s3);
		if (s == 0) {
			System.out.println("Both String Are Same");
		} else {
			System.out.println("Both String Are not Same");
		}
		if (s4 == 0) {
			System.out.println("Both String Are Same");
		} else {
			System.out.println("Both String Are not Same");
		}
	}
}
