package com.ArrayAssignment;

public class FiidAvgofGivenArrayWithoutMinMax {
	public static int[] findAvg(int arr[]) {
		int i, j, len = arr.length;
		for (i = 0; i < len; i++) {
			for (j = 0; j < len - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		int min = arr[0], max = arr[len - 1];
		double sum = 0;

		for (j = 0; j < len; j++) {

			sum = sum + arr[j];
		}

//        
		sum = sum - min - max;
		double avg = sum / (len - 2);
		System.out.println(avg);
		return arr;
	}

	public static void main(String[] args) {
		int num[] = { 23, 45, 76, 98, 93, 32 };
//		int num[] = {10, 5, 8, 20, 7, 15};
		findAvg(num);
//		for(int a:s) {
//			System.out.print(a+ " ");
//		}

	}
}
