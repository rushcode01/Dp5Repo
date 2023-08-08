package com.switchs;

import java.util.*;

public class OddEven {
	public static void main(AreaOf[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Number:");
		int num = in.nextInt();
		num = (num%2);
		
	    switch (num) {
	    case 0:
	    	System.out.println("Number is Even");
	    	break;
	    	default: 
	    		System.out.println("Number id odd");
	    }
	}
}
