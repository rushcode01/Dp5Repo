package com.basicif;
import java.util.Scanner;


public class IfConditionDrivingProgram {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Your Age:- ");
		
		int age = in.nextInt();
		
		if (age > 18) {
			System.out.println("You can Drive a Car");
		}
		else {
			System.out.println("Your Can not Drive a Car");
		}
	}
}
