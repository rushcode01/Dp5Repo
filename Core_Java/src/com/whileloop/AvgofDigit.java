package com.whileloop;

import java.util.*;

public class AvgofDigit {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number: ");

		int num = in.nextInt();
		int temp = num;
		int sum =0;
		double count = 0;
		
		while(num > 0) {
			double digit = num % 10;
			sum += digit;
			num = num / 10;
			count++;
				
		}
		num = temp;
		
		System.out.println("Avg of " + num + " is " +(sum/count));
	}
}
