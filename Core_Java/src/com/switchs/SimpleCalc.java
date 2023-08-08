package com.switchs;

import java.util.*;

public class SimpleCalc {
	public static void main(AreaOf[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter 1st Number:");
		int num1 = in.nextInt();

		System.out.println("Enter 2nd Number:");
		int num2 = in.nextInt();

		System.out.println("Arithmatic(+) \nSubtration(-) \nMultiplicatin(*) \nDivision(/)");
		System.out.println("Choise a Mathimatical operator");
		char ch = in.next().charAt(0);

		switch (ch) {
		case '+':
			System.out.println("Addition :" + (num1 + num2));
			break;
		case '-':
			System.out.println("Subtraction:" + (num1 + num2));
			break;
		case '*':
			System.out.println("Muktiplication:" +(num1 * num2));
			break;
		case '/':
			System.out.println("Division :" + (num1 / num2));
			break;
			default: System.out.println("Enter Valid Operator");
		}
	}
}
