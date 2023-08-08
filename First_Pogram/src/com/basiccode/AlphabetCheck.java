//Write a Java program to input any character and check whether
//it is alphabet, digit or special character
package com.basiccode;
import java.util.Scanner;
public class AlphabetCheck {
	public static void main(String args[]) {
		 
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Character Check Program....");
		
		System.out.println("Enter Character:");
		char ch = in.next().charAt(0);
		
		if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9' || ch == '!' || ch == '@' 
				|| ch == '#' || ch == '$' || ch == '&' ) {
			if(ch >= 'a' && ch <= 'z') {
				System.out.println("This is Alphabet..");
			}else if(ch >= '0' && ch <= '9' ) {
				System.out.println("This is Number..");
			}else {
				System.out.println("This is Special Character..");
			}
		}
	}
}
