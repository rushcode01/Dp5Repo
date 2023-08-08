package com.ArrayAssignment;
//1.	WAP to add elements to single dimensional int array and print elements from 1D array
import java.util.*;

public class AddElement1D {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many elements to add:");
		int i, n = in.nextInt();
		int element[] = new int[n];

		for (i = 0; i < n; i++) {
			System.out.println("Enter Element");
			element[i] = in.nextInt();
		}
		System.out.println("------Element Print------");
		for (i = 0; i < n; i++) {
			System.out.print(element[i]);
		}
	}
}
