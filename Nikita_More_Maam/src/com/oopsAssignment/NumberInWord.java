package com.oopsAssignment;

import java.util.*;

public class NumberInWord {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		System.out.println("Program For Number to Word:- ");

		System.out.println("Prime Number in Word");

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
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 0:
			System.out.println("Zero");
			break;
		default:
			System.out.println("Please Enter number between 1-5..!");
		}
		in.close();
	}
}
