//27.	Write a Java program to find a missing number in an array. Means e.g. 
//array has 1 to n element in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] 
//		So missing no is 5 
package com.ArrayAssignment;

import java.util.*;

public class ArrayFindMissingNumber {
	public static int[] misingElement(int arr[]) {

		int i, j, len = arr.length;
		for (i = 0; i < len; i++) {
			for (j = 0; j < len - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		int min = arr[0], max = arr[len - 1], fin;

		for (i = min; i <= max; i++) {
			int flag = 0;
			for (j = 0; j < len; j++) {
				if (i == arr[j]) {
					flag = 1;
				}
			}
			if (flag == 0) {

//				System.out.println("Missing Number is " + i);
				// its use for showing missing element
			}
			System.out.print(i + ", ");// use for show full array with missing element
		}
		return arr;
	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 6, 7, 12 };
		int len = num.length;
		System.out.println(Arrays.toString(num));
		System.out.println("======================");
		int[] min = misingElement(num);
//		System.out.println("Min Num " + min[0]);
//		System.out.println("Max num " + min[len - 1]);
//		int fina[] = misingElement(min);
//		for(int s: fina) {
//			System.out.println(s);
//		}

	}

}
