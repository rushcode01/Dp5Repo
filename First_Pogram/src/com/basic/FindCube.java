package com.basic;
import java.util.Scanner;

public class FindCube {
    
	public static void main(String args[]) {
		
		System.out.println("FInd the Cube of Numbers");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		
		int cube = num * num * num;
		
		System.out.println("Cube of " + num +" is " + cube);
		
		
		
	}
}
