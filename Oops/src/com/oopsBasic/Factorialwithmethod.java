package com.oopsBasic;

import java.util.*;

public class Factorialwithmethod {

	int fact = 1;
	int i, n;

	public void n(int n1) {
		n = n1;
	}

	public void fact() {
		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
	}
	public void dis() {
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		Factorialwithmethod f1 = new Factorialwithmethod();
		f1.n(n1);
		f1.fact();
		f1.dis();

	}
}
