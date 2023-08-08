package com.basic;

public class StringMethod3 {
public static void main(String[] args) {
	String s1 = "rose is red";
	
//	s1 = s1.replace('r', 't');
	String s2 = s1.replace('r', 't');
	System.out.println(s2);
	
	String s3 = s1.replace("red", "yellow");
	System.out.println(s3);
}
}
