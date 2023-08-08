/*WAP in java using switch case for following: Area of a circle Area of
 *  a square Area of a right angled triangle Area of a rectangle Circumference of a 
 * circle Perimeter of a square Accept inputs like radius,side,etc through keyboard.
//Menu driven program using switch case:
*/

package com.switchs;

import java.util.*;

public class AreaOf {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		System.out.println("Program for Finding the Areas of followings:");

		System.out.println(
				"1.Area of a circle \n2.Area of a square \n3.Area of a right angled triangle \n4.Area of a rectangle "
						+ "\n5.Circumference of a circle \n6.Perimeter of a square");
		System.out.println("Enter Your Choice:");

		int choice = in.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter r (Radius):");
			float r = in.nextFloat();
			System.out.println("Area of Circle is : " + (3.14 * r * r));
			break;
		case 2:
			System.out.println("Enter s (side):");
			float s = in.nextFloat();
			System.out.println("Area of a square is : " + (s * s));
			break;
		case 3:
			System.out.println("Enter b (Base) and p (Perpendicular) :");
			float b = in.nextFloat();
			float p = in.nextFloat();
			System.out.println("Area of a right angled triangle is : " + ((b * p) / 2));
			break;
		case 4:
			System.out.println("Enter l (Length) and w (Width) :");
			float l = in.nextFloat();
			float w = in.nextFloat();
			System.out.println("Area of a rectangle is : " + (l * w));
			break;
		case 5:
			System.out.println("Enter R (Radius):");
			float R = in.nextFloat();
			System.out.println("Circumference of a circle is : " + (2 * 3.14 * R));
			break;
		case 6:
			System.out.println("Enter a (side):");
			float a = in.nextFloat();
			System.out.println("Perimeter of a square is : " + (4 * a));
			break;
		default:
			System.out.println("Enter Valid Input..!");

		}
	}
}
