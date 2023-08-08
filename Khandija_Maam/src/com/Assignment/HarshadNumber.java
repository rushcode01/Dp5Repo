//Q1)Java program to determine whether number is harshad or not
//
//A number is said to be the Harshad number if it is divisible by the sum of its digit. For example, if number is 156, then sum of 
//its digit will be 1 + 5 + 6 = 12. Since 156 is divisible by 12. So, 156 is a Harshad number.

package com.Assignment;
import java.util.*;
public class HarshadNumber {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = in.nextInt();
		int temp = num;
		int sum = 0;
		
		while(num > 0) {
			int digit = num % 10;
			sum += digit;
			num /=10;
		}
		System.out.println(sum);
		if(temp % sum == 0) {
			System.out.println("This is Harshad Number");
		}else {
			System.out.println("Not A Harshad Number");
		}
	}
}
