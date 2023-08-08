package com.basiccode;
import java.util.Scanner;
public class Div5and11 {
	public static void main(String args[]) {
		
	 Scanner in = new Scanner(System.in);
	 
	 System.out.println("Enter Number:");
	 
	 int num = in.nextInt();
	 
	 if(num%5 == 0 && num%11 == 0) {
		 System.out.println("Yes it Div by both 5 & 11");
	 }else if(num%5 == 0) {
		 System.out.println("yes it Div by 5");
	 }else if(num%11 == 0) {
		 System.out.println("Yes it Div by 11");
	 }
	}
}
