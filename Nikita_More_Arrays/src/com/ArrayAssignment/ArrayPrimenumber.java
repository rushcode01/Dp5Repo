
//6.	WAP to take array and print prime numbers
package com.ArrayAssignment;

import java.util.Scanner;

public class ArrayPrimenumber {

	public static void findPrimeNUmber(int a[]) {

		int j, i, len = a.length;
		for (i = 0; i < len; i++) {
			boolean isprime = true;
			for (j = 2; j < a[i]; j++) {
				if (a[i] % j == 0) {
					isprime = false;
				}
			}
			if (isprime == true) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many number do you want to add");
		int i, n = in.nextInt();

		int num[] = new int[n];

		for (i = 0; i < n; i++) {
			System.out.println("Enter number:");
			num[i] = in.nextInt();
		}
		System.out.println("==================");
		System.out.println("Prime Numbers");
		findPrimeNUmber(num);

	}
}
