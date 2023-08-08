//38.	 WAP to display all square number in array. Means 
//e.g. arr[] = [23, 43, 25, 49, 12, 9, 78, 66, 39, 0] so output is 25, 49, 9.
package com.ArrayAssignment;

public class ArrayDisplaySqarefromGivenArray {

	public static int[] findSqFromArray(int arr[]) {

		int i, j, len = arr.length;

		for (i = 0; i < len; i++) {
			int sq = i * i;
			for (j = 0; j < len - 1; j++) {
				if (arr[j] == sq) {
					System.out.print(arr[j] + " ");
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 23, 43, 25, 49, 12, 9, 78, 66, 39, 0 };
		findSqFromArray(arr);
	}
}
