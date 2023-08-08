package com.basicif;
import java.util.Scanner;
public class IfConditionSquare {
	public static void main(String args[]) {
		
		
		System.out.println("Take length and breadth and find it is square or not");
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter the Length:- ");
		
		float length = in.nextFloat();
		
		System.out.println("Enter the Breadth:- ");
		
		float  breadth = in.nextFloat();
		
		if (length == breadth) {
			System.out.println("This is A Square.");
		}
		else {
			System.out.println();
		}
	}
}
