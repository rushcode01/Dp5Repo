/* company decided to give bonus of 5% to employee 
 * if his/her year of service is more than 5 years.
Ask user for their salary and year of service and 
print the net bonus amount.
*/
package com.basicif;
import java.util.Scanner;
public class IfConditionCompany {

	public static void main(String[] args) {
		System.out.println("Welcome to Shree Industries Pvt. Ltd.. ");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your Name:");
		char name = in.next().charAt(0);
		
		System.out.println("How many years you work here:- ");
		float year = in.nextFloat();
		
		System.out.println("Enter your Salary in LPA");
		double salary = in.nextDouble();
		
		double bonus = (0.05) * salary  ;
		
		System.out.println("Congratulations...! "+ "You work here from Last " + year );
		
		if(year >= 5) {
			System.out.println("You will get a " + bonus + " Bonus.");
		}
		
		 
		
	}
}
