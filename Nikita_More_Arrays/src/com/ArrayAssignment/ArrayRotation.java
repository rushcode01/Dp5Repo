//WAP to print given array {4,5,6,7} o/p {7,4,5,6}
package com.ArrayAssignment;

import java.util.Arrays;

public class ArrayRotation {

	public static void findOutput(int arr[]) {
		int i, len = arr.length;
		int lastindex = len - 1;
		int lastidxvalue = arr[lastindex];
		for (i = len - 2; i >= 0; i--) {
			arr[lastindex] = arr[i];
			lastindex--;

			if (i == 0) {
				arr[i] = lastidxvalue;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		int arr[] = { 4, 5, 6, 7 };
		findOutput(arr);
	}
}
