package com.whileloop;

public class Factorial {
	public static void main(String[] args) {

		int fact = 1;
		int i = 1;
		int sum = 0;
		while (i <= 5) {
			fact = fact * i;
			sum = sum + fact;
			i++;
		}
		System.out.println("Factotail of 1!+2!+3!+4!+5! is " + fact + " and Sum is  " + sum);
	}
}
