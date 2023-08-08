package com.loops;
import java.util.*;
public class SumofFactor {
	public static void main(String[] args) {
		System.out.println("To find the Factor of Given Number");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number:");
		
		int num = in.nextInt() ;
		int sum = 0;
		int i ;
		
		for (i = 1; i <= num ; i++) {
			if ( num % i == 0) {
				sum = sum + i;
				System.out.print(i + " ");
			}
		}System.out.println(sum);
	}
}
