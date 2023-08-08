package com.whileloop;

import java.util.*;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = in.nextInt();
		int i = 2;
		int count = 0;
		while (i < num) {
			if (num % i == 0) {

				count++;
			}
			i++;

		}
		if (count == 0) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}
