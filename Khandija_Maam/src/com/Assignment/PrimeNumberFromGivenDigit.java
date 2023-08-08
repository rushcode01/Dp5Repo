package com.Assignment;

import java.util.Scanner;

public class PrimeNumberFromGivenDigit {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number:");

		long num = in.nextLong();
		long digit;
		while (num > 0) {
			digit = num % 10;
			num = num / 10;
			if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
				System.out.print(digit + " ");
			}
		}
	}
}
