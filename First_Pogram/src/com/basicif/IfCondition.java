package com.basicif;
import java.util.Scanner;

public class IfCondition {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter value of a and b : ");
		System.out.println("Enter a: ");
		int a = in.nextInt();
		System.out.println("Enter b: ");
		int b = in.nextInt();
		
		
		if(a>b) {
			System.out.println( a + " is Greater than " + b);
		}
		else {
			System.out.println( a + " is less than " + b );
		}
	} 
}
