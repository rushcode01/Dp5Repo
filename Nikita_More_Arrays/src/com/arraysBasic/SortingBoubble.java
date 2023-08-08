
package com.arraysBasic;

public class SortingBoubble {

	public static int[] sortingBoubble(int num[]) {
		int i, j, len = num.length;

		for (i = 0; i < len; i++) {

			for (j = 0; j < len - 1; j++) {
				
				if (num[j] > num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int arr[] = { 21, 435, 768, 978, 23, 43, 657 };
		int sortNum[] = sortingBoubble(arr);
		for (int s : sortNum) {
			System.out.print(s + " ");
		}
	}
}
