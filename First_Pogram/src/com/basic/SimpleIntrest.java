package com.basic;
import java.util.Scanner;
public class SimpleIntrest {

	public static void main(String atgs[]) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("To Find Simple Interest:");

		System.out.println("Enter (p) Principal:");
		float p = in.nextFloat();
		System.out.println("Enter (r) Interest rate (in percentage):");
		float r = in.nextFloat();
		System.out.println("Enter (t) Time duration (in years):");
		float t = in.nextFloat();
		
		float si = (p * r *t)/ 100;
		
		System.out.println("Simple Interest:" + si);
	}
}
