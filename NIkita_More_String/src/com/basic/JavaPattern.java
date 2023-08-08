//print pattern 
//j
//j a
//j a v
//j a v a

package com.basic;

import java.util.Scanner;

public class JavaPattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = in.next();
		String str = " ";
		for (int i = 0; i < s.length(); i++) {
			str += s.charAt(i) + " ";
			System.out.println(str);
		}

	}
}
