//1.	WAP to add elements to arraylist without using generics (no <>) and 
//print content of it where Integer is used. In second arraylist String is used.
package com.Assignment;

import java.util.ArrayList;

public class WithoutGenerics1 {
	public static void main(String[] args) {
		ArrayList intlist = new ArrayList();

		intlist.add(15);
		intlist.add(21);
		intlist.add(98);
		intlist.add(77);
		System.out.println("--------Integer List-----------");
		for (int i = 0; i < intlist.size(); i++) {
			System.out.println(intlist.get(i));
		}
		ArrayList strlist = new ArrayList();

		strlist.add("Ram");
		strlist.add("Sham");
		strlist.add("Krish");
		strlist.add("Om");

		System.out.println("--------String List-----------");
		for (int i = 0; i < strlist.size(); i++) {
			System.out.println(strlist.get(i));
		}
	}
}
