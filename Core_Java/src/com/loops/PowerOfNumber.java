package com.loops;

import java.util.*;

public class PowerOfNumber {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Base:");
		int base = in.nextInt();
		
		System.out.println("Enter the Expo.: ");
		int expo = in.nextInt();
		
		int power = 1; 
		int i ;
		for(i = 1 ; i <= expo; i++ ) {
			power = power * base;
		}
		System.out.println("Power: " + power);
	}
}
