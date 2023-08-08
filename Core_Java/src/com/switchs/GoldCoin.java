//Each birthday, Meenu’s parents gift her gold coins. On her 1st birthday she got one coin from them,
//2nd birthday 8 coins, 
//3rd birthday 27 coins, 4th birthday 64 coins, 5th birthday 125 coins and so on. 
//Meenu is now 10 years old. Given her age, help her calculate how many coins she can get for that birthday.


package com.switchs;

import java.util.*;

public class GoldCoin {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Your Age:");
		
		int age = in.nextInt();
		
		switch(age) {
		case 1 :
			System.out.println("You get " + (1*1*1)  + " Coins" );
			break;
		case 2 :
			System.out.println("You get " + (2*2*2)  + " Coins" );
			break;
		case 3 :
			System.out.println("You get " + (3*3*3)  + " Coins" );
			break;
		case 4 :
			System.out.println("You get " + (4*4*4)  + " Coins" );
			break;
		case 5 :
			System.out.println("You get " + (5*5*5)  + " Coins" );
			break;
		case 6 :
			System.out.println("You get " + (6*6*6)  + " Coins" );
			break;
		case 7 :
			System.out.println("You get " + (7*7*7)  + " Coins" );
			break;
		case 8 :
			System.out.println("You get " + (8*8*8)  + " Coins" );
			break;
		case 9 :
			System.out.println("You get " + (9*9*9)  + " Coins" );
			break;
		case 10 :
			System.out.println("You get " + (10*10*10)  + " Coins" );
			break;
			
			
		}
	}
}
