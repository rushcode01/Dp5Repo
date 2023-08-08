package com.arraysBasic;

import java.util.*;

public class ArrayDemo3 {
	public static void main(String[] args) {
		double marks[] = new double[10];

		int len = marks.length;
		int i, n;
		Scanner in = new Scanner(System.in);
		System.out.println("How many marks you want to add in arr:" + "");
		n = in.nextInt();
		for (i = 0; i < n; i++) {
			System.out.println("Enter Marks :");
			marks[i] = in.nextDouble();

		}
		System.out.println("-----------Array----------");
		for (i = 0; i < n; i++) {
			System.out.println("marks[" + i + "]" + marks[i]);
		}
	}
}
