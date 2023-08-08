//write a program that takes a number as input from user. The key number is 4 and the user 
//enters single digit numbers. Ask the user for a number till he gets the correct answer. 
//Then display the number of tries it took to guess the correct number


package com.Assignment;

import java.util.*;

public class MatchNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int key = 4;
//		System.out.println(magic);
		System.out.println("Guess the Number..");
		int count = 0;
		while (true) {
			System.out.println("Enter the Number:");
			int num = in.nextInt();

			if (num > key) {
				System.out.println("Your Greater Than Key Number");
				count++;
				continue;
			} else if (num < key) {
				System.out.println("Your Less Than Key Number");
				count++;
				continue;
			} else {
				System.out.println("Congratulation...!, Your Guess is Right");
				
				break;
			}
		}
		System.out.println("You took "+ count + " tries.");
	}
}
