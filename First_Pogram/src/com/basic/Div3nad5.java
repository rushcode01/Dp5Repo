package com.basic;
import java.util.Scanner;
public class Div3nad5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		
		int num = in.nextInt();
		
		if (num%3 == 0 && num%5 == 0) {
			System.out.println("Welcome..");
		}else if (num%3 == 0) {
			System.out.println("Hi..");
		}else if(num%5 == 0) {
			System.out.println("Hello..");
		}else {
			System.out.println("Not Div BY 3 or 5");
		}
	}


}

