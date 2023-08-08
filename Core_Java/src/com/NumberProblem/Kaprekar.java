package com.NumberProblem;

import java.util.*;

public class Kaprekar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int temp = num;
		int sq = num * num;
		int count = 0;
		num = temp;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		int pro = 1;
		for (int i = 1; i <= count; i++) {
			pro = pro * 10;
		}
		System.out.println(sq);

		int sum = 0;
		while (sq > 0) {
			int sqr = sq % pro;
			System.out.print(sqr + " ");
			sum = sum + sqr;
			// System.out.println(sum);
			sq = sq / pro;
		}
		//		System.out.println(sum);
		if (sum == temp) {
			System.out.println("\nThis is Kaprekar Number.");
		} else {
			System.out.println("\nThis is not Kaprekar Number.");
		}
	}
}
