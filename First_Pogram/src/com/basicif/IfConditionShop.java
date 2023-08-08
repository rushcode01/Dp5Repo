package com.basicif;
import java.util.Scanner;
public class IfConditionShop {

	/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
	Suppose, one unit will cost 100.
	Judge and print total cost for user*/

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Your name: ");
		String name = in.next();

		System.out.println("Enter Cost of item: ");
		int itemCost = in.nextInt();
		
		System.out.println("Enter No. of Items: ");
		int items = in.nextInt();
		
		int cost = itemCost * items;
	
		
		float discount = cost - (cost/10);
		
		if (cost >1000) {
			System.out.println("Congratulation " + name +  " You get 10% Discount. Your Bill is " + discount);
		}
		else {
			System.out.println("Your bill is: " + cost + "," + "Visit Again...");
		}

	}

}
