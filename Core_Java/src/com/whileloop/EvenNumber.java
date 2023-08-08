package com.whileloop;

import java.util.*;

public class EvenNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		
		int num = in.nextInt();
		int i = 1;
		int sum = 0;
		while(i<= num) {
			if(i % 2 == 0) {
				sum += i; 
			}
			i++;
		}
		System.out.println(sum);
	}
}
