package com.ternary;

import java.util.*;

public class OddEven {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number:");

		int num = in.nextInt();
        
		String ans = (num%2 ==0)? "Number is Even": "Number id Odd"; 
		System.out.println(ans);
	}
}
