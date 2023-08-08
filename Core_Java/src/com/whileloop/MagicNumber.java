package com.whileloop;

import java.util.*;

public class MagicNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random ran = new Random();
		int magic = ran.nextInt(100);
//		System.out.println(magic);
		System.out.println("Guess the Number..");
		
		while(true) {
			System.out.println("Enter the Number:");
			int num = in.nextInt();
			
			if(num > magic) {
				System.out.println("Your Greater Than magic Number");
				continue;
			}else if(num < magic) {
				System.out.println("Your Less Than magic Number");
				continue;
			}else {
				System.out.println("Congratulation...!, Your Guess is Right");
				break;
			}
		}
	}

}
