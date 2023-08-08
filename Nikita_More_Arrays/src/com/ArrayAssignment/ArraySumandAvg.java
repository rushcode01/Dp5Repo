//2.		WAP to accept dimension of 1D array and create and accept data in that array.
//Calculate the sum and average value of array elements.

package com.ArrayAssignment;

import java.util.*;

public class ArraySumandAvg {

	public static int findAddtionofNumber(int a[]) {
		int i, len = a.length;
		int sum = 0;
		for (i = 0; i < len; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static double findAvgofNumber(int a[]) {
		int len = a.length;
		int avg = findAddtionofNumber(a) / len;
//		System.out.println(len);
		return avg;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("How many number do you want to add?");
		int i, n = in.nextInt();
		int num[] = new int[n];

		for (i = 0; i < n; i++) {
			System.out.println("Enter number:");
			num[i] = in.nextInt();
		}

		System.out.println("=============");
		int ans = findAddtionofNumber(num);
		System.out.println("Sum of number is: " + ans);
		System.out.println("=============");
		double avgs = findAvgofNumber(num);
		System.out.println("Avg of of Number is: " + avgs);

	}
}
