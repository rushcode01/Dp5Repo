package com.loopAssignment;

import java.util.*;

public class Tableof {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Number for print Table");
		int n = in.nextInt();
		
		int i;
		for(i = 1; i<=10; i++) {
			System.out.println(n + " x " + i + " = " + (i * n));
		}
	    	
	}
}
