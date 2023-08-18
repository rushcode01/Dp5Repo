//22.	WAP of swap two elements in an ArrayList
package com.Assignment;

import java.util.*;

public class Swaptwoelements {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Sham");
		list.add("Hari");
		list.add("Om");
		list.add("Shree");
		list.add("Krish");
		list.add("Ganesh");
		list.add("Vinayak");

		System.out.println("-----Original-----");
		for (String s : list) {
			System.out.print(s + " ");
		}

		String temp = list.get(0);
		String temp2 = list.get(1);

		list.set(1, temp);
		list.set(0, temp2);

		System.out.println("\n-----Swap-----");
		for (String s : list) {
			System.out.print(s + " ");
		}

	}
}
