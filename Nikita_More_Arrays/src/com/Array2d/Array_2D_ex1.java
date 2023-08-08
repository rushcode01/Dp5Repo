package com.Array2d;

public class Array_2D_ex1 {

	public static void main(String[] args) {
		int mat1[][]= {{10,20},{30,40}};
		int mat2[][]= {{1,2},{3,4}};
		int sum[][] = new int [2][2];
		
		for(int i = 0; i< 2; i++) {
			for(int j = 0; j< 2; j++) {
				sum [i][j]=mat1[i][j]+mat2[i][j];
			}			
		}
		System.out.println("---------sum of two Array-------");
		for(int i = 0; i< 2; i++) {
			for(int j = 0; j< 2; j++) {
				System.out.print(sum[i][j] + "\t");
			}			
			System.out.println();
		}
	}
}
