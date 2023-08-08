package com.doWhile;

import java.util.*;

public class CalculateArea {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Calcutate the Area:-");
		int choice;
		char ch;
		do {
			System.out.println("1.Area of Circle \n2.Area of Square \n3.Area of Traingle");
			System.out.println("Enter Your Choice:");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter R ");
				int R = in.nextInt();
				System.out.println("Area of Circle is: " + (3.14 * R * R));
				break;
			case 2:
				System.out.println("Enter a(Side): ");
				int a = in.nextInt();
				System.out.println("Area of Square is: " + (a * a));
				break;
			case 3:
				System.out.println("Enter h(height), b(base) ");
				int h = in.nextInt();
				int b = in.nextInt();
				System.out.println("Area of Traingle is: " + (0.5 * h * b));
				break;
			}
			System.out.println("Do You want to Continue...");
			ch = in.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
	}
}
