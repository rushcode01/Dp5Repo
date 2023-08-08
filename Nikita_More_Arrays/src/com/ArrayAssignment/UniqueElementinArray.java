package com.ArrayAssignment;

public class UniqueElementinArray {

	public static void findUniqueNum(int arr[]) {
		int i, j, len = arr.length, count = 0;
		for (i = 0; i < len; i++) {
			count = 1;
			if (arr[i] == 0)
				continue;
			for (j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = 0;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}

	}

	public static void main(String[] args) {

		int num[] = { 11, 20, 11, 3, 20, 86, 11, 88, 3,76 };
		findUniqueNum(num);

	}

}
