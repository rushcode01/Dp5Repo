package com.arraysBasic;

import java.util.Scanner;

public class FindSumOfArrayElemernt {

	public static int finfSumOfArray(int a[]) {
		int sum = 0;
		int length = a.length;
		for(int i = 0; i< length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int num[] = new int[10];
		int i, len = num.length,n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
        n = in.nextInt();
        
        for(i = 0; i < n ;i++) {
        	System.out.println("Enter Element");
             num[i] = in.nextInt();
        }
        int ans = finfSumOfArray(num);
        System.out.println("sum "+ans);
	}
}
