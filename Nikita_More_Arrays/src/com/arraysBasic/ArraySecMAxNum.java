package com.arraysBasic;

public class ArraySecMAxNum {
	public static void findSecondmaxNum(int arr[]) {
		int i,j , max= arr[0], secMax = arr[1], len = arr.length;
	
		for(i = 0; i<len; i++) {
			if(arr[i] > max) {
				secMax = max;
				max = arr[i];
			}
			else if(arr[i]>secMax && max> arr[i] ) {
				secMax = arr[i];
			}
		}
		System.out.println("max " + max);
		System.out.println("sec Max " + secMax);
	}
public static void main(String[] args) {
	int num[] = {100,23,45,67,23,87,42};
	
	findSecondmaxNum(num);
	
}
}
