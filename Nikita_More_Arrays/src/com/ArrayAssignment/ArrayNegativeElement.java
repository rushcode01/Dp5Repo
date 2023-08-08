//5.	WAP to print all negative elements in an array and also count total number
//of negative elements in an array.
package com.ArrayAssignment;

import java.util.Scanner;

public class ArrayNegativeElement {

	public static void findNegativeNum(int a[]) {
		int i, len = a.length;
		int count = 0;
		for (i = 0; i < len; i++) {
			if (a[i] < 0) {
				System.out.println(a[i]);
				count++;
			}
		}
		System.out.println(count + " Negative number");
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
		System.out.println("==============");
		System.out.println("Negative Number: ");
		findNegativeNum(num);
	}
}
