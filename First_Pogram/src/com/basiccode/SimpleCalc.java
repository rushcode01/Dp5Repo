package com.basiccode;
import java.util.Scanner;

public class SimpleCalc {
	public static void main(String args []) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Calculator");
		
		System.out.println("Enter Two Numbers:");
		float num1 = in.nextFloat();
		float num2 = in.nextFloat();
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		float choice = in.nextFloat();
		
		if(choice >= 1  && choice <= 4) {
			if (choice == 1) {
				System.out.println("Addition is :" +(num1 + num2));
			}else if (choice == 2) {
				System.out.println("Subtraction is :" +(num1 - num2));
			}else if (choice == 3) {
				System.out.println("Multiplication is :" +(num1 * num2));
			}else {
				System.out.println("Division is :" +(num1 / num2));
			}
		}else {
		System.out.println("Invalid Choice!");
		}
	}
}
