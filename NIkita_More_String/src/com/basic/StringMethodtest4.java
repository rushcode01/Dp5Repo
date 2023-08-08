package com.basic;

public class StringMethodtest4 {

	public static void main(String[] args) {
		String s1 = "ThinkQuotient";

		String s2 = s1.substring(5);//int begin index
		// traverse from beginindex to end og lem-1
		System.out.println(s2);
		String s3 = s1.substring(0, 5);
		// start with begin index and goes till endindex-1
		System.out.println(s3);

	}
}
