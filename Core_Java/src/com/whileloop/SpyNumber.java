package com.whileloop;

import java.util.*;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Number:");

		int num = in.nextInt();
		int sum = 0;
		int pro = 1;
		while (num > 0) {
			int digit = num % 10;
			sum += digit;
			pro *= digit;
			num = num/10;
		}
		if(sum == pro) {
			System.out.println("This is SPY Number");
		}else {
			System.out.println("Not A SPY NUmber");
		}
	}
}
