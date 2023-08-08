package com.arraysBasic;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
	
		
	
		char ch[] = { 'a', 'b', 'c', 'd', 'e', 'f' };

		int len = ch.length, i;

		System.out.println("Length of ch : " + len);
		System.out.println("First Element of ch : " + ch[0]);
		System.out.println("last element of ch : " + ch[len - 1]);
		System.out.println("LAst element of index no : " + (len - 1));

		for (i = 0; i < len; i++) {
			System.out.println("Elements os ch at " + i + ":" + ch[i]);
		}
	}
}
