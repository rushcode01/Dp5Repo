package com.switchs;

import java.util.*;

public class Vowel {
	public static void main(AreaOf[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Alphabet:");
		char ch = in.next().charAt(0);

		switch (ch) {

		case 'a', 'A':
			System.out.println("Vowel");
			break;
		case 'e', 'E':
			System.out.println("Vowel");
			break;
		case 'i','I':
			System.out.println("VoWel");
		break;
		case 'o','O':
			System.out.println("Vowel");
		break;
		case 'u','U':
			System.out.println("Vowel");
		break;
		default:
			System.out.println("Consonent");
		}
	}
}
