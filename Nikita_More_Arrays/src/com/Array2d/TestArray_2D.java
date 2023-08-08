package com.Array2d;

public class TestArray_2D {
public static void main(String[] args) {
	int mat[][];
	mat = new int [3][3];
	//or
	int arr[][]= new int[2][2];
	//or
	int rows = 4;
	int cols = 3;
	
	int arr1[][] = new int [rows] [cols];
	System.out.println("----Element in 2d array before insertion----");
	System.out.println(arr[0][0]);
	System.out.println(arr[0][1]);
	System.out.println(arr[1][0]);
	System.out.println(arr[1][1]);
	
	arr[0][0]=52;
	arr[0][1]=45;
	arr[1][0]=78;
	arr[1][1]=98;
	
	System.out.println("----Element in 2d array after insertion----");
	System.out.println(arr[0][0]);
	System.out.println(arr[0][1]);
	System.out.println(arr[1][0]);
	System.out.println(arr[1][1]);

	System.out.println("----Element in 2d array using for loop----");
	for(int i= 0; i< 2; i++) {
		for(int j= 0; j< 2; j++) {
		System.out.print(arr[i][j]+ " ");
	}
		System.out.println();
	}
	System.out.println("----Element in 2d array using for loop----");
	for(int i= 0; i< 2; i++) {
		for(int j= 0; j< 2; j++) {
			System.out.println("Element at arr [" + i + "][" + j +"] =  " +arr[i][j]+ " ");
		}
	
	}
	
}
}
