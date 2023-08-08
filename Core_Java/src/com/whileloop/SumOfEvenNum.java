package com.whileloop;

import java.util.*;

public class SumOfEvenNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Number:-");
		
		int num = in.nextInt();
		int temp = num;
		int sum = 0;
		while(num > 0) {
			int digit = num % 10;
			if(num% 2 == 0) {
				sum += digit;
			}
			num = num /10;
		}
		System.out.println("The sum of "+ temp +" is " + sum);
	}
}
