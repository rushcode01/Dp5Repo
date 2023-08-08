
package com.ArrayAssignment;

public class ArrayFindMaxAndMin {

	public static int findMax(int num[]) {
		int max = num[0];
		int i, len = num.length;
		for (i = 1; i < len; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		return max;
	}

	public static int findMin(int num[]) {
		int min = num[0];
		int i, len = num.length;
		for (i = 1; i < len; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {

		int arr[] = { 54, 67, 32, 87, 23, 9, 111 };

		System.out.println("Max Number : " + findMax(arr));
		System.out.println("Min Number : " + findMin(arr));

	}
}
