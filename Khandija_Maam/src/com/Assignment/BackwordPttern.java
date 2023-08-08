package com.Assignment;

public class BackwordPttern {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 8; i++) {
			for (j = 1; j <= (8 - j); j++) {
				System.out.print("");
			}
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 1; i <= (8 - i); i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("");
			}
			for (j = 1; j <= 2 * (8 - i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
