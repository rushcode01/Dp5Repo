//Write a Java program to find sum of all odd numbers between 1 to n.
package com.loopAssignment;

import java.util.*;

public class SumOfAllOddNum {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to find the sum of Odd number: ");
		System.out.println("Enter Number:");

		int n = in.nextInt();

		int i;
		int sum = 0;
		for (i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
