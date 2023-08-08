//Write a program to check whether a year is leap year or not...

package com.basiccode;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
	
		System.out.println("Welcome to Leap year Check Progaram...");
		
		System.out.println("Enter Year:");
		Scanner in = new Scanner(System.in);
		
		int year = in.nextInt();
		
		if (year%4 == 0 || year%400 == 0) {
			System.out.println("This is leap year.");
		}else {
			System.out.println("This is not leap Year.");
		}
		
		
		
		
		
		
	}
}
