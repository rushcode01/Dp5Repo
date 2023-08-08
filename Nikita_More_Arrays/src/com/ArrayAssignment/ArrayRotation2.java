//given {3,1,7,8} o/p {8,7,1,3}

package com.ArrayAssignment;

import java.util.Arrays;

public class ArrayRotation2 {

	public static void findoutput(int arr[]) {
		int i, len = arr.length;
		for (i = 0; i < len / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[len - 1 - i];
			arr[len - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 3, 1, 7, 8 };
		findoutput(arr);
	}
}
