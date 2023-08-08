package com.ArrayAssignment;

import java.util.Scanner;

public class ArrayFindElementInArrayAntitsPosition {

	public static void searchElementinArray(int arr[], int searchElement) {
		int i, len = arr.length, position = -1;
		for (i = 0; i < len; i++) {
			if (searchElement == arr[i]) {
				position = i;
				break;
			}
		}
		if (position != -1) {
			System.out.println(searchElement + " is present at indext "
					+ "7" + position);
		} else {
			System.out.println(searchElement + " is not present in given array");
		}
	}

	public static void main(String[] args) {
		int num[] = { 23, 45, 63, 52, 6, 7, 88 };
		int search;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number which you want to search");
		search = in.nextInt();
		searchElementinArray(num, search);

	}
}
