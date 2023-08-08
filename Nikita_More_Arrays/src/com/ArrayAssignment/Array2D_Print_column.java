//Initialize 2d array 
//2 rows 3 columns and 
//Column value to printed

package com.ArrayAssignment;

public class Array2D_Print_column {
	public static void printColumn(int arr[][]) {
		int i, j, rlen = arr.length;
		int clen = arr[0].length;
		for (i = 0; i < clen; i++) {
			int max = arr[0][i];
			for (j = 0; j < rlen; j++) {
//				System.out.println(arr[j][i] );
				if(arr[j][i]>max) {
					max = arr[j][i];
				}
			}
//			System.out.println("-------------");
			System.out.println("max in column "  + max);
		}

	}

	public static void main(String[] args) {
		int arr[][] = { { 2, 7, 1 }, { 9, 5, 8 } };
		printColumn(arr);

	}
}
