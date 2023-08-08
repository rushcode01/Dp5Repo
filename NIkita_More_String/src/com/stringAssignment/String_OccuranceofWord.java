//Write a Java program to search all occurrences of a word in given string. 
package com.stringAssignment;


public class String_OccuranceofWord {
	public static void findWordcount(String s) {
		int count = 0;
		String st[] = s.split(" ");
		for (String str : st ) {
			for(int i= 0; i< st.length; i++) {
				
			if(st.equals(s) ) {
				count++;
			}
				
			}
			System.out.println(str);
		}
		System.out.println("my : " + count);
		
	}

	public static void main(String[] args) {
		String s = "i scorched the earth with my talent and i let my light shine";
		findWordcount(s);

	}
}
