package com.ternary;
import java.util.*;
public class Div5 {
	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.println("Enter number:");
		 
		 int num = in.nextInt();
		 
		 String ans = (num %5 == 0 )?"Div by 5":"Not Div by 5";
		 System.out.println(ans);
	}
}
