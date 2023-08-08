//Write a Java program to convert lowercase string to lowercase. 
//Write a Java program to convert lowercase string to lowercase. 

package com.stringAssignment;

public class StringCOnvertLowerCasetoUppercase {
	public static void converttoUpperCase(String str) {
		int i, len = str.length();

		str = str.toUpperCase();
		for (i = 0; i < len; i++) {
			System.out.print(str.charAt(i));
		}
	}

	public static void converttoLowerCase(String str) {

		int i, len = str.length();

		str = str.toLowerCase();
		for (i = 0; i < len; i++) {

			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		String s = "i scorched the earth with my talent and i let my light shine.";

		System.out.println("---------------original String----------------------------");
		System.out.println(s);
		System.out.println("\n-----------------------------UpperCase--------------------------");
		converttoUpperCase(s);
		System.out.println("\n-------------------------------lowerCase----------------------");
		converttoLowerCase(s);

	}
}
