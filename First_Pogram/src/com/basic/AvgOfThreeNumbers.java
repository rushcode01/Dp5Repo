package com.basic;
import java.util.Scanner;

public class AvgOfThreeNumbers {
	public static void main(String args[]) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the numbers to find Average of it,");
		
		System.out.println("Enter First Number:");
		int num1 = in.nextInt();
		System.out.println("Enter Second Number:");
		int num2 = in.nextInt();
		System.out.println("Enter Third Number:");
		int num3 = in.nextInt();
		
		int avg = (num1 + num2 + num3)/3;
		
		System.out.println("Average of "+ num1 + "," + num2 + " and " + num3 + " is " + avg + ".");
	}

}
