//WAP to swap array like input array is [2, 4, 9, 0], so your output array must be [9, 0, 2, 4] 
package com.ArrayAssignment;

public class ArrayPrintarrayAsperUserp26 {
	public static void interChangrPlace(int arr[]) {
		int i,j, len = arr.length;
		for (i = len/2; i < len; i++) {
			
			System.out.print(arr[i] + " ");
		}
		for(j = 0; j < len/2; j++ ) {
		System.out.print(arr[j]+ " ");
		}
		
	}
public static void main(String[] args) {
	int num[] = {2,4,9,0};
	interChangrPlace(num);
}
}
