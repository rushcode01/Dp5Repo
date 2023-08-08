//Create a base class to get two numbers from user in the base class. 
//The derived class contains a method ‘dispMax()’. Which displays maximum of two 
//numbers and a method ‘dispMin()’ to display minimum of two numbers. Use constructors.
package com.inharitanceAssignment;

import java.util.Scanner;

class Base {
	int num1;
	int num2;

	public Base(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
}

class Derive extends Base {

	public Derive(int num1, int num2) {
		super(num1, num2);
	}

	public void disMax(int num1, int num2) {
		if (this.num1 > this.num2) {
			System.out.println(num1 + " is maximum");
		} else {
			System.out.println(num2 + " is maximum");
		}
	}

	public void disMin(int num1, int num2) {
		if (this.num1 > this.num2) {
			System.out.println(num2 + " is minmum");
		} else {
			System.out.println(num1 + " is minmum");
		}
	}

	public String toString() {
		return "Num1\t:" + num1 + "\nNum2\t:" + num2;
	}
}

public class Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int num2 = sc.nextInt();
		Derive b1 = new Derive(num1, num2);
		System.out.println(b1);
		System.out.println("--------------");
		b1.disMax(num1, num2);
		b1.disMin(num1, num2);
        sc.close();
	}
}
