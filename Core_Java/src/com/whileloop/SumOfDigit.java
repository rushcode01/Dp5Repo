package com.whileloop;

import java.util.*;

public class SumOfDigit {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = in.nextInt();

		int i = 1;
		int sum = 0;
		while (num > 0) {

			int digit = num % 10;
			sum += digit;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
