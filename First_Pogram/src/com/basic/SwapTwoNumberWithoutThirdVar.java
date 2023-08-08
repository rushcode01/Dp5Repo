package com.basic;
import java.util.Scanner;


public class SwapTwoNumberWithoutThirdVar {
	
	public static void main(String args[]) {
		
		System.out.println("Swap Two Number Without Using Third Variable,");

		Scanner in = new Scanner(System.in);
		    
		
		System.out.println("Enter First Number: ");
		int num1 = in.nextInt();
		System.out.println("Enter Second Number: ");
	    int num2 = in.nextInt();
	    
	    num1 = num1 + num2;
	    num2 = num1 - num2;
	    num1 = num1 - num2;
	    
	    System.out.println("Numbers After Swap is : ");
	    System.out.println("First Number is: " + num1);
	    System.out.println("Second Number is: " + num2);
	}
}
