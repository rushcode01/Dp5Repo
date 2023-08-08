/*A student will not be allowed to sit in exam if his/her attendance is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/
package com.basicif;
import java.util.Scanner;
public class IfConditionExam {

	public static void main(String[] args) {
		
		System.out.println("Sharda School Exam Section");

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		
		String name = in.nextLine();
		
		System.out.println("Enter the Number of Classes Held:");
		
		float held = in.nextFloat();
		
		System.out.println("Enter the Number of Classes Attendeed:");
		
		float atten = in.nextFloat();
	
		float perattent = (atten / held) *100;
		
		if (perattent >= 75) {
			System.out.println(name +" Your Allow to sit in Exam. " + "You have " + perattent + "% attendance.");
		}
		else {
			System.out.println(name +" Your Not Allow to sit in Exam. " +"You have " + perattent + "% attendance.");
		}
	}

}
