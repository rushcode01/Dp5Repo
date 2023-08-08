//Write a Java program to input basic salary of an employee and calculate its
//Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%,
//DA = 90% Basic Salary >20000 : HRA = 30%, DA = 95%
package com.basiccode;
import java.util.Scanner;
public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Gross Salary Calculate...");
		
		System.out.println("Enter Your Name:");
		String name = in.next();
		
		System.out.println("Enter Your Basic Salary:");
		int basic = in.nextInt();
		
		if(basic <= 10000) {
			System.out.println("Gross Salary of " + name + " is " + (basic + (basic * 0.20)+ (basic * 0.80)));
		}else if(basic <= 20000) {
			System.out.println("Gross Salary of " + name + " is " + (basic + (basic * 0.25)+ (basic * 0.90)));
		}else {
			System.out.println("Gross Salary of " + name + " is " + (basic + (basic * 0.30)+ (basic * 0.95)));
		}
	}
}
