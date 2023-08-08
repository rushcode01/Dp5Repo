//15.	WAP to find the second smallest element in an array.
package com.ArrayAssignment;

public class FindSecSmallestNumberInArray {
	public static int findsecSamllestnum(int arr[]) {
		int i, j, len = arr.length;
		for (i = 0; i < len; i++) {
			for (j = 0; j < len - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr[len - 2];
	}

	public static void main(String[] args) {
		int num[] = { 72, 56, 89, 23, 90, 10 };

		int secMin = findsecSamllestnum(num);
		System.out.println(secMin);

	}
}
