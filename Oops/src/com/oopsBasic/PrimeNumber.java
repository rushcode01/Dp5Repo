package com.oopsBasic;

import java.util.*;

public class PrimeNumber {

	int s, n, i, j;

	public void init(int S, int N) {
		s = S;
		n = N;
	}

	public void prime() {
		for (i = s; i <= n; i++) {
			int count = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Start number");
		int S = in.nextInt();
		System.out.println("Enter End number");
		int N = in.nextInt();
		PrimeNumber p1 = new PrimeNumber();
		p1.init(S, N);
		p1.prime();

	}
}
