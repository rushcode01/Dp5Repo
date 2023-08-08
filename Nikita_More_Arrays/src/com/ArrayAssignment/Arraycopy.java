package com.ArrayAssignment;

import java.util.*;

public class Arraycopy {
	public static int[] arraycopy(int arr[]) {
		int i, len = arr.length;
		int carr[] = new int[len];
		for (i = 0; i < len; i++) {
			carr[i] = arr[i];
			System.out.print(carr[i] + " ");
		}
		return arr;
	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 6, 8, 7, 9 };
		System.out.println(Arrays.toString(num));
		System.out.println("-------------------");
		System.out.println("Array after Copy");
		arraycopy(num);

	}
}
