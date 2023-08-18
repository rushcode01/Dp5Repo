//14.	WAP to search an element from ArrayList
//15.	WAP to search the specified collection in this collection
package com.Assignment;

import java.util.ArrayList;

public class SearchElementInArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Ram");
		list.add("Sham");
		list.add("hari");
		list.add("Om");
		list.add("Krish");

		ArrayList<String> list2 = new ArrayList<String>();

		list2.add("Ram");
		list2.add("Sham");
		list2.add("hari");

		System.out.println("-----Sreach element in ArrayList----------");
		System.out.println(list.contains("hari"));
		System.out.println(list.contains("shree"));

		System.out.println("-----specified collection in this collection----------");
		System.out.println(list);
		System.out.println(list2);
		if (list.containsAll(list2)) {
			System.out.println("yes list1 has contains list2 ");
		}
	}
}
