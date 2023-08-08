package com.basiccode;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		// find mazimum number betn two 3 numbert
//		Scanner in = new Scanner(System.in);
//		int num1 = in.nextInt();
//		int num2 = in.nextInt();
//		int num3 = in.nextInt();
//
//		if (num1 > num2 && num1 > num3) {
//			System.out.println(num1);
//		} else if (num2 > num1 && num2 > num3) {
//			System.out.println(num2);
//		} else {
//			System.out.println(num3);
//		}
		
		// find factors of given number
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int i;
		for( i = 1;i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
