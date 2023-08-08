//10.	WAP to insert an element in a specific position into an array.
package com.ArrayAssignment;

import java.util.*;

public class ArrayReplacingPosition {
	public static void replaceElement(int num[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter which element you want to insert: ");
		int ele = in.nextInt();
		System.out.println("Enter a position:");
		int p = in.nextInt();
		int i, len = num.length;
		for (i = 0; i < len; i++) {
			if (i == p) {
				num[i] = ele;
			}
			System.out.print(num[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 78, 2, 55, 0, 8, 42, 79, 0, 0, 69, 56 };
		replaceElement(arr);
	}
}
