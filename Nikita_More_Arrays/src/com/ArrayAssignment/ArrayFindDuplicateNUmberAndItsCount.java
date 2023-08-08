package com.ArrayAssignment;

public class ArrayFindDuplicateNUmberAndItsCount {

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
				System.out.println(num[i] + " = " + count);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10,20,33,77,10,33,44,10 };
		System.out.println("Duplicate number");
		findDuplicatenumberAndCount(arr);
	}
}
