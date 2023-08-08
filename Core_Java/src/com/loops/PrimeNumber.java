package com.loops;

import java.util.*;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = in.nextInt();
		int count = 0;
		int i;
		for (i = 2; i < n; i++) {

			if (n % i == 0) {

				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a prime Number");
		}
	}
}
