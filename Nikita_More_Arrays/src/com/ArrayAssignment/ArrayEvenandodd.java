//3.	WAP to take array and find even and odd numbers
package com.ArrayAssignment;

import java.util.Scanner;

public class ArrayEvenandodd {

	public static void findEvenNum(int a[]) {
		int i, len = a.length;
		for (i = 0; i < len; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}

	public static void findOddNum(int a[]) {
		int i, len = a.length;
		for (i = 0; i < len; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("How many number do you want to enter:");
		int i, n = in.nextInt();
		int num[] = new int[n];

		for (i = 0; i < n; i++) {
			System.out.println("Enter number:");
			num[i] = in.nextInt();
		}
		System.out.println("===========");
		findEvenNum(num);
		System.out.println("===========");
		findOddNum(num);

	}
}
