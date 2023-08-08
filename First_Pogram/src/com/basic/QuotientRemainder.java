package com.basic;
import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		
		System.out.println("Find the Quotient And Remainder :- ");
		
		 Scanner in = new Scanner(System.in);
		 
		System.out.println("Enter the Dividend Value: ");
		int dividend = in.nextInt();
		System.out.println("Enter the Divisor Value: ");
		int divisor = in.nextInt();
		
		
		int quotient = dividend /divisor;
		int remaainder = dividend % divisor;
		
		System.out.println("Quotient of " + dividend + " and " + divisor + " is " + quotient + ".");
		System.out.println("Remainder of " + dividend + " and " + divisor + " is " + remaainder + ".");
		
	}

}
