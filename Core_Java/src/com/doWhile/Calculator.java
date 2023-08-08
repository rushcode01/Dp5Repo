package com.doWhile;
import java.util.*;
public class Calculator {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int choice ;
	int ch;
	System.out.println("Enter Your Number one:");
	int num1 = in.nextInt();		
	System.out.println("Enter Your Number Two:");
	int num2 = in.nextInt();
	do {
		System.out.println("1.Addition \n2.Substration \n3.Multiplication \n4.Division");
		System.out.println("Enter Your Choice:");
		 choice =in.nextInt();
		
		
		switch(choice) {
		case 1:
			System.out.println("Addition of "+ num1 + " and " + num2 + " = "+(num1+num2));
			break;
		case 2 :
			System.out.println("Substraction of "+ num1 + " and " + num2 + " = "+(num1-num2));
		break;
		case 4  :
			System.out.println("Division of "+ num1 + " and " + num2 + " = "+(num1/num2));
		break;
		case 3 :
			System.out.println("Multiplication of "+ num1 + " and " + num2 + " = "+(num1*num2));
		break;
		}
		System.out.println("Do You Want to Continue...");
		ch = in.next().charAt(0);
	}while(ch == 'y'||ch=='Y');
}
}
