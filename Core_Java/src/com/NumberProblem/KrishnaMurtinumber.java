package com.NumberProblem;

import java.util.Scanner;

public class KrishnaMurtinumber {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = in.nextInt();
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			int fact = 1;
			for (int i = 1; i <= digit; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			num = num/10;
			System.out.println(fact);
		}
		System.out.println(sum);
		if(sum == temp) {
			System.out.println("This is krishnamurti NUmber");
		}else {
			System.out.println("This is Not krishnamurti NUmber");
			
		}
	}
}
