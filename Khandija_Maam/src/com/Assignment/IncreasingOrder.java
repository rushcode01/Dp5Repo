//Java program to print whether it is increasing number
//
// If the first number is less than the second number, and the second number is 
// less than the third number, the program prints "Numbers are in Increasing Order". 
// for eg :1234  is increasing   1<2 2<3 3<4 
//
//4598  not incresing number

package com.Assignment;

import java.util.*;

public class IncreasingOrder {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = in.nextInt();
		int digit = 0;
		int newn = 0;
		while (num > 0) {
			digit = num % 10;

			num = num / 10;
			newn = num % 10;
//			System.out.println(digit);

			if (digit >= newn) {
				continue;
			} else {
				break;
			}
		}
		if (digit >= newn) {
			System.out.println("Increasing order");
		} else {
			System.out.println("not increasing");
		}
	}
}
/*
 * num = 123
 * 
 * 
 * */
 