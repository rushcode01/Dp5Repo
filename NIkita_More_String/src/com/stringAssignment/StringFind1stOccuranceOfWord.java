package com.stringAssignment;

public class StringFind1stOccuranceOfWord {
	public static void find1stOccuranceOfWord(String str) {

		int index = str.indexOf("my");
		System.out.println(str);
		System.out.println("---------------------------------");
		System.out.println("1st occurance of 'my' is " + index);
	}

	public static void main(String[] args) {

		String s = "i scorched the earth with my talent and i let my light shine.";

		find1stOccuranceOfWord(s);
	}
}
