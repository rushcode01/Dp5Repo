package com.NumberProblem;

import java.util.*;

public class SumofprimeNumberRange {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Start Number:");
		int start = in.nextInt();
		System.out.println("Enter End Number:");
		int end = in.nextInt();
		int sum = 0;
		for(int i = start; i<= end;i++) {
			int count = 0;
			for(int j =1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i + " ");
				sum = sum + i;
			}
		}
		System.out.println("\nSum of prime number from " + start+" to "+ end + " is "+sum);
	}
}
