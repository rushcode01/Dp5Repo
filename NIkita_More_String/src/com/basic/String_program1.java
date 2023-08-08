// computer is fun
// fun is computer
package com.basic;

public class String_program1 {
	public static void printpattern(String s) {
		int len = s.length();
		s = s + "";
		String str2 = "", str3 = "";
		char ch;
		for (int i = 0; i < len; i++) {

			ch = s.charAt(i);
			if (ch != ' ') {
				str2 = str2 + ch;
			} else {
				str3 = str2 + " " + str3;
				str2 = "";
			}
		}
		System.out.println(str3);
	}

	public static void printpattern2(String s) {
		int i, len = s.length();
		String srr[] = s.split(" ");
//		String newStr = "";
		for (i = len-1 ; i >= 0; i--) {
			 
			 System.out.println(srr[i] + " ");
			
		}
	}

	public static void main(String[] args) {
		String str = "computer is fun";
//		printpattern(str);
		printpattern2(str);
	}
}
