package com.basiccode;
import java.util.Scanner;

public class AlphaVowel {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Alphabet:");
		
		char ch = in.next().charAt(0);
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
			System.out.println("Alphabet is vowel..");
		}else {
			System.out.println("Alphabet is Consonant..");
		}
	}
}
