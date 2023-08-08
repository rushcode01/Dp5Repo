//43.	WAP to print minimum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} 
//output is: 9 and 12
package com.ArrayAssignment;

public class Array2D_mininRows {
	public static int[][] findmininRow(int arr[][]) {
		int i, j;
		for ( i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            for ( j = 1; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            System.out.println("Minimum in row " + (i + 1) + ": " + min);
        }
		return arr;
	}

	public static void main(String[] args) {
		int arr[][] = { { 22, 31,9 }, { 12, 25, 16 } };
		findmininRow(arr);
	}
}
