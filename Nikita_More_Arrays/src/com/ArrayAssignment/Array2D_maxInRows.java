//WAP to print maximum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} 
//output is: 31 and 25. 
package com.ArrayAssignment;

public class Array2D_maxInRows {

	public static int[][] findMaxinRow(int arr[][]) {
		int i, j, len = arr.length;
		for (i = 0; i < len; i++) {
			int max = arr[i][0];
			for (j = 1; j < len; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
			System.out.println("Maximum in row " + (i + 1) + ": " + max);
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[][] = { { 22, 31, 9 }, { 12, 25, 16 } };
		findMaxinRow(arr);
	}
}
