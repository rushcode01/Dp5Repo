// Write a Java program to find the common elements between two arrays (int values) Means 
// e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and arr2[] = [39, 25, 15, 23, 55, 91, 66, 22],
// so common between two arrays are 23 and 91
package com.ArrayAssignment;

import java.util.Arrays;

public class FindSameElementBetTwoArray {
	public static int[] meargeOfTwoArray(int arr1[], int arr2[]) {
		int i, j, k, len1 = arr1.length;
		int len2 = arr2.length;
		int len3 = len1 + len2;
		int arr3[] = new int[len3];
		int index = 0;
		for (k = 0; k < len1; k++) {
//			arr3[index++] = arr1[k];
			arr3[k] = arr1[k];
			index++;
		}
		for (i = 0; i < len2; i++) {
			for (j = 0; j < index; j++) {
				if (arr2[i] == arr3[j]) {
					System.out.println(arr3[j]);

				}
			}
		}
		return arr3;
	}

	public static void main(String[] args) {
		int num1[] = { 12, 23, 34, 67, 78, 91, 56 };

		int num2[] = { 39, 25, 15, 23, 55, 91, 66, 22 };
		System.out.println("Same Element form " + Arrays.toString(num1) + " And " + Arrays.toString(num2) + " is ");
		meargeOfTwoArray(num1, num2);

	}
}
