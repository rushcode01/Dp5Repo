package com.Assignment;

import java.util.*;

public class SumOFEvenNumber {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = in.nextInt();
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			if (num % 2 == 0) {
				sum += digit;
			}
			num = num / 10;
		}
		System.out.println("Sum of Even Number From " + temp + " is: " + sum);
	}
}
