package com.loops;

import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number for to find out Factorial");
		
		int num = in.nextInt();
		int fact = 1;
		int i ;
		for(i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + num + "! is "+ fact);
	}
}
