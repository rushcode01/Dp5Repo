package com.basic;

public class Test {

	public static void main(String[] args) {

		int a = 2;
		int b = 2;

		int x = a++ + ++b;
		System.out.println(x + " " + a + " " + b);

		x = ++b - --a;
		System.out.println(x + " " + a + " " + b);

		x = ++a - --b - b;
		System.out.println(x + " " + a + " " + b);

		x = a-- - b-- - b;
		System.out.println(x + " " + a + " " + b);

		x = --a - ++b + a++;
		System.out.println(x + " " + a + " " + b);
	}
}
