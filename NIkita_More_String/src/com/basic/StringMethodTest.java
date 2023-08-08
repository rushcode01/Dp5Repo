package com.basic;

public class StringMethodTest {
public static void main(String[] args) {
	
	String s1 = "hello, hi";
	
	String s2 ="WELCOME";
	
	s1.toUpperCase();
	System.out.println(s1);// hello, hi
	
	// case1
	System.out.println(s1.toUpperCase());// HELLO
	
	//case2
	s1 = s1.toUpperCase();
	System.out.println(s1);//HELLO
	
	String s3 = s2.toLowerCase();
	System.out.println(s3);// wlcome
	
	
	/////////////////
//	length() - how many chars are present
	int len = s1.length();
	System.out.println("Length of s1 : "+ len);
	System.out.println("Length of s2 : "+ s2.length());
	
	//charAt(int index)
//	char ch1 = s1.charAt(1);
//	char ch2 = s1.charAt(10);//java.lang.StringINdexPutOfBondries
//	char ch1 = s1.charAt('a');//no compile time error
//	char ch1 = s1.charAt(s1.length()); //java.lang.StringINdexPutOfBondries
	char ch1 = s1.charAt(s1.length()-1);
	System.out.println("char present at index " + ch1);
	
}
}
