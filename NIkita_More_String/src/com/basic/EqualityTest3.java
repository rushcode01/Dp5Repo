package com.basic;

public class EqualityTest3 {
	public static void main(String[] args) {
		// s1=s2 0
		// s1>s2 positive
		// s1<s2 negative

		String s1 = "a";//97
		String s2 = "a";//97
		String s3 = "f";//103   ascii value

		int a = s1.compareTo(s2);// 0 no 0 pos neg
		System.out.println("a= " + a);

		
		if (a == 0) {
			System.out.println("both String are equal");
		} else {
			System.out.println("both String are not equal");
		}

		int b = s1.compareTo(s3);
		System.out.println("b= " + b);
		if (b == 0) {
			System.out.println("both String are equal");
		} else {
			System.out.println("both String are not equal");
		}
		
		
		String s5 = "welcome";
		String s6 = "hello";
		int c = s5.compareTo(s6);
		System.out.println("c="+c);
		
		String s7 = "WELCOME";
		
		int d = s5.compareToIgnoreCase(s7);
		System.out.println("d = " +d);
		if (d == 0) {
			System.out.println("both String are equal");
		} else {
			System.out.println("both String are not equal");
		}
	}
}
