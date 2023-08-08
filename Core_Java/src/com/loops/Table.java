package com.loops;
import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number and get Table ");
		
		int num = in.nextInt();
		int i;
		for (i = 0; i <= 10; i++) {
			
			System.out.println(num + " * " + i + " = " + (num*i) );
		}
		
	}
}
