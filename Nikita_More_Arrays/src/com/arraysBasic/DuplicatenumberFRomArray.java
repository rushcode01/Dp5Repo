package com.arraysBasic;

public class DuplicatenumberFRomArray {
	
	public static void findDuplicatenum(int arr[]) {
		
		int i, j, len = arr.length,count;
		
		for(i = 0; i<len; i++) {
			count = 1;
			if(arr[i] == 0 )
				continue;
			for(j = i+1 ; j<len ; j++) {
				if(arr[i]== arr[j]) {
					count++;
					arr[j] = 0;
				}
			}
			if(count > 1) {
				System.out.println(arr[i]);
			}
		}
	}
public static void main(String[] args) {
	int num[] = { 22,34,3,5,6,7,22,3,4,5,6,7};
	findDuplicatenum(num);
	
}
}
