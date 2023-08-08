package com.Array2d;

import java.util.Scanner;

public class Array_2DDemo {

	public static void main(String[] args) {
		int tab [][] = new int [3][3];
		int i, j, rows, cols;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter no of rows:");
		rows = in.nextInt();
		System.out.println("Enter no of cols:");
		cols = in.nextInt();
		
		System.out.println("Enter element in 2d Array\n");
		for(i = 0; i< rows; i++) {
			for(j = 0; j< cols; j++) {
				System.out.println("Enter Element for tab[" + i +"][" + j +"]" );
				tab[i][j] = in.nextInt();
			}
		}
		System.out.println("--------------2D Array---------------");
		for(i = 0; i< rows; i++) {
			for(j = 0; j< cols; j++) {
				System.out.print(tab[i][j] + "\t" );
			
			}
			System.out.println();
		}
		
	}
}
