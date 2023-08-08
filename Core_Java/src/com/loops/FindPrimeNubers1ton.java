package com.loops;

import java.util.*;

public class FindPrimeNubers1ton {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number starting Num:");
		int s = in.nextInt();
		System.out.println("Enter Number Ending Num:");
        int n = in.nextInt();
		int i, j;
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
}
