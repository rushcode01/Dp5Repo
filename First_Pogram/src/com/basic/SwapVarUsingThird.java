package com.basic;
import java.util.Scanner;


public class SwapVarUsingThird {
	
	public static void main(String args[]) {

	Scanner in = new Scanner(System.in);
    
	System.out.println("Swap Two Numbers using Third Variable");
	
	System.out.println("Enter First Number : ");
	int num1 = in.nextInt();
	System.out.println("Enter Second Number : ");
	int num2 = in.nextInt();
	int num3 ;
	
	num3 = num1;
	num1 = num2;
	num2 = num3;
	
	System.out.println("Number After Swap is:");
	System.out.println("First Number is :" + num1);
	System.out.println("Second Number is :" + num2);

	
	}

}
