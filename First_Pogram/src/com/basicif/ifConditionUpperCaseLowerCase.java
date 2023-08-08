
//Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).


package com.basicif;
import java.util.Scanner;
public class ifConditionUpperCaseLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Character:-");
		char ch = in.next().charAt(0);
		
		if(ch >= 'a' && ch <= 'z') {
			
			System.out.println("Character is LowerCase");
			
		}
		else {
			System.out.println("Character is UpperCase");
		}
		
	}

}
