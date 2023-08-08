package com.LoopAssignment;

import java.util.Scanner;

public class Numberfreq {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Mobile Number");
		int num = in.nextInt();
		int i, temp;
		int count;
		for (i = 0; i <= 9; i++) {
			count = 0;
			temp = num;
			while (temp > 0) {
				int digit = temp % 10;

				if (digit == i) {
					count++;
				} 
				temp = temp / 10;

			}
			if (count > 0) {
				System.out.println(i + "\t" + count);
			}
		}
	}
}
