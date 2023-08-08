package com.switchs;

import java.util.*;

public class OneFive {
	public static void main(AreaOf args[]) {

		Scanner in = new Scanner(System.in);

		System.out.println("Program For Number to Word:- ");

		System.out.println("Enter Number 1 - 5");

		int num = in.nextInt();

		switch (num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Please Enter number between 1-5..!");
		}
	}
}
