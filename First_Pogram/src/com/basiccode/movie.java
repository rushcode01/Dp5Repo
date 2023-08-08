package com.basiccode;
import java.util.Scanner;
public class movie {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to City Pride Multiplex");
		
		System.out.println("Enter Your Name:");
		String name = in.next();
		
		System.out.println("Enter Movie Name:");
		String movie = in.next();
		
		
		System.out.println("Enter the no of Pizzas:");
		int pizza = in.nextInt();
		pizza = pizza * 100;
		
		System.out.println("Enter the no of Puffs:");
		int puffs = in.nextInt();
		puffs = puffs * 20;
		
		System.out.println("Enter the no of Cooldrink:");
		int cooldrink = in.nextInt();
        cooldrink = cooldrink * 10;
        
        double total = pizza + puffs + cooldrink + 350;
        
        
        System.out.println("You have Coupon Code:");
        String disc = in.next();
        
        System.out.println("Enter code:");
        int code = in.nextInt();
        
        
        if (disc .equals("yes")) {
        	if(code == 100) {
        		double disc100 = total - (total* 0.1);
        		System.out.println("Your Bill After Discount:" + disc100);
        	}if(code == 200) {
        		double disc200 = total - (total* 0.2 );
        		System.out.println("Your Bill After Discount:" + disc200);
        	}
        	
        }else {
        	System.out.println(" Your bill is :" + total);
        }
   
        System.out.println("ENJOY THE SHOW!!! " + name);
        
        
	}

}
