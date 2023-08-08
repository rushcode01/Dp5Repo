//16.	WAP to count frequency of each element in an array.
package com.ArrayAssignment;

public class ArrayFindFrequencyofElement {

	public static void findFrequencyOfEachElement(int num[]) {
		int i, j, len = num.length, count = 0 ;
		for (i = 0; i < len; i++) {
			count = 1;
			if (num[i] == 0)
				continue;
			for (j = i + 1; j < len; j++) {

				if (num[i] == num[j]) {
					count++;
					num[j] = 0;
				}
			}
			if (count >= 1) {
				System.out.println(num[i] + " = " + count);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 1, 2, 3, 4, 5 };
		findFrequencyOfEachElement(arr);
	}
}
