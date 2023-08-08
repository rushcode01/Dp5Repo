package com.basic;

public class EqualityTest {
	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Ram";
		String s3 = s1;
		String s4 = "Sham";
		System.out.println("------------standard equality-------------");
		System.out.println("s1 == s2:" + (s1 == s2));// true
		System.out.println("s1 == s3:" + (s1 == s3));// true
		System.out.println("s1 == s3:" + (s1 == s4));// false

		
	}
}
