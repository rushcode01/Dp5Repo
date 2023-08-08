package com.arraysBasic;

public class FindEvenNosFromArray {

	public static void findEvennums(int a[]) {
		int i, len = a.length;

		for (i = 0; i < len; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
//		for(int number : a) {
//			if (a[i] % 2 == 0) {
//				System.out.println(a[i]);
//			}
//		}
	}
	public static void fimdOddNumbers(int a[]) {
		int j,len = a.length;
		for(j = 0; j < len; j++) {
			if(a[j]%2!=0) {
				System.out.println(a[j]);
			}
		}
	}

	public static void main(String[] args) {

		int number[] = { 12, 43, 60, 10, 17, 19 };
		System.out.println("Even number form Arry");
		findEvennums(number);
		System.out.println("Odd number form Arry");
		
		fimdOddNumbers(number);		
	}
}
