//Write a Java program to find the duplicate values of an array of integer values. Means e.g.
//arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], so duplicates are 10 and 78. 

package com.ArrayAssignment;

public class ArrayDuplicateElementFind {

	public static void findDuplicatenumberAndCount(int num[]) {
		int i, j, len = num.length, count = 0;
		for (i = 0; i < len; i++) {
			count = 1;
			if (num[i] == '\0')
				continue;
			for (j = i + 1; j < len; j++) {

				if (num[i] == num[j]) {
					count++;
					num[j] = '\0';
				}
			}
			if (count > 1) {
				System.out.println(num[i] );
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {3, 10, 90, 78, 56, 10, 78, 34, 61 };
		System.out.println("Duplicate number");
		findDuplicatenumberAndCount(arr);
	}
}
