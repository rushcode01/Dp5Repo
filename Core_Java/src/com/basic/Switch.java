package com.basic;

import java.util.*;

public class Switch {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter 1st Number: ");
		int num1 = in.nextInt();

		System.out.println("Enter 2nd Number:");
		int num2 = in.nextInt();

		System.out.println("1.Addition \n2.Substraction \n3.Multiplication \n4.Division");
		System.out.println("Enter Your Choice");
		int choice = in.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Addition:" + (num1 + num2));
			break;
		case 2:
			System.out.println("Substraction:" + (num1 - num2));
			break;
		case 3:
			System.out.println("Multiplication:" + (num1 * num2));
			break;
		case 4: 
			System.out.println("Division:" + (num1 / num2));
			break;
			default: System.out.println("Invalid Choice!");
		}

	}
}
