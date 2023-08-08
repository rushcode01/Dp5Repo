package com.Assignment;

import java.util.*;

public class PrimeNumber {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Number:");
		long num = in.nextInt();
		int i, j;
		for (i = 2; i <= num; i++) {
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
}
