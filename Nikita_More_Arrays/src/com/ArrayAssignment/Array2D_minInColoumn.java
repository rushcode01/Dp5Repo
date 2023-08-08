////WAP to print minimum in columns. Means e.g.
//arr[][]={{22, 31, 9}, {12, 5, 16}, {34, 42, 2}}
//output is: 12, 5, 2.
package com.ArrayAssignment;

public class Array2D_minInColoumn {
	public static void main(String[] args) {
		int[][] arr = { { 22, 31, 9 }, { 12, 5, 16 }, { 34, 42, 2 } };

		int numRows = arr.length;
		int numCols = arr[0].length;

		for (int j = 0; j < numCols; j++) {
			int min = arr[0][j];
			for (int i = 1; i < numRows; i++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
			System.out.println("Maximum in column " + (j + 1) + ": " + min);
		}
	}
}
