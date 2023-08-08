//20.	. WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23] 
package com.ArrayAssignment;

public class SecMinValuinArray {
	public static int findsecSamllestnum(int arr[]) {
		int i, j, len = arr.length;
		for (i = 0; i < len; i++) {
			for (j = 0; j < len - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr[len - 2];
	}

	public static void main(String[] args) {
		int num[] = { -20, 0, -25, 15, 19, 37, 23};

		int secMin = findsecSamllestnum(num);
		System.out.println(secMin);

	}
}
