package com.loopAssignment;

import java.util.Scanner;

public class SumOfAllEvenNum {
     public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	System.out.println("Program for to find sum of even number from 1 - n :");
	System.out.println("Enter Number:");
	
	int n = in.nextInt();
	
	int i;
	int sum = 0;
	for(i =1; i <= n; i++) {
		if(i%2 == 0) {
			sum = sum + i;
		}
	}
	System.out.println(sum);
 }
}
