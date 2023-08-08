
package com.switchs;
import java.util.*;
import java.lang.*;
public class SalaryAsPer {

	public static void main(AreaOf[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Your Experiance: \n 1. Beginner \n 2. Intermediate \n 3. Expert");
		java.lang.String exp = in.next();
		
		switch(exp) {
		case "Beginner":
			System.out.println("Your Salary is 200000");
			break;
		case "Intermediate":
			System.out.println("Your Salary is 300000");
			break;
		case "Expert":
			System.out.println("Your Salary is 500000");
			
		}
	}

}
