package com.ArrayAssignment;

//Wap to print reverse  array
public class ArrayReverse {
	public static void main(String[] args) {
		int arr[] = { 3, 90, 45, 29, 37, 78 };

		int i, len = arr.length;

		System.out.println("=====Arrya inb reversae=====");
		for (i = len - 1; i >= 0; i--) {
			System.out.print(arr[i]+" ");

			// limitation of for each
			// for each iterates in forward direction
		}
	}
}
