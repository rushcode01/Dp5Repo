package com.basic;

public class StringImmutable {
public static void main(String[] args) {
	String s1 = "india";
	String s2 = "india";
	String s3 = "india";
	
	System.out.println("s1 = " + s1);
	System.out.println("s2 = " + s2);
	System.out.println("s3 = " + s3);
	
	System.out.println("-------------------------");
	s1 = "usa";
	System.out.println("s1 = " + s1);
	System.out.println("s2 = " + s2);
	System.out.println("s3 = " + s3);
}
}
