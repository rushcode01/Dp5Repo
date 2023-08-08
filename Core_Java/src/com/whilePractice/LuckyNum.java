package com.whilePractice;

import java.util.*;

public class LuckyNum {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Number:");
		int lucky = in.nextInt();

		System.out.println("Enter number to find How many time it Arrive:");
		int find = in.nextInt();
		int count = 0;

		while (lucky > 0) {
			int digit = lucky % 10;
			if (digit == find) {
				count++;
			}
			lucky = lucky / 10;
		}
		System.out.println( lucky + " ");
	}
}
