//10.	WAP to join two ArrayLists
package com.Assignment2;

import java.util.ArrayList;

public class JoinToArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Sham");
		list.add("Hari");
		list.add("Om");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Shree");
		list2.add("Krish");
		list2.add("Ganesh");
		list2.add("Vinayak");

		list.addAll(list2);

		System.out.println(list);

	}
}
