/*A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
*/
package com.basicif;
import java.util.Scanner;
public class IfConditionSchool {

	public static void main(String[] args) {
		
		System.out.println("Sharda International School");
		System.out.println("Academic Year 2022 - 23");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your Marks: ");
		
		int mark = in.nextInt();
		
		if (mark > 80) {
			System.out.println("Congratulations..!, Your Pass with Grade A.");
		}
		else if(mark > 60 && mark < 80){
			System.out.println("Congratulations..!, Your Pass with Grade B.");
		}
		else if(mark > 50 && mark < 60){
			System.out.println("Your Pass with Grade C.");
		}
		else if(mark > 45 && mark < 50){
			System.out.println("Your Pass with Grade D. ");
		}
		else if(mark > 25 && mark < 45){
			System.out.println("Your Pass with Grade E. ");
		}
		else if(mark <= 25){
			System.out.println("Your Fail with Grade F ");
		}
	}
}
