//17.	WAP to merge 2 arrays to 3rd array. 3rd array should not have elements of same value.

package com.ArrayAssignment;

public class ArrayMeargTwoArrayPRintSameAtOnce {
	public static int[] meargeOfTwoArray(int arr1[], int arr2[]) {
		int i, j ,k, len1 = arr1.length;
		int len2 = arr2.length;
		int len3 = len1 + len2;
		int arr3[] = new int[len3];
		int index = 0;
		boolean status = false;
		for (k = 0; k < len1; k++) {
//			arr3[index++] = arr1[k];
			arr3[k] = arr1[k];
			index++;
		}
		for (i = 0; i < len2; i++) {
			status = false;
			for (j = 0; j < index; j++) {
				if (arr2[i] == arr3[j]) {
					status = true;
				}
			}
			if (status)
				continue;
			else {
				arr3[index++] = arr2[i];
			}
		}
		return arr3;
	}

	public static void main(String[] args) {
		int num1[] = { 10, 20, 30, 40, 50 };
		int num2[] = { 40, 50, 30, 70, 80 };
		int mergeArr[] = meargeOfTwoArray(num1, num2);
		for (int a : mergeArr) {
			if (a != 0)
				System.out.print(a + " ");
		}
	}
}
