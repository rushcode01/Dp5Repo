//WAP to calculate x y  where x is base and y is index without using readymade function.

package com.LoopAssignment;

import java.util.*;

public class PowerCalulate {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Base:");
		int base = in.nextInt();
		System.out.println("Enter Index:");
		int index = in.nextInt();
		int power = 1;
		for (int i = 1; i <= index; i++) {
			power = power * base;
		}
		System.out.println(power);
	}

}
