package com.Array2d;

public class Array2D_Transpose1 {
	public static void main(String[] args) {
		int mat[][] = { { 11, 22 }, { 33, 44 } };
		int i, j;
		int trans[][] = new int[2][2];

		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				trans[j][i] = mat[i][j];
			}
		}
		System.out.println("-----mat------");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print(mat[i][j] + "\t");

			}
			System.out.println();
		}
		System.out.println("-----Trans------");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print(trans[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
