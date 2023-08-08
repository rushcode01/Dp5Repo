package com.ArrayAssignment;

public class ArraySecondMaxnumber {
	public static int findSecMaxNum(int[] arr) {
		int i, j, len= arr.length;
		for(i = 0; i<len; i++) {
			
			for(j = 0; j < len-1; j++) {
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr[len-2];
	}
public static void main(String[] args) {
	int num[] = {20, 0, 31, 45, 100, 1, 105, 90};
	int secmax =findSecMaxNum(num);
	System.out.println("sec Mam num = " +secmax);
	
}
}
