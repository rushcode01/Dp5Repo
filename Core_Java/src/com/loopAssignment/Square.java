package com.loopAssignment;

import java.util.*;

public class Square {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = in.nextInt();
		int i;
		for (i = 1; i <= n; i++) {
			System.out.println("Square of " + i + " is " + (i * i));
		}
	}
}
