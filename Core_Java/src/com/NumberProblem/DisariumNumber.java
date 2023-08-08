package com.NumberProblem;

import java.util.*;

public class DisariumNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Number:");

		int num = in.nextInt();
		int temp = num;
		int count =0;
		int sum =0;
		
		while(num>0) {
			num = num/10;
			count++;
		}
//		System.out.println(count);
		num = temp;
//		System.out.println(num);
		while(num>0) {
			int fact = 1;
			int digit = num%10;
//			System.out.println(digit);
			for (int i = 1; i <= count; i++) {
				fact = fact * digit;
			}
//			System.out.println(fact);
			sum = sum + fact;
			count--;
			num = num/10;

		}
//		System.out.println(temp);
//		System.out.println(sum);
		if(sum == temp) {
			System.out.println("Desirum");
		}else {
			System.out.println("Not Desirum");
		}
		//      System.out.println(pro);
	}
}
