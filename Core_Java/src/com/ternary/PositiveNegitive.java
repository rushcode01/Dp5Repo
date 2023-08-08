package com.ternary;

import java.util.*;

public class PositiveNegitive {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter number:");
		int num = in.nextInt();

		String ans = num > 0 ? num == 0 ? "Zero": "number is +ve" : num < 0 ? "number is -ve ":"zero";
		System.out.println(ans);
	}
}
