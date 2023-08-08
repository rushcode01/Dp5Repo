package com.Array2d;

public class Array_2DDemo2 {

	public static void main(String[] args) {
		int mat [][] = {{23,45},{67,98}};
		System.out.println("----2D-----");
		for(int i = 0; i< 2; i++) {
			for(int j = 0; j< 2; j++) {
			System.out.print(mat[i][j] + "\t");
		}
			System.out.println();
		}
	}
}
