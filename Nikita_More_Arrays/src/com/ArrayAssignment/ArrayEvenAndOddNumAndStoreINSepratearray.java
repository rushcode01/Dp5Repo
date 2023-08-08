//11.	WAP to put even and odd elements of array in two separate arrays.
package com.ArrayAssignment;

public class ArrayEvenAndOddNumAndStoreINSepratearray {
	public static void EvenAndOddArray(int arr[]) {

		int i, len = arr.length;
		int ieven = 0, iodd = 0;
		int newEven[] = new int[len];
		int newOdd[] = new int[len];
		for (i = 0; i < len; i++) {
			if (arr[i] % 2 == 0) {
				newEven[ieven] = arr[i];
				ieven++;
			} else {
				newOdd[iodd] = arr[i];
				iodd++;
			}
		}
		System.out.println("Printing Array of even NUmber:");
		for (i = 0; i < ieven; i++) {
			System.out.println(newEven[i]);
		}
		System.out.println("Printing Array of odd NUmber:");
		for (i = 0; i < iodd; i++) {
			System.out.println(newOdd[i]);
		}
	}

	public static void main(String[] args) {
		int num[] = { 233, 54, 67, 78, 44, 34 };
		EvenAndOddArray(num);
	}
}
