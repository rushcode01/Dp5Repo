package com.basiccode;
import java.util.Scanner;
public class MaxBet3Number {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Numbers:");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 +" is greater than " + num2 + " & " + num3);
		}else if(num2 > num1 && num2> num3) {
			System.out.println(num2 +" is greater than " + num1 + " & " + num3);
			
		}else {
			System.out.println(num3 +" is greater than " + num1 + " & " + num2);
		}
	}
}
