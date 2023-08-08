package com.whileloop;

import java.util.*;

public class Palindrom {
	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter Number:");
      int num = in.nextInt();
      int temp = num;
      int rev = 0 ;
      
      while(num > 0) {
    	  int digit = num % 10;
    	  rev = rev*10 + digit;
    	  num = num /10;
      }
      num = temp;
      
      if(num == rev) {
    	  System.out.println("Palindrom..!");
      }else {
    	  System.out.println("Not Palindrom...!");
      }
	}
}
