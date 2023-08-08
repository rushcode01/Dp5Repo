package com.whileloop;

import java.util.*;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number :");

		int num = in.nextInt();
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			int cube = digit * digit * digit;
			sum = cube + sum;
			num = num / 10;
		}
		num = temp;

		if (num == sum) {
			System.out.println("Armstrong...!");
		} else {
			System.out.println("NOt Armstrong");
		}
	}
}
